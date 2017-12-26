-- phpMyAdmin SQL Dump
-- version 3.3.3
-- http://www.phpmyadmin.net
--
-- Počítač: localhost
-- Vygenerováno: Středa 15. dubna 2015, 22:11
-- Verze MySQL: 5.1.46
-- Verze PHP: 5.3.2

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Databáze: `eshop`
--
CREATE DATABASE `eshop` DEFAULT CHARACTER SET latin1 COLLATE latin1_general_ci;
USE `eshop`;

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

-- --------------------------------------------------------

--
-- Struktura tabulky `zbozi`
--

CREATE TABLE IF NOT EXISTS `zbozi` (
  `ID_zbozi` int(11) NOT NULL AUTO_INCREMENT,
  `nazev_zbozi` varchar(20) COLLATE latin1_general_ci NOT NULL,
  `popis_zbozi` varchar(80) COLLATE latin1_general_ci NOT NULL,
  `kategorie_zbozi` varchar(20) COLLATE latin1_general_ci NOT NULL,
  `cena_zbozi` varchar(20) COLLATE latin1_general_ci NOT NULL,
  PRIMARY KEY (`ID_zbozi`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci AUTO_INCREMENT=3 ;

--
-- Vypisuji data pro tabulku `zbozi`
--

INSERT INTO `zbozi` (`ID_zbozi`, `nazev_zbozi`, `popis_zbozi`, `kategorie_zbozi`, `cena_zbozi`) VALUES
(1, 'LCD monitor', 'Prodám starší LCD', 'Elektronika', '131'),
(2, 'Porcelánová sada', 'Prodám porcelénoovu sadu Bernadote', 'Starožitnosti', '511');

-- --------------------------------------------------------

--
-- Struktura tabulky `zbozi_uziv`
--

CREATE TABLE IF NOT EXISTS `zbozi_uziv` (
  `id_zbozi_uziv` int(11) NOT NULL AUTO_INCREMENT,
  `id_uzivatele` int(11) NOT NULL,
  `id_zbozi` int(11) NOT NULL,
  `pocet` int(11) NOT NULL,
  PRIMARY KEY (`id_zbozi_uziv`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci AUTO_INCREMENT=10 ;

--
-- Vypisuji data pro tabulku `zbozi_uziv`
--

INSERT INTO `zbozi_uziv` (`id_zbozi_uziv`, `id_uzivatele`, `id_zbozi`, `pocet`) VALUES
(1, 1, 1, 177),
(5, 1, 2, 80),
(3, 2, 1, 4),
(4, 2, 2, 15),
(8, 5, 1, 11),
(7, 4, 2, 2),
(9, 5, 2, 120);
