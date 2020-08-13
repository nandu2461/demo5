package com.example.studentdetails.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentService
{
   @Autowired
   StudentRepository repository;

    public StudentEntity enter(StudentEntity[] student)
    {
       for(StudentEntity st:student)
       {
           System.out.println(st.getSphoneno()+" "+st.getSfname()+" "+st.getSlname()+" "+st.getAddress()+" "+st.getSparentphoneno());
           repository.save(st);
       }
        return null;
    }
}