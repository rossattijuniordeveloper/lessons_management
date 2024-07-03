package com.tecnopar.app.api.teachers.dtos;

import java.math.BigDecimal;
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
public class TeacherResponse {

    private Long id;
    private String name;
    private String email;
    private int age;
    private String  description;    
    private BigDecimal priceTime;    
    private LocalDateTime createdAt;    
    private LocalDateTime updatedAt;    
    private String  profilePicture;
    // private String password;
    
}
