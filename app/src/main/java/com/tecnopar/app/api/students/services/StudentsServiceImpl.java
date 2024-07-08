package com.tecnopar.app.api.students.services;

import org.springframework.stereotype.Service;

import com.tecnopar.app.api.students.dtos.StudentsRequest;
import com.tecnopar.app.api.students.dtos.StudentsResponse;
import com.tecnopar.app.api.students.mappers.StudentsMapper;
import com.tecnopar.app.core.models.exceptions.TeacherNotFoundException;
import com.tecnopar.app.core.repositories.StudentsRepository;
import com.tecnopar.app.core.repositories.TeacherRepository;

import lombok.RequiredArgsConstructor;
//import lombok.var;

@Service
@RequiredArgsConstructor
public class StudentsServiceImpl implements StudentsService{

    private final StudentsMapper studentsMapper;
    private final StudentsRepository studentsRepository;
    private final TeacherRepository teacherRepository;


    @Override
    public StudentsResponse StudentsInsert(StudentsRequest studentsRequest, Long teacherId) {
        if( teacherId == null){
            return null;
        }
        var teacherLocal = teacherRepository.findById(teacherId)
            .orElseThrow(TeacherNotFoundException::new);
        var studentByInsert  = studentsMapper.toStudents(studentsRequest);        
        studentByInsert.setTeacher(teacherLocal);
        var studentInserted = studentsRepository.save(studentByInsert);        
        return studentsMapper.toStudentsResponse(studentInserted);       
    }
    
}
