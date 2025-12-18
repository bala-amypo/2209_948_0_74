package com.example.demo.service.impl;

import com.example.demo.service.*;
import com.example.demo.repository.*;
import com.example.demo.entity.*;
import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import com.example.demo.exception;

@Service
public class studentServiceImpl implements StudentService{

    @Autowired
    studentRepo repo;    

    public List<studentEntity>getAll(){
        return repo.findAll();
    }

    public studentEntity addStudent(studentEntity student){
        return repo.save(student);
    }
    
    public studentEntity getbyId(Long id){
        return repo.findbyId(id).orElseThrow(()->new StudentNotFoundException("Student ID not Found"));
    }
 
    public studentEntity updatebyId(Long id,studentEntity newstu){
        studentEntity existing=getbyId(id);
        newstu.setId(existing.getbyId());
        return repo.save(newstu);
    }
}