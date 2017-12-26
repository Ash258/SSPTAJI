-- phpMyAdmin SQL Dump
-- version 3.3.3
-- http://www.phpmyadmin.net
--
-- Počítač: localhost
-- Vygenerováno: Pondělí 25. února 2013, 19:06
-- Verze MySQL: 5.1.46
-- Verze PHP: 5.3.2

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Databáze: `pujcovna`
--
CREATE DATABASE `pujcovna` DEFAULT CHARACTER SET utf8 COLLATE utf8_czech_ci;
USE `pujcovna`;

-- --------------------------------------------------------

--
-- Struktura tabulky `puj_knihy`
--

CREATE TABLE IF NOT EXISTS `puj_knihy` (
  `puj_knihy_id` int(11) NOT NULL AUTO_INCREMENT,
  `puj_knihy_nazev` varchar(50) COLLATE utf8_czech_ci NOT NULL,
  `puj_knihy_autor` varchar(50) COLLATE utf8_czech_ci NOT NULL,
  `puj_knihy_zanr` varchar(50) COLLATE utf8_czech_ci NOT NULL,
  `puj_knihy_pocet` int(11) NOT NULL,
  PRIMARY KEY (`puj_knihy_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_czech_ci AUTO_INCREMENT=15 ;

--
-- Vypisuji data pro tabulku `puj_knihy`
--

INSERT INTO `puj_knihy` (`puj_knihy_id`, `puj_knihy_nazev`, `puj_knihy_autor`, `puj_knihy_zanr`, `puj_knihy_pocet`) VALUES
(1, 'The art of computer programming vol. 1', 'D. E. Knuth', 'Programming', 3),
(2, 'The art of computer programming vol. 2', 'D. E. Knuth', 'Programming', 3),
(3, 'The art of computer programming vol. 3', 'D. E. Knuth', 'Programming', 1),
(4, 'The C programming language', 'B. W. Kernighan & D. M. Ritchie', 'Programming', 0),
(5, 'C++ for Dummies', 'S. R. Davis', 'Programming', 3),
(6, 'A Discipline of Programming', 'E. W. Dijkstra', 'Programming', 0),
(7, 'Refactoring: Improving the Design of Existing Code', 'M. Fowler', 'Programming', 5),
(8, 'Ucebnice jazyka JAVA', 'P. Herout', 'Programming', 5),
(9, 'Ucebnice jazyka C', 'P. Herout', 'Programming', 9),
(10, 'The TeX Book', 'D. E. Knuth', 'Programming', 7),
(11, 'Concrete Mathematics', 'D. E. Knuth', 'Programming', 3),
(12, 'Mistrovstvi v C++', 'S. Prata', 'Programming', 6),
(13, 'C++ from the Ground up', 'H. Schild', 'Programming', 0),
(14, 'The C++ Programming Language', 'B. Stroustrup', 'Programming', 1);

-- --------------------------------------------------------

--
-- Struktura tabulky `puj_uzivatele`
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
-- --------------------------------------------------------

--
-- Struktura tabulky `puj_vypujcky`
--

CREATE TABLE IF NOT EXISTS `puj_vypujcky` (
  `puj_vyp_id` int(11) NOT NULL AUTO_INCREMENT,
  `puj_vyp_idUzivatel` int(11) NOT NULL,
  `puj_vyp_idKniha` int(11) NOT NULL,
  PRIMARY KEY (`puj_vyp_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_czech_ci AUTO_INCREMENT=15 ;

--
-- Vypisuji data pro tabulku `puj_vypujcky`
--

INSERT INTO `puj_vypujcky` (`puj_vyp_id`, `puj_vyp_idUzivatel`, `puj_vyp_idKniha`) VALUES
(1, 1, 4),
(2, 1, 1),
(3, 1, 8),
(4, 1, 6),
(5, 1, 11),
(6, 1, 9),
(7, 1, 13),
(8, 2, 1),
(9, 2, 3),
(10, 2, 6),
(11, 2, 10),
(12, 2, 8),
(13, 2, 13),
(14, 2, 7);
