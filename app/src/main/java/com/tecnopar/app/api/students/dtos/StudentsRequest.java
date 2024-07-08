package com.tecnopar.app.api.students.dtos;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(SnakeCaseStrategy.class)
public class StudentsRequest {

    @NotNull
    @NotEmpty
    @Size(min = 3, max = 100)
    @Column(name = "name")
    private String nome;

    @Email
    @NotNull
    @NotEmpty
    @Size(min = 3,max = 255)
    private String email;  
    
    @Future
    @NotNull
    @DateTimeFormat(iso = ISO.DATE_TIME)
    @Column(name = "lesson_date")
    private LocalDateTime data_aula;
    
}
