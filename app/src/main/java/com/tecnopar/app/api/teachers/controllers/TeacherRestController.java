package com.tecnopar.app.api.teachers.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tecnopar.app.api.common.routes.AppRoutes;
import com.tecnopar.app.api.teachers.dtos.TeacherRequest;
import com.tecnopar.app.api.teachers.dtos.TeacherResponse;
import com.tecnopar.app.api.teachers.services.TeacherService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;


@RestController
@RequiredArgsConstructor
public class TeacherRestController {
    
    @Autowired
    private final TeacherService teacherService;

    @GetMapping(AppRoutes.TEACHERS_LIST)
    public List<TeacherResponse> listTeacher(
        @RequestParam(name = "q",required = false, defaultValue = "") String description
    ){
        return teacherService.teacherList(description);
    }
    
    @GetMapping(AppRoutes.TEACHERS_FIND_BY_ID)
    public TeacherResponse findTeacherById(
        @PathVariable Long professorId
    ){
        return teacherService.teacherFindById(professorId);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(AppRoutes.TEACHERS_INCLUDE)
    public TeacherResponse teacherInclude(
        @RequestBody @Valid TeacherRequest teacherRequest
    ) {
        return teacherService.teacherInclude(teacherRequest);
    }
    

}
