package com.tecnopar.app.api.teachers.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tecnopar.app.api.teachers.dtos.TeacherResponse;
import com.tecnopar.app.api.teachers.services.TeacherService;

import lombok.RequiredArgsConstructor;
import main.java.com.tecnopar.app.api.common.routes.ApiRoutes;

@RestController
@RequiredArgsConstructor
public class TeacherRestController {
    
    
    private final TeacherService teacherService;

    @GetMapping(ApiRoutes.LIST_TEACHERS)
    public List<TeacherResponse> listTeacher(
        @RequestParam(name = "q",required = false, defaultValue = "") String description
    ){
        return teacherService.listTeacher(description);
    }
    @GetMapping(ApiRoutes.FIND_TEACHERS_BY_ID)
    public TeacherResponse findTeacherById(
        @PathVariable Long professorId
    ){
        return teacherService.findTeacherById(professorId);
    }
    

}
