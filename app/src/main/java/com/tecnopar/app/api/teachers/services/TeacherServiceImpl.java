package com.tecnopar.app.api.teachers.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tecnopar.app.api.teachers.dtos.TeacherResponse;
import com.tecnopar.app.api.teachers.mappers.TeacherMapper;
import com.tecnopar.app.core.repositories.TeacherRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {

    private final TeacherMapper teacherMapper;
    private final TeacherRepository teacherRepository;

    @Override
    public List<TeacherResponse> LisTeacher(String description) {
        return teacherRepository.findByDescriptionContaining(description)
            .stream()
            .map(teacherMapper::toTeacherResponse)
            .toList();
    }
    
}
