package com.example.demo.service;

import com.example.demo.entity.*;
import java.util.*;

public interface StudentService{

    List<studentEntity>getAll();

    studentEntity addStudent(studentEntity student );

    studentEntity getbyId(Long id);

    studentEntity updatebyId(Long id,studentEntity newstu);
}