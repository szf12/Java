SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

DROP DATABASE IF EXISTS tanar_zoo;
CREATE DATABASE IF NOT EXISTS `tanar_zoo` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_hungarian_ci;
USE `tanar_zoo`;

CREATE TABLE `animals` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `species_id` int(11) NOT NULL,
  `food_id` int(11) NOT NULL,
  `daily_amount_per_kg_l` double DEFAULT NULL,
  `food_price_per_unit_in_huf` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_hungarian_ci;

INSERT INTO `animals` (`id`, `name`, `species_id`, `food_id`, `daily_amount_per_kg_l`, `food_price_per_unit_in_huf`) VALUES
(1, '\"Oroszlán\"', 1, 1, 5, 2800),
(2, '\"Zebra\"', 1, 2, 10, 150),
(3, '\"Elefánt\"', 1, 3, 50, 200),
(4, '\"Zsiráf\"', 1, 4, 8, 350),
(5, '\"Barna medve\"', 1, 5, 4, 1200),
(6, '\"Panda\"', 1, 6, 15, 500),
(7, '\"Tigris\"', 1, 1, 6, 2800),
(8, '\"Pingvin\"', 2, 5, 1, 900),
(9, '\"Orrszarvú\"', 1, 2, 25, 150),
(10, '\"Fóka\"', 1, 5, 2, 1500),
(11, '\"Kenguru\"', 1, 7, 3, 400),
(12, '\"Gorilla\"', 1, 8, 12, 700),
(13, '\"Víziló\"', 1, 7, 30, 100),
(14, '\"Lajhár\"', 1, 9, 0.5, 800),
(15, '\"Krokodil\"', 3, 1, 1.5, 1800),
(16, '\"Flamingó\"', 2, 10, 0.2, 2500),
(17, '\"Kígyó (Piton)\"', 3, 11, 0.1, 1000),
(18, '\"Pókmajom\"', 1, 3, 1, 600),
(19, '\"Strucc\"', 2, 12, 4, 250),
(20, '\"Béka (nyílméreg)\"', 4, 13, 0.01, 5000),
(21, '\"Párduc\"', 1, 1, 3.5, 2800),
(22, '\"Pelikán\"', 2, 5, 1.5, 900),
(23, '\"Kapibara\"', 1, 7, 6, 100),
(24, '\"Gepárd\"', 1, 1, 4, 2800),
(25, '\"Sirály\"', 2, 5, 0.3, 1100),
(26, '\"Teknős (óriás)\"', 3, 8, 2, 700),
(27, '\"Tapír\"', 1, 3, 5, 600),
(28, '\"Pávián\"', 1, 12, 1, 450),
(29, '\"Szarvasbogár\"', 5, 14, 0.005, 7000),
(30, '\"Strucc\"', 2, 12, 4, 250),
(31, '\"Bölény\"', 1, 2, 18, 150),
(32, '\"Tukán\"', 2, 3, 0.4, 1500),
(33, '\"Gekko\"', 3, 13, 0.05, 3000),
(34, '\"Sas\"', 2, 1, 0.8, 2000),
(35, '\"Vakondok\"', 1, 15, 0.1, 1800);

CREATE TABLE `foods` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_hungarian_ci;

INSERT INTO `foods` (`id`, `name`) VALUES
(1, '\"Hús\"'),
(2, '\"Széna\"'),
(3, '\"Gyümölcs\"'),
(4, '\"Lucerna\"'),
(5, '\"Hal\"'),
(6, '\"Bambusz\"'),
(7, '\"Fű\"'),
(8, '\"Zöldség\"'),
(9, '\"Levelek\"'),
(10, '\"Alga\"'),
(11, '\"Rágcsáló\"'),
(12, '\"Magvak\"'),
(13, '\"Rovarok\"'),
(14, '\"NeKtár\"'),
(15, '\"Földigiliszta\"');

CREATE TABLE `species` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_hungarian_ci;

INSERT INTO `species` (`id`, `name`) VALUES
(1, '\"Emlős\"'),
(2, '\"Madár\"'),
(3, '\"Hüllő\"'),
(4, '\"Kétéltű\"'),
(5, '\"Rovar\"');


ALTER TABLE `animals`
  ADD PRIMARY KEY (`id`),
  ADD KEY `foreign_key_species` (`species_id`),
  ADD KEY `foreign_key_foods` (`food_id`);

ALTER TABLE `foods`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);

ALTER TABLE `species`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`);


ALTER TABLE `animals`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;


ALTER TABLE `animals`
  ADD CONSTRAINT `foreign_key_foods` FOREIGN KEY (`food_id`) REFERENCES `foods` (`id`),
  ADD CONSTRAINT `foreign_key_species` FOREIGN KEY (`species_id`) REFERENCES `species` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
