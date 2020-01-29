package com.example.rest.repository;

import com.example.rest.model.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository
        extends JpaRepository<EmployeeEntity, Long> {
    List<EmployeeEntity> findByIsActive(Boolean isActive);
 
}
