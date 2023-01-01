package com.example.probe2.api;

import javax.validation.constraints.Size;
import java.time.Instant;

public class TasksManipulationRequest {
    private Long id;

    public TasksManipulationRequest(Long id, String description, boolean complete, Instant createdDate, Instant modifiedDate, String category) {
        this.id = id;
        this.description = description;
        this.complete = complete;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.category = category;
    }

    public TasksManipulationRequest() {
    }

    private String description;


    private boolean complete;


    private Instant createdDate;


    private Instant modifiedDate;

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

    private String category;
}
