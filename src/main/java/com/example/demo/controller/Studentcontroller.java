package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Studententity;
import com.example.demo.service.Studentservices;

@RestController
public class Studentcontroller {
    @Autowired
    Studentservices src;
    @PostMapping("/post")
    public Studententity Insertdata(@RequestBody Studententity st) {
        return src.postdata(st);
    }
    @GetMapping("/get")
    public List<Studententity>wantdata(){
        return src.getdata();
    }

    @GetMapping("/getid/{id}")
    public Studententity particulardata(@PathVariable int id){
        return src.getIdValue(id);
    }
    @PutMapping
    public Studententity updatedata(@PathVariable int id,@RequestBody Studententity st){
        return src.update(id,st);
    }
    @DeleteMapping
    public void  deletedata(@PathVariable int id){
            src.delte(id);
    }

}
