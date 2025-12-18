package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;
import com.example.demo.entity.*;
import com.example.demo.service.StudentService;
import jakarta.validation.Valid;
import java.util.*;

@RestController
public class studentController{
    @Autowired
    StudentService service;

    @GetMapping("/getAllStudent")
    public List<studentEntity>getAll(){
       return service.getAll();
    }

    @PostMapping("/add")
    public studentEntity addStudent(@Valid @RequestBody studentEntity student ){
        return service.addStudent(student);
    }

    @GetMapping("/get/{id}")
    public studentEntity getbyId(@PathVariable Long id){
        return service.getbyId(id);
    }

    @PutMapping("/update/{id}")
    public studentEntity updatebyId(@PathVariable Long id,@Valid @RequestBody studentEntity newstu){
        return service.updatebyId(id);
    }

    @DeleteMapping("/delete/{id}")
    public studentEntity deletebyId(@PathVariable Long id){
        return service.deletebyId(id);
    }
}