package com.tecnopar.app.api.students.dtos;

import java.time.LocalDateTime;

import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.tecnopar.app.core.models.Teacher;

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

    private Teacher teacher;      

    private LocalDateTime lessonDate;
//    @DateTimeFormat(iso = ISO.DATE_TIME)
//    @Column(name = "lesson_date")
//    private LocalDateTime data_aula;

    private LocalDateTime createdAt    ;

    private LocalDateTime updatedAt;
    

}
