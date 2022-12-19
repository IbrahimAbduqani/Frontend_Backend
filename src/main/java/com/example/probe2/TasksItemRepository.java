package com.example.probe2;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TasksItemRepository extends CrudRepository<TasksItem, Long> {
}
