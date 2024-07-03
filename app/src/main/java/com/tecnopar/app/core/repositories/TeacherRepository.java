package com.tecnopar.app.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecnopar.app.core.models.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    
}
