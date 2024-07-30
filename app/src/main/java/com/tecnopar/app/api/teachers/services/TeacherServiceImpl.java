package com.tecnopar.app.api.teachers.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tecnopar.app.api.teachers.dtos.TeacherRequest;
import com.tecnopar.app.api.teachers.dtos.TeacherResponse;
import com.tecnopar.app.api.teachers.mappers.TeacherMapper;
import com.tecnopar.app.core.models.exceptions.TeacherNotFoundException;
import com.tecnopar.app.core.repositories.TeacherRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {

    private final TeacherMapper teacherMapper;
    private final TeacherRepository teacherRepository;

    @Override
    public List<TeacherResponse> teacherList(String description) {
        return teacherRepository.findByDescriptionContaining(description)
            .stream()
            .map(teacherMapper::toTeacherResponse)
            .toList();
    }
    @Override
    public TeacherResponse teacherFindById(Long teacherId){
        return teacherRepository.findById(teacherId)
        .map(teacherMapper::toTeacherResponse)
        .orElseThrow(TeacherNotFoundException::new);
    }
    @Override
    public TeacherResponse teacherInclude(TeacherRequest teacherRequest) {
        if(teacherRequest.getPassword().equals(teacherRequest.getPassword_confirmation()))
        {
            var teacherToInclude = teacherMapper.toTeacher(teacherRequest);
            var teacherIncluded  = teacherRepository.save(teacherToInclude);                
            return teacherMapper.toTeacherResponse(teacherIncluded);  
        } else {
            throw new IllegalArgumentException("as senhas não conferem !");
        }         
    }
    
}
