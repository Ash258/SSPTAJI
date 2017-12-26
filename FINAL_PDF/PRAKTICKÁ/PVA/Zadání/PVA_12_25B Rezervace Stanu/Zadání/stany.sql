-- phpMyAdmin SQL Dump
-- version 3.3.3
-- http://www.phpmyadmin.net
--
-- Počítač: localhost
-- Vygenerováno: Sobota 21. února 2015, 19:55
-- Verze MySQL: 5.1.46
-- Verze PHP: 5.3.2

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Databáze: `stany`
--
CREATE DATABASE `stany` DEFAULT CHARACTER SET utf8 COLLATE utf8_czech_ci;
USE `stany`;

-- --------------------------------------------------------

--
-- Struktura tabulky `stany_rezervace`
--

CREATE TABLE IF NOT EXISTS `stany_rezervace` (
  `stany_rezervace_id` int(11) NOT NULL AUTO_INCREMENT,
  `stany_rezervace_stanId` int(11) NOT NULL,
  `stany_rezervace_uzivatelId` int(11) NOT NULL,
  PRIMARY KEY (`stany_rezervace_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_czech_ci AUTO_INCREMENT=4 ;

--
-- Vypisuji data pro tabulku `stany_rezervace`
--

INSERT INTO `stany_rezervace` (`stany_rezervace_id`, `stany_rezervace_stanId`, `stany_rezervace_uzivatelId`) VALUES
(1, 3, 1),
(2, 1, 2),
(3, 2, 2);

-- --------------------------------------------------------

--
-- Struktura tabulky `stany_stany`
--

CREATE TABLE IF NOT EXISTS `stany_stany` (
  `stany_stany_id` int(11) NOT NULL AUTO_INCREMENT,
  `stany_stany_nazevVyletu` varchar(100) COLLATE utf8_czech_ci NOT NULL,
  `stany_stany_pocetMist` int(11) NOT NULL,
  `stany_stany_vlastnikId` int(11) NOT NULL,
  PRIMARY KEY (`stany_stany_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_czech_ci AUTO_INCREMENT=4 ;

--
-- Vypisuji data pro tabulku `stany_stany`
--

INSERT INTO `stany_stany` (`stany_stany_id`, `stany_stany_nazevVyletu`, `stany_stany_pocetMist`, `stany_stany_vlastnikId`) VALUES
(1, 'Vylet 1', 2, 1),
(2, 'Vylet 2', 3, 1),
(3, 'Vylet 3', 1, 2);

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
(3, 'uziv3', '2b9e2249ce9e0dd53eff1b6322a057dc');
