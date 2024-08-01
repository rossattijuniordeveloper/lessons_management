package com.tecnopar.app.core.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecnopar.app.core.models.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {    
    boolean existsByEmail(String email);
    Optional<Teacher> findByEmail(String email);
    List<Teacher> findByDescriptionContaining(String description);
}
