package com.tecnopar.app.core.models.exceptions;

public class StudentNotFoundException extends ModelNotFoundException {   

     public StudentNotFoundException() {
          super("Aluno não encontrado!");
     }
    
     public StudentNotFoundException(String message) {
          super(message);
     }      

}
