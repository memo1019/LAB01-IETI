package edu.eci.ieti.SpringMicroservice.SpringMicroservice.Controller;

import edu.eci.ieti.SpringMicroservice.SpringMicroservice.Service.TaskService;
import edu.eci.ieti.SpringMicroservice.SpringMicroservice.data.TaskData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping( "/v1/task" )
public class TaskController {
    private final TaskService taskService;
    public TaskController(@Autowired TaskService taskService) {
        this.taskService=taskService;
    }
    @GetMapping
    public ResponseEntity<TaskData>findById(@PathVariable String id ){
        return new ResponseEntity<>(taskService.findById(id), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<TaskData>>all(){
        return new ResponseEntity<>(taskService.all(),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<TaskData> create( @RequestBody TaskData taskDto )
    {
        return new ResponseEntity<>(taskService.create(taskDto), HttpStatus.ACCEPTED);
    }

    @PutMapping( "/{id}" )
    public ResponseEntity<TaskData> update( @RequestBody TaskData taskDto, @PathVariable String id )
    {
        return new ResponseEntity<>(taskService.update(taskDto,id), HttpStatus.ACCEPTED);
    }

    @DeleteMapping( "/{id}" )
    public ResponseEntity<Boolean> delete( @PathVariable String id )
    {
        taskService.deleteById(id);
        boolean result = false;
        if(taskService.findById(id)==null){
            result = true;
        }
        return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
    }

}
