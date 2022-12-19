package com.example.probe2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    private TasksItemRepository tasksItemRepository;


    @Override
    public void run(String... args) throws Exception {
        List<TasksItem> todos = (List<TasksItem>) tasksItemRepository.findAll();

        if (todos.size() == 0) {
            TasksItem task1 = new TasksItem();
            TasksItem task2 = new TasksItem();

            task1.setDescription("this is the first task");
            task1.setCreatedDate(Instant.now());



            task2.setDescription("This is the second task");
            task2.setCreatedDate(Instant.now());


            tasksItemRepository.save(task1);
            tasksItemRepository.save(task2);


        }
    }
}
