package com.tecnopar.app.api.teachers.services;

import java.util.List;

import com.tecnopar.app.api.teachers.dtos.TeacherResponse;

public interface TeacherService {    
    List<TeacherResponse> listTeacher (String description);
    TeacherResponse findTeacherById(Long teacherId);
}
