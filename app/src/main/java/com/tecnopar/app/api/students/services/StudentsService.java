package com.tecnopar.app.api.students.services;

import com.tecnopar.app.api.students.dtos.StudentsRequest;
import com.tecnopar.app.api.students.dtos.StudentsResponse;

public interface StudentsService {

    StudentsResponse StudentsInsert(StudentsRequest studentsRequest, Long teacherId );
    
}
