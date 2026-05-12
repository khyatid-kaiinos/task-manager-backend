package com.example.demo.repository;

import com.example.demo.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * JpaRepository takes two parameters:
 * 1. The Entity type (Task)
 * 2. The type of the ID field in that Entity (Long)
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    
    // You don't need to write any methods here yet.
    // By extending JpaRepository, you automatically get:
    // - save(Task)
    // - findById(Long)
    // - findAll()
    // - deleteById(Long)
    // - count()
}