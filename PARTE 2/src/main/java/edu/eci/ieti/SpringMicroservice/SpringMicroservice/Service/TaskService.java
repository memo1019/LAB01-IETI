package edu.eci.ieti.SpringMicroservice.SpringMicroservice.Service;

import edu.eci.ieti.SpringMicroservice.SpringMicroservice.data.TaskData;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface TaskService
{
    TaskData create( TaskData task );

    TaskData findById( String id );

    List<TaskData> all();

    void deleteById( String id );

    TaskData update( TaskData task, String id );
}
