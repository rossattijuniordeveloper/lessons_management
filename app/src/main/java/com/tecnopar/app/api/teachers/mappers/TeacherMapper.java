package com.tecnopar.app.api.teachers.mappers;

import com.tecnopar.app.api.teachers.dtos.TeacherRequest;
import com.tecnopar.app.api.teachers.dtos.TeacherResponse;
import com.tecnopar.app.core.models.Teacher;

public interface TeacherMapper {
    Teacher toTeacher(TeacherRequest teacherRequest);
    TeacherResponse toTeacherResponse(Teacher teacher);
}
