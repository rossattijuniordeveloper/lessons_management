package com.tecnopar.app.api.students.mappers;

import org.springframework.stereotype.Component;

import com.tecnopar.app.api.students.dtos.StudentsRequest;
import com.tecnopar.app.api.students.dtos.StudentsResponse;
import com.tecnopar.app.core.models.Students;

@Component
public class StudentsMapperImpl implements StudentsMapper {

    @Override
    public Students toStudents(StudentsRequest studentsRequest) {

        if(studentsRequest == null){
            return null;
        }
        return Students.builder()
            .name(studentsRequest.getNome())
            .email(studentsRequest.getEmail())
            .lessonDate(studentsRequest.getData_aula())
            .build();
    }

    @Override
    public StudentsResponse toStudentsResponse(Students students) {

        if(students == null){
            return null;
        }
        return StudentsResponse.builder()
            .id(students.getId())
            .name(students.getName())
            .email(students.getEmail())
            .lessonDate(students.getLessonDate())
            .createdAt(students.getCreatedAt())
            .updatedAt(students.getUpdatedAt())
            .build();        
    }
    
}
