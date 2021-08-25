package edu.eci.ieti.SpringMicroservice.SpringMicroservice.Service.impl;

import edu.eci.ieti.SpringMicroservice.SpringMicroservice.Service.TaskService;
import edu.eci.ieti.SpringMicroservice.SpringMicroservice.data.TaskData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class TaskServiceHashMap implements TaskService {
    private final HashMap<String, TaskData> HashmapUsers = new HashMap<>();

    @Override
    public TaskData create(TaskData user) {
        HashmapUsers.put(user.getId(),user);
        return user;
    }

    @Override
    public TaskData findById(String id) {
        return HashmapUsers.get(id);
    }

    @Override
    public List<TaskData> all() {
        return new ArrayList<>(HashmapUsers.values());
    }

    @Override
    public void deleteById(String id) {
        HashmapUsers.remove(id);
    }
    @Override
    public TaskData update(TaskData user, String userId) {
        return HashmapUsers.replace(userId,user);
    }
}
