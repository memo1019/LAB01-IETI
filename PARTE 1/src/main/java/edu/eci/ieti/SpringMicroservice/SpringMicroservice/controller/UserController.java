package edu.eci.ieti.SpringMicroservice.SpringMicroservice.controller;

import edu.eci.ieti.SpringMicroservice.SpringMicroservice.Service.UserService;
import edu.eci.ieti.SpringMicroservice.SpringMicroservice.data.UserData;
import edu.eci.ieti.SpringMicroservice.SpringMicroservice.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.*;

@RestController
@RequestMapping( "/v1/user" )
public class UserController
{
    private final UserService userService;

    public UserController(@Autowired UserService userService )
    {
        this.userService = userService;
    }


    @GetMapping
    public ResponseEntity<List<UserData>> all()
    {
        return new ResponseEntity<>(userService.all(), HttpStatus.OK);
    }

    @GetMapping( "/{id}" )
    public ResponseEntity<UserData> findById( @PathVariable String id )
    {

        return new ResponseEntity<>(userService.findById(id), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<UserData> create( @RequestBody UserData userDto )
    {
        return new ResponseEntity<>(userService.create(userDto), HttpStatus.CREATED);
    }

    @PutMapping( "/{id}" )
    public ResponseEntity<UserData> update( @RequestBody UserData userDto, @PathVariable String id )
    {
        return new ResponseEntity<>(userService.update(userDto,id), HttpStatus.ACCEPTED);
    }

    @DeleteMapping( "/{id}" )
    public ResponseEntity<Boolean> delete( @PathVariable String id )
    {
        userService.deleteById(id);
        boolean result = false;
        if(userService.findById(id)==null){
            result = true;
        }
        return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
    }
}
