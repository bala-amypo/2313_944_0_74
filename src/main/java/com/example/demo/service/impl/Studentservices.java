package com.example.demo.service.Studentservices;
import java.util.*;
import com.example.demo.entity.Studententity;
public interface Studentservices{
    Studententity postdata(Studententity st);
    List<Studententity> getdata();
    Studententity getIdValue(Long id);
   // Optional<Studententity> getOneStudent(Long id);
   Studententity update(Long id,Studententity st);
    void delete(Long id); 
}