package main.java.com.tecnopar.app.api.common.routes;

import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ApiRoutes {
    public static final String API = "/api"  ;
    public static final String TEACHERS ="/professores";
    public static final String FIND_TEACHERS = API + TEACHERS;    

}
