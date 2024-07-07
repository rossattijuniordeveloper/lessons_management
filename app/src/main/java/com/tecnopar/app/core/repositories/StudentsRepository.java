package com.tecnopar.app.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecnopar.app.core.models.Students;

public interface StudentsRepository extends JpaRepository<Students,Long> {
    
//    List<Students> findByNameCoStudents(String name);
}
