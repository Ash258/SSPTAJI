-- phpMyAdmin SQL Dump
-- version 3.3.3
-- http://www.phpmyadmin.net
--
-- Počítač: localhost
-- Vygenerováno: Středa 15. dubna 2015, 22:14
-- Verze MySQL: 5.1.46
-- Verze PHP: 5.3.2

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Databáze: `hotel`
--
CREATE DATABASE `hotel` DEFAULT CHARACTER SET utf8 COLLATE utf8_czech_ci;
USE `hotel`;

-- --------------------------------------------------------

--
-- Struktura tabulky `hotel_pokoje`
--

CREATE TABLE IF NOT EXISTS `hotel_pokoje` (
  `hotel_pokoje_id` int(11) NOT NULL AUTO_INCREMENT,
  `hotel_pokoje_cislo` int(11) NOT NULL,
  `hotel_pokoje_popis` varchar(100) COLLATE utf8_czech_ci NOT NULL,
  `hotel_pokoje_kapacita` int(11) NOT NULL,
  PRIMARY KEY (`hotel_pokoje_id`),
  UNIQUE KEY `hotel_pokoje_cislo` (`hotel_pokoje_cislo`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_czech_ci AUTO_INCREMENT=7 ;

--
-- Vypisuji data pro tabulku `hotel_pokoje`
--

INSERT INTO `hotel_pokoje` (`hotel_pokoje_id`, `hotel_pokoje_cislo`, `hotel_pokoje_popis`, `hotel_pokoje_kapacita`) VALUES
(1, 101, 'Obyčejné dvoulůžko', 2),
(2, 102, 'Manželské apartmá', 2),
(3, 205, 'Obyčejné třílůžko', 3),
(4, 210, 'Luxusní jednolůžko', 1),
(5, 110, 'Rodinné apartmá', 4),
(6, 201, 'Luxusní apartmá s terasou', 2);

-- --------------------------------------------------------

--
-- Struktura tabulky `hotel_rezervace`
--

CREATE TABLE IF NOT EXISTS `hotel_rezervace` (
  `hotel_rezervace_id` int(11) NOT NULL AUTO_INCREMENT,
  `hotel_rezervace_idUzivatel` int(11) NOT NULL,
  `hotel_rezervace_idPokoj` int(11) NOT NULL,
  `hotel_rezervace_den` int(11) NOT NULL,
  PRIMARY KEY (`hotel_rezervace_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_czech_ci AUTO_INCREMENT=125 ;

--
-- Vypisuji data pro tabulku `hotel_rezervace`
--

INSERT INTO `hotel_rezervace` (`hotel_rezervace_id`, `hotel_rezervace_idUzivatel`, `hotel_rezervace_idPokoj`, `hotel_rezervace_den`) VALUES
(99, 2, 1, 1),
(114, 2, 1, 2),
(115, 3, 1, 0),
(117, 1, 2, 3),
(118, 1, 2, 4),
(119, 1, 4, 2),
(120, 1, 6, 4),
(121, 1, 1, 4),
(122, 4, 6, 3),
(123, 4, 5, 3),
(124, 4, 4, 3);

-- --------------------------------------------------------

--
-- Struktura tabulky `uziv`
--

CREATE TABLE IF NOT EXISTS `uziv` (
  `uziv_id` int(11) NOT NULL AUTO_INCREMENT,
  `uziv_login` varchar(50) COLLATE utf8_czech_ci NOT NULL,
  `uziv_heslo` varchar(50) COLLATE utf8_czech_ci NOT NULL,
  PRIMARY KEY (`uziv_id`),
  UNIQUE KEY `uziv_login` (`uziv_login`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_czech_ci AUTO_INCREMENT=4 ;

--
-- Vypisuji data pro tabulku `uziv`
--

INSERT INTO `uziv` (`uziv_id`, `uziv_login`, `uziv_heslo`) VALUES
(1, 'uziv1', 'be747d173d5d70c84372229465bb9d3d'),
(2, 'uziv2', 'c7ec97e3638a633dcd9d973715a4f4d4'),
(3, 'uziv3', '2b9e2249ce9e0dd53eff1b6322a057dc');
