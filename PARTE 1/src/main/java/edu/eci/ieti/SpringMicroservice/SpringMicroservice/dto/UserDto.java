package edu.eci.ieti.SpringMicroservice.SpringMicroservice.dto;

public class UserDto {
    String name ;
    String email ;
    String lastName ;
    public UserDto(String name ,String email,String lastName){
        this.name=name;
        this.email = email;
        this.lastName = lastName;
    }

}
