package com.example.controller;

import com.example.model.PriorityArea;
import com.example.repository.PriorityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class PriorityController {
    @Autowired
    PriorityRepo priorityRepo;

    @GetMapping("/priorities")
    public List<PriorityArea> getAllPriorities() {
        return priorityRepo.findAll();
    }

    @PostMapping("/priorities")
    public List<PriorityArea> postPriorities(@RequestBody List<PriorityArea> priorityAreas) {
        if(priorityRepo.count() > 0){
            priorityRepo.deleteAll();
        }
        priorityRepo.saveAll(priorityAreas);
        return priorityRepo.findAll();
    }

}
