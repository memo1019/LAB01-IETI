package edu.eci.ieti.SpringMicroservice.SpringMicroservice.Service.impl;

import edu.eci.ieti.SpringMicroservice.SpringMicroservice.Service.UserService;
import edu.eci.ieti.SpringMicroservice.SpringMicroservice.data.UserData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceHashMap implements UserService {
    private final HashMap<String, UserData> HashmapUsers = new HashMap<>();

    @Override
    public UserData create(UserData user) {
        HashmapUsers.put(user.getId(),user);
        return user;
    }

    @Override
    public UserData findById(String id) {
        return HashmapUsers.get(id);
    }

    @Override
    public List<UserData> all() {
        return new ArrayList<>(HashmapUsers.values());
    }

    @Override
    public void deleteById(String id) {
        HashmapUsers.remove(id);
    }
    @Override
    public UserData update(UserData user, String userId) {
        return HashmapUsers.replace(userId,user);
    }
}
