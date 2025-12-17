package com.example.demo.service;
import.java.util.*;
import org.springframework.stereotype.service;
import com.example.demo.entity.Studententity;
import com.example.demo.service.Studentservices;
@service
public class Studentserviceimpl implements Studentservices{
    private final StudentRepo rep;
    public Studentserviceimpl(StudentRepo rep){
        this.rep=rep;
    }
    @Override
    public Studententity postdata(Studententity st){
        return rep.save(st);
    }
    @Override
    public Studententity getdata(){
        return rep.();
    }
    @Override
    public Studententity getIdValue(Long id){
        return rep.findById();
    }
    @Override
    public Studententity update(Studententity st,Long id){
        return rep.();
    }
    @Override
    public void delete(Long id){
        return rep.();
    }
}