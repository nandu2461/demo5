package com.example.studentdetails.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface StudentRepository extends JpaRepository<StudentEntity,Long>
{

}
