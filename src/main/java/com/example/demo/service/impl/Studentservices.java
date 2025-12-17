package com.example.demo.service.Studentservices;
import java.util.*;
import com.example.demo.entity.Studententity;
public interface Studentservices{
    Studententity savedata(Studententity st);
    List<Studententity> getAll();
    Studententity getidvalue(Long id);
   // Optional<Studententity> getOneStudent(Long id);
   Studententity update(Long id,Studententity st);
    void delete(Long id);
}