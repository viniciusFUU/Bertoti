CREATE DATABASE bertoti;

USE bertoti;

CREATE TABLE usuario(
	user_id INT PRIMARY KEY AUTO_INCREMENT,
    user_name VARCHAR(25),
    user_age VARCHAR(25),
    user_gender VARCHAR(1)
);

SELECT * FROM usuario;