package com.tecnopar.app.api.teachers.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tecnopar.app.api.teachers.dtos.TeacherResponse;
import com.tecnopar.app.api.teachers.mappers.TeacherMapper;
import com.tecnopar.app.core.repositories.TeacherRepository;
import main.java.com.tecnopar.app.core.models.exceptions.TeacherNotFoundException;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {

    private final TeacherMapper teacherMapper;
    private final TeacherRepository teacherRepository;

    @Override
    public List<TeacherResponse> listTeacher(String description) {
        return teacherRepository.findByDescriptionContaining(description)
            .stream()
            .map(teacherMapper::toTeacherResponse)
            .toList();
    }
    @Override
    public TeacherResponse findTeacherById(Long teacherId){
        return teacherRepository.findById(teacherId)
        .map(teacherMapper::toTeacherResponse)
        .orElseThrow(TeacherNotFoundException::new);
    }
    
}
