-- phpMyAdmin SQL Dump
-- version 3.3.3
-- http://www.phpmyadmin.net
--
-- Počítač: localhost
-- Vygenerováno: Středa 15. dubna 2015, 22:13
-- Verze MySQL: 5.1.46
-- Verze PHP: 5.3.2

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Databáze: `telefony`
--
CREATE DATABASE `telefony` DEFAULT CHARACTER SET utf8 COLLATE utf8_czech_ci;
USE `telefony`;

-- --------------------------------------------------------

--
-- Struktura tabulky `telefony_domacnosti`
--

CREATE TABLE IF NOT EXISTS `telefony_domacnosti` (
  `telefony_domacnosti_id` int(11) NOT NULL AUTO_INCREMENT,
  `telefony_domacnosti_jmeno` varchar(50) COLLATE utf8_czech_ci NOT NULL,
  `telefony_domacnosti_mesto` varchar(50) COLLATE utf8_czech_ci NOT NULL,
  `telefony_domacnosti_telefon` int(11) NOT NULL,
  PRIMARY KEY (`telefony_domacnosti_id`),
  UNIQUE KEY `telefony_domacnsoti_cislo` (`telefony_domacnosti_telefon`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_czech_ci AUTO_INCREMENT=15 ;

--
-- Vypisuji data pro tabulku `telefony_domacnosti`
--

INSERT INTO `telefony_domacnosti` (`telefony_domacnosti_id`, `telefony_domacnosti_jmeno`, `telefony_domacnosti_mesto`, `telefony_domacnosti_telefon`) VALUES
(1, 'Jmeno 1', 'Praha', 456987),
(2, 'Jmeno 2', 'Brno', 222222222),
(3, 'Jmeno 3', 'Praha', 333333333),
(14, 'Pokus1', 'Ritka', 987456);

-- --------------------------------------------------------

--
-- Struktura tabulky `telefony_firmy`
--

CREATE TABLE IF NOT EXISTS `telefony_firmy` (
  `telefony_firmy_id` int(11) NOT NULL AUTO_INCREMENT,
  `telefony_firmy_nazev` varchar(50) COLLATE utf8_czech_ci NOT NULL,
  `telefony_firmy_ico` int(11) NOT NULL,
  `telefony_firmy_mesto` varchar(50) COLLATE utf8_czech_ci NOT NULL,
  `telefony_firmy_telefon` int(11) NOT NULL,
  PRIMARY KEY (`telefony_firmy_id`),
  UNIQUE KEY `telefony_firmy_telefon` (`telefony_firmy_telefon`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_czech_ci AUTO_INCREMENT=5 ;

--
-- Vypisuji data pro tabulku `telefony_firmy`
--

INSERT INTO `telefony_firmy` (`telefony_firmy_id`, `telefony_firmy_nazev`, `telefony_firmy_ico`, `telefony_firmy_mesto`, `telefony_firmy_telefon`) VALUES
(2, 'Firma 2', 456, 'Jihlava', 666668),
(3, 'Firma 3', 789, 'Brno', 777777777),
(4, 'Firma 4', 147, 'Liberec', 888888888);

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
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_czech_ci AUTO_INCREMENT=5 ;

--
-- Vypisuji data pro tabulku `uziv`
--

INSERT INTO `uziv` (`uziv_id`, `uziv_login`, `uziv_heslo`) VALUES
(1, 'uziv1', 'be747d173d5d70c84372229465bb9d3d'),
(2, 'uziv2', 'c7ec97e3638a633dcd9d973715a4f4d4'),
(3, 'uziv3', '2b9e2249ce9e0dd53eff1b6322a057dc'),
(4, 'aaa', '47bce5c74f589f4867dbd57e9ca9f808');
