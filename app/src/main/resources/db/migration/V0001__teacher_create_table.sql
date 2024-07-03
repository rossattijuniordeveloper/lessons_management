CREATE TABLE teachers (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(255) NOT NULL,
    age INTEGER NOT NULL,
    descripton TEXT NOT NULL ,
    price_time DECIMAL(5,2) NOT NULL ,
    profile_picture VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    created_at DATETIME NOT NULL,
    updated_at DATETIME NOT NULL
);