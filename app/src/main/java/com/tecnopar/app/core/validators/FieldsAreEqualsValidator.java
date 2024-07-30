package com.tecnopar.app.core.validators;

import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

import org.springframework.beans.BeanUtils;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class FieldsAreEqualsValidator implements ConstraintValidator<FieldsAreEquals, Object >  {

    private String field;
    private String fieldMatch;

    @Override
    public void initialize(FieldsAreEquals constraintAnnotation) {
        this.field = constraintAnnotation.field();
        this.fieldMatch = constraintAnnotation.fieldMatch(); 
        validateParameters();       
    }

    @Override    
    public boolean isValid(Object value, ConstraintValidatorContext context)  {
        context.disableDefaultConstraintViolation();
        context.buildConstraintViolationWithTemplate(context.getDefaultConstraintMessageTemplate())
        .addPropertyNode(fieldMatch)
        .addConstraintViolation();
        var fieldPropertyDescriptor = BeanUtils.getPropertyDescriptor(value.getClass(), field);
        var fieldMatchPropertyDescriptor = BeanUtils.getPropertyDescriptor(value.getClass(), fieldMatch);
        if (fieldPropertyDescriptor == null || fieldMatchPropertyDescriptor == null) {
            throw new IllegalArgumentException("Os campos informados não existem na classe");            
        }            
        try {
            var fieldValue = fieldPropertyDescriptor.getReadMethod().invoke(value);
            var fieldMatchValue = fieldMatchPropertyDescriptor.getReadMethod().invoke(value);
            return Objects.equals(fieldValue,fieldMatchValue);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new IllegalArgumentException("Não foi possível acessar os campos!");
        }
    }   
    
    private void validateParameters() {      
        if(field == null || field.isEmpty() )  {
            throw new IllegalArgumentException("O 'field' não pode ser nulo ou Vazio");
        }
        if (fieldMatch== null || fieldMatch.isEmpty()) {
            throw new IllegalArgumentException("O 'fieldMatch' não pode ser nulo ou Vazio");            
        }
    }    
}
