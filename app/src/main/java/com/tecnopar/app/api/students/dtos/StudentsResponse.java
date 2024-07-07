package com.tecnopar.app.api.students.dtos;

import java.time.LocalDateTime;

import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(SnakeCaseStrategy.class)
public class StudentsResponse {    

    private Long id;

    private String name;

    private String email;    

    //private Teacher teacher;      

    private LocalDateTime lessonDate;

    private LocalDateTime createdAt    ;

    private LocalDateTime updatedAt;
    

}
