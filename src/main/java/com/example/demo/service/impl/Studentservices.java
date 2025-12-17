package com.example.demo.service;
import java.util.*;
import com.example.demo.entity.Studententity;
public interface Studentservices{
    Studententity insertStudent(Studententity st);
    List<Studententity> getAllStudents();
    Optional<Studententity> getOneStudent(Long id);
    void deleteStudent(Long id);
}