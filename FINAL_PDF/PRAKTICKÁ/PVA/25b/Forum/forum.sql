-- phpMyAdmin SQL Dump
-- version 3.3.3
-- http://www.phpmyadmin.net
--
-- Počítač: localhost
-- Vygenerováno: Neděle 06. dubna 2014, 13:34
-- Verze MySQL: 5.1.46
-- Verze PHP: 5.3.2

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Databáze: `forum`
--
CREATE DATABASE `forum` DEFAULT CHARACTER SET latin1 COLLATE latin1_general_ci;
USE `forum`;

-- --------------------------------------------------------

--
-- Struktura tabulky `reply`
--

CREATE TABLE IF NOT EXISTS `reply` (
  `idr` int(3) NOT NULL,
  `id_uz` varchar(30) COLLATE latin1_general_ci NOT NULL,
  `text` text COLLATE latin1_general_ci NOT NULL,
  PRIMARY KEY (`idr`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Vypisuji data pro tabulku `reply`
--

INSERT INTO `reply` (`idr`, `id_uz`, `text`) VALUES
(1, 'pospi', 'Radsi to nikomu nerikat');

-- --------------------------------------------------------

--
-- Struktura tabulky `uzivatele`
--

CREATE TABLE IF NOT EXISTS `uzivatele` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `login` varchar(15) COLLATE latin1_general_ci NOT NULL,
  `heslo` varchar(32) COLLATE latin1_general_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci AUTO_INCREMENT=4 ;

--
-- Vypisuji data pro tabulku `uzivatele`
--

INSERT INTO `uzivatele` (`id`, `login`, `heslo`) VALUES
(1, 'pospi', '0a08a131c83133aefa26b714fe02c158'),
(2, 'admin', '21232f297a57a5a743894a0e4a801fc3'),
(3, 'pecan', '2a1690396c1e7e60cef833400383ff49');

-- --------------------------------------------------------

--
-- Struktura tabulky `zaznamy`
--

CREATE TABLE IF NOT EXISTS `zaznamy` (
  `idz` int(5) NOT NULL AUTO_INCREMENT,
  `nazevz` varchar(15) CHARACTER SET utf8 COLLATE utf8_czech_ci DEFAULT NULL,
  `textz` varchar(512) CHARACTER SET utf8 COLLATE utf8_czech_ci NOT NULL,
  `login` varchar(15) CHARACTER SET utf8 COLLATE utf8_czech_ci NOT NULL,
  PRIMARY KEY (`idz`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci AUTO_INCREMENT=118 ;

--
-- Vypisuji data pro tabulku `zaznamy`
--

INSERT INTO `zaznamy` (`idz`, `nazevz`, `textz`, `login`) VALUES
(1, 'Pomoc', 'Jsem blbej jak pumpa na sane, co mam delat?', 'admin'),
(2, 'Stiznost', 'V horni patre v byte delaji mladosi nehoraznej bordel!!', 'pecan');
