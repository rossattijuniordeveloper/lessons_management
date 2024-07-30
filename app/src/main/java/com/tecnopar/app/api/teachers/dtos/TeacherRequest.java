package com.tecnopar.app.api.teachers.dtos;

import java.math.BigDecimal;

import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.tecnopar.app.api.teachers.validators.TeacherEmailIsUnique;
import com.tecnopar.app.core.validators.FieldsAreEquals;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(SnakeCaseStrategy.class)
@FieldsAreEquals(field = "password",fieldMatch = "password_confirmation")
public class TeacherRequest {

    @NotNull
    @NotEmpty
    @Size(min = 3, max = 100)
    @Column(name = "name")
    private String nome;

    @NotEmpty
    @NotNull
    @Email
    @TeacherEmailIsUnique
    @Size(min = 3, max = 255)
    private String email;

    @NotNull
    @Min(18)    
    @Max(120)
    @Column(name = "age")
    private int idade;

    @NotNull
    @NotEmpty
    @Size(min = 3, max = 500)
    @Column(name = "description")
    private String descricao;

    @NotNull
    @Min(25)
    @Max(1000)
    @Column(name = "price_time")
    private BigDecimal valorHora;

    @NotNull
    @NotEmpty
    @Size(min = 6,max = 255)
    @Column(name = "password")
    private String password;

    @NotNull
    @NotEmpty
    @Size(min = 6,max = 255)
    @Column(name = "password")
    private String password_confirmation;
}
