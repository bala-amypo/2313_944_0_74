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
    @override
    public Studententity postdata(Studententity st){
        return rep.save(st);
    }
    @override
    public Studententity getdata(){
        return rep.();
    }
    @override
    public Studententity getIdValue(long id){
        return rep.()
    }
}