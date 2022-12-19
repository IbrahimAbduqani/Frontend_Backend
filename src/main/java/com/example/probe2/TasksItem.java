package com.example.probe2;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
public class TasksItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;


    private String description;


    private boolean complete;


    private Instant createdDate;


    private Instant modifiedDate;

    private String category;

    public TasksItem() {}

    public TasksItem(String description, String category) {
        this.description = description;
        this.complete = false;
        this.createdDate = Instant.now();
        this.modifiedDate = Instant.now();
        this.category = category;
    }

    @Override
    public String toString() {
        return String.format("TodoItem{id=%d, description='%s', complete='%s', createdDate='%s', modifiedDate='%s', category ='%s'}",
                id, description, complete, createdDate, modifiedDate, category);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public Instant getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Instant modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    //jdbc:postgresql://ec2-63-32-248-14.eu-west-1.compute.amazonaws.com:5432/d7ms2re36crkn9
}
