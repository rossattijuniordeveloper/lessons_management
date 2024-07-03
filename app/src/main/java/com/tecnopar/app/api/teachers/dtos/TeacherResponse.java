package com.tecnopar.app.api.teachers.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
