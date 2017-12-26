-- phpMyAdmin SQL Dump
-- version 3.3.3
-- http://www.phpmyadmin.net
--
-- Počítač: localhost
-- Vygenerováno: Čtvrtek 31. března 2016, 21:42
-- Verze MySQL: 5.1.46
-- Verze PHP: 5.3.2

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Databáze: `prezident`
--
CREATE DATABASE `prezident` DEFAULT CHARACTER SET latin1 COLLATE latin1_general_ci;
USE `prezident`;

-- --------------------------------------------------------

--
-- Struktura tabulky `prezident`
--

CREATE TABLE IF NOT EXISTS `prezident` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Jmeno` varchar(50) COLLATE utf8_czech_ci NOT NULL,
  `Hlasy` int(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_czech_ci AUTO_INCREMENT=10 ;

--
-- Vypisuji data pro tabulku `prezident`
--

INSERT INTO `prezident` (`ID`, `Jmeno`, `Hlasy`) VALUES
(1, 'Miloš Zeman', 21),
(2, 'Karel Schwarzenberg', 17),
(3, 'Jan Fischer', 15),
(4, 'Jiří Dienstbier', 13),
(5, 'Vladimír Franz', 11),
(6, 'Zuzana Roithová', 9),
(7, 'Taťana Fischerová', 7),
(8, 'Přemysl Sobotka', 5),
(9, 'Jana Bobošíková', 3);

-- --------------------------------------------------------

--
-- Struktura tabulky `uziv`
--

CREATE TABLE IF NOT EXISTS `uziv` (
  `ID` int(30) NOT NULL AUTO_INCREMENT,
  `login` varchar(255) COLLATE utf8_czech_ci NOT NULL,
  `heslo` varchar(255) COLLATE utf8_czech_ci NOT NULL,
  `hlas` int(30) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_czech_ci AUTO_INCREMENT=2 ;

--
-- Vypisuji data pro tabulku `uziv`
--

