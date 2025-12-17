package com.example.demo.newrepository;
import org.springframework.jpa.repository.JpaRepository;
import com.example.demo.Entity.Studententity;

public interface newfileRepo extends JpaRepository<Studententity,Long> {
    
}
