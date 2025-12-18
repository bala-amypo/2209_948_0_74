pacckage com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.*;
import com.example.demo.service.*;
import jakarta.validation.Valid;

@RestController
public class studentController{
    @Autowired
    studentService service;

    @GetMapping("/getAllStudent")
    public Lis<studentEntity>getAll(){
       return service.getAll();
    }

    @PostMapping("/add")
    public studentEntity addStudent(@Valid @RequestBody studentEntity student ){
        return service.addStudent(student);
    }
}