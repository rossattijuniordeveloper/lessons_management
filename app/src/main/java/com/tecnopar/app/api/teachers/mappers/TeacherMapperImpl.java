package com.tecnopar.app.api.teachers.mappers;

import org.springframework.stereotype.Component;

import com.tecnopar.app.api.teachers.dtos.TeacherResponse;
import com.tecnopar.app.core.models.Teacher;

@Component
public class TeacherMapperImpl implements TeacherMapper {

    @Override
    public TeacherResponse toTeacherResponse(Teacher teacher) {
       if(teacher==null){
        return null;
       }
       return TeacherResponse.builder()
        .id(teacher.getId())
        .name(teacher.getName())
        .age(teacher.getAge())
        .email(teacher.getEmail())
        .description(teacher.getDescription())
        .priceTime(teacher.getPriceTime())
        .profilePicture(teacher.getProfilePicture())
        .createdAt(teacher.getCreatedAt())
        .updatedAt(teacher.getUpdatedAt())
        .build();
    }

    
}
