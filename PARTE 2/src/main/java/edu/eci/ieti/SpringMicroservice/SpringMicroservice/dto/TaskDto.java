package edu.eci.ieti.SpringMicroservice.SpringMicroservice.dto;

import edu.eci.ieti.SpringMicroservice.SpringMicroservice.Status.Status;

import java.util.Date;

public class TaskDto {
    String name ;
    String description ;
    Status status;
    String assignedTo;
    Date dueDate;
    String created;
    public TaskDto(String name , String description, Status status, String assignedTo,Date dueDate,String created){
        this.name=name;
        this.description = description;
        this.status = status;
        this.assignedTo=assignedTo;
        this.dueDate = dueDate;
        this.created = created;

    }

}
