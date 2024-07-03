package com.tecnopar.app.api.teachers.mappers;

import com.tecnopar.app.api.teachers.dtos.TeacherResponse;
import com.tecnopar.app.core.models.Teacher;

public interface TeacherMapper {
    TeacherResponse toTeacherResponse(Teacher teacher);
}
