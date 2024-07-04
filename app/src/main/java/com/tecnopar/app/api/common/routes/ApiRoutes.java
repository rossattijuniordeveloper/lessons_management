package main.java.com.tecnopar.app.api.common.routes;

import java.util.logging.Level;

import lombok.NoArgsConstructor;

//@NoArgsConstructor(access = AccessLevel.PRIVATE)
//@NoArgsConstructor(access = Level.PRIVATE)
@NoArgsConstructor()
public class ApiRoutes {
    public static final String API = "/api"  ;
    public static final String TEACHERS ="/professores";
    public static final String LIST_TEACHERS = API + TEACHERS;    
    public static final String FIND_TEACHERS_BY_ID = API + TEACHERS + "/{professorId}";    
}
