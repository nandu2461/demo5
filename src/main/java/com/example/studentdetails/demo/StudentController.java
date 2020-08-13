package com.example.studentdetails.demo;

import org.hibernate.annotations.GeneratorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Students")
public class StudentController
{
    @Autowired
    StudentService service;
    @PostMapping("/save")
   private StudentEntity insert(StudentEntity[] student)
   {
       return service.enter(student);
   }
}