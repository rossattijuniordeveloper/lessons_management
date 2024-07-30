package com.tecnopar.app.api.teachers.validators;

import org.springframework.stereotype.Component;

import com.tecnopar.app.core.repositories.TeacherRepository;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class TeacherEmailIsUniqueValidator implements ConstraintValidator<TeacherEmailIsUnique,String> {

    private final TeacherRepository teacherRepository;
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value==null) {
            return true;            
        }
        return !teacherRepository.existsByEmail(value);        
    }

}
