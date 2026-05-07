DROP DATABASE IF EXISTS tanar_zoo;
CREATE DATABASE tanar_zoo DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_hungarian_ci;
USE tanar_zoo;



CREATE TABLE `species` (
    id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name varchar(100) NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_hungarian_ci;

CREATE TABLE `foods`(
    id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name varchar(100) NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_hungarian_ci;

CREATE TABLE `animals` (
	id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name varchar(100) NOT NULL,
    species_id int NOT NULL,
    food_id int NOT NULL,
    daily_amount_per_kg_l double,
    food_price_per_unit_in_huf int,
    FOREIGN KEY (food_id) REFERENCES foods(id),
    FOREIGN KEY (species_id) REFERENCES species(id)
);
 
