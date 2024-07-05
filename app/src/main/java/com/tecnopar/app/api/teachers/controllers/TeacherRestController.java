package com.tecnopar.app.api.teachers.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tecnopar.app.api.common.routes.AppRoutes;
import com.tecnopar.app.api.teachers.dtos.TeacherResponse;
import com.tecnopar.app.api.teachers.services.TeacherService;

import lombok.RequiredArgsConstructor;


@RestController
@RequiredArgsConstructor
public class TeacherRestController {
    
    @Autowired
    private final TeacherService teacherService;

    @GetMapping(AppRoutes.LIST_TEACHERS)
    public List<TeacherResponse> listTeacher(
        @RequestParam(name = "q",required = false, defaultValue = "") String description
    ){
        return teacherService.listTeacher(description);
    }
    
    @GetMapping(AppRoutes.FIND_TEACHERS_BY_ID)
    public TeacherResponse findTeacherById(
        @PathVariable Long professorId
    ){
        return teacherService.findTeacherById(professorId);
    }
    

}
