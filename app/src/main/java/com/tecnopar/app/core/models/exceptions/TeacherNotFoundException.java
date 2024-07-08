package com.tecnopar.app.core.models.exceptions;

public class TeacherNotFoundException extends ModelNotFoundException {

    public TeacherNotFoundException() {
        super("Professor não encontrado!");
   }

   public TeacherNotFoundException(String message) {
        super(message);
   }
    
}
