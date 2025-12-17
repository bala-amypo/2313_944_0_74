package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.re

@Repository
public interface  StuentRepo extends  JpaRepository<Student,Long> {
    
}
