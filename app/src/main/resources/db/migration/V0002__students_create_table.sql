USE lessman;
CREATE TABLE students (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(255) NOT NULL,
    lesson_date DATETIME NOT NULL,
    teacher_id BIGINT NOT NULL,
    created_at DATETIME NOT NULL,
    updated_at DATETIME NOT NULL
);
# TODO: essa linha abaixo, precisa ser convertida para a sintaxe do PostGreSQL
ALTER TABLE students ADD FOREIGN KEY ('teacher_id') REFERENCES 'teacher'('id');