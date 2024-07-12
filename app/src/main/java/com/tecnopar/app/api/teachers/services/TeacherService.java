package com.tecnopar.app.api.teachers.services;

import java.util.List;

import com.tecnopar.app.api.teachers.dtos.TeacherRequest;
import com.tecnopar.app.api.teachers.dtos.TeacherResponse;

public interface TeacherService {    
    List<TeacherResponse> teacherList (String description);
    TeacherResponse teacherFindById(Long teacherId);
    TeacherResponse teacherInclude(TeacherRequest teacherRequest);
}
