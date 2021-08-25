package edu.eci.ieti.SpringMicroservice.SpringMicroservice.data;

public class UserData {
    private final String id;

    private final String name;
    private final String email;
    private final String LastName;
    private final String createdAt;

    public UserData(String id,String email, String name,String LastName,String createdAt){
        this.id=id;
        this.name=name;
        this.email=email;
        this.LastName=LastName;
        this.createdAt=createdAt;

    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return LastName;
    }

    public String getCreatedAt() {
        return createdAt;
    }

 }
