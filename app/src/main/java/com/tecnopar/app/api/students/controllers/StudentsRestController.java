package com.tecnopar.app.api.students.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tecnopar.app.api.common.routes.AppRoutes;
import com.tecnopar.app.api.students.dtos.StudentsRequest;
import com.tecnopar.app.api.students.dtos.StudentsResponse;
import com.tecnopar.app.api.students.services.StudentsService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class StudentsRestController {
    
    @Autowired
    private final StudentsService studentsService;

    @PostMapping(AppRoutes.STUDENTS_INSERT)
    @ResponseStatus(HttpStatus.CREATED)
    public StudentsResponse StudentsInsert(
         @RequestBody @Valid StudentsRequest studentsRequest
        ,@PathVariable Long professorId
    ) {
        return studentsService.StudentsInsert(studentsRequest, professorId);
    }  

}
