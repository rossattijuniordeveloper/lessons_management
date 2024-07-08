package com.tecnopar.app.api.common.routes;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AppRoutes {
    // Teacher Routes
    public static final String API = "/api"  ;
    public static final String TEACHERS ="/professores";
    public static final String LIST_TEACHERS = API + TEACHERS;    
    public static final String FIND_TEACHERS_BY_ID = API + TEACHERS + "/{professorId}"; 

    // Students\Lessons Routes
    public static final String STUDENTS = "/alunos";
    public static final String STUDENTS_INSERT = API + TEACHERS + "/{professorId}" + STUDENTS;
    public static final String STUDENTS_LIST   = API + STUDENTS;
    public static final String STUDENTS_FIND_BY_ID = API + STUDENTS + "/{alunosId}";

}
