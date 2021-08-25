package edu.eci.ieti.SpringMicroservice.SpringMicroservice.Service;

import edu.eci.ieti.SpringMicroservice.SpringMicroservice.data.UserData;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    UserData create(UserData user );

    UserData findById( String id );

    List<UserData> all();

    void deleteById( String id );

    UserData update( UserData user, String userId );
}
