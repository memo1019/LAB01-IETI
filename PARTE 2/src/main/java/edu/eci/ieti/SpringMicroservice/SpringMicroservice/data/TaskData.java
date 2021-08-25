package edu.eci.ieti.SpringMicroservice.SpringMicroservice.data;

import edu.eci.ieti.SpringMicroservice.SpringMicroservice.Status.Status;

import java.util.Date;

public class TaskData {
    String id;

    String name;
    String description ;
    Status status;
    String assignedTo;
    Date dueDate;
    String created;

    public TaskData(String id, String description, String name, Status status, String assignedTo, Date dueDate,String created){
        this.id=id;
        this.name=name;
        this.description = description;
        this.status = status;
        this.assignedTo=assignedTo;
        this.dueDate = dueDate;
        this.created = created;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Status getStatus() {
        return status;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public String getCreated() {
        return created;
    }
}
