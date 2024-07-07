package com.tecnopar.app.api.students.mappers;

import com.tecnopar.app.api.students.dtos.StudentsRequest;
import com.tecnopar.app.api.students.dtos.StudentsResponse;
import com.tecnopar.app.core.models.Students;

public interface StudentsMapper {
    
    Students toStudents(StudentsRequest studentsRequest);
    StudentsResponse toStudentsResponse( Students students) ;
}
