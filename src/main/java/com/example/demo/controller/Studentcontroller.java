package com.example.demo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Studententity; // Changed from .entity to .model per usual standards
import com.example.demo.service.Studentservices;

@RestController
@RequestMapping("/api/students") // Good practice to have a base path
public class Studentcontroller {

    private final Studentservices src;
    @Autowired Studentservices
    // Requirement: Constructor Injection (No @Autowired on fields)
    public Studentcontroller(Studentservices src) {
        this.src = src;
    }

    @PostMapping("/post")
    public Studententity insertData(@RequestBody Studententity st) {
        return src.postdata(st);
    }

    @GetMapping("/get")
    public List<Studententity> wantData() {
        return src.getdata();
    }

    @GetMapping("/getid/{id}")
    public Studententity particularData(@PathVariable Long id) { // Note: PKs in your prompt were 'Long'
        return src.getIdValue(id);
    }

    @PutMapping("/{id}") // Fixed: Added path variable to mapping
    public Studententity updateData(@PathVariable Long id, @RequestBody Studententity st) {
        return src.update(id, st);
    }

    @DeleteMapping("/{id}") // Fixed: Added path variable to mapping
    public void deleteData(@PathVariable Long id) {
        src.delte(id);
    }
}