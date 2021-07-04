package com.example.repository;


import com.example.model.PriorityArea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriorityRepo extends JpaRepository<PriorityArea, Long> {
}
