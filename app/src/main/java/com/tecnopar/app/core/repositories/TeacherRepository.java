package com.tecnopar.app.core.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecnopar.app.core.models.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    
    List<Teacher> findByDescriptionContaining(String description);

}
