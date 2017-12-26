-- phpMyAdmin SQL Dump
-- version 3.3.3
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Mar 02, 2014 at 08:41 PM
-- Server version: 5.1.46
-- PHP Version: 5.3.2

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Databáze: `kino`
--
CREATE DATABASE `kino` DEFAULT CHARACTER SET utf8 COLLATE utf8_czech_ci;
USE `kino`;

-- --------------------------------------------------------

--
-- Table structure for table `kino_rezervace`
--

CREATE TABLE IF NOT EXISTS `kino_rezervace` (
  `kino_rezervace_id` int(11) NOT NULL AUTO_INCREMENT,
  `kino_rezervace_idUzivatel` int(11) NOT NULL,
  `kino_rezervace_idSal` int(11) NOT NULL,
  `kino_rezervace_kreslo` int(11) NOT NULL,
  PRIMARY KEY (`kino_rezervace_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_czech_ci AUTO_INCREMENT=5 ;

--
-- Dumping data for table `kino_rezervace`
--

INSERT INTO `kino_rezervace` (`kino_rezervace_id`, `kino_rezervace_idUzivatel`, `kino_rezervace_idSal`, `kino_rezervace_kreslo`) VALUES
(1, 1, 1, 3),
(2, 1, 1, 4),
(3, 1, 3, 8),
(4, 2, 2, 1);

-- --------------------------------------------------------

--
-- Table structure for table `kino_saly`
--

CREATE TABLE IF NOT EXISTS `kino_saly` (
  `kino_saly_id` int(11) NOT NULL AUTO_INCREMENT,
  `kino_saly_nazev` varchar(50) COLLATE utf8_czech_ci NOT NULL,
  `kino_saly_program` varchar(100) COLLATE utf8_czech_ci NOT NULL,
  PRIMARY KEY (`kino_saly_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_czech_ci AUTO_INCREMENT=5 ;

--
-- Dumping data for table `kino_saly`
--

INSERT INTO `kino_saly` (`kino_saly_id`, `kino_saly_nazev`, `kino_saly_program`) VALUES
(1, 'sal 1', 'Hobit: Šmakova dračí poušť '),
(2, 'sal 2', 'Pulp Fiction'),
(3, 'sal 3', 'Postradatelní 2'),
(4, 'sal 4', 'Vlk z Wall Street ');

-- --------------------------------------------------------

--
-- Table structure for table `uziv`
--

CREATE TABLE IF NOT EXISTS `uziv` (
  `uziv_id` int(11) NOT NULL AUTO_INCREMENT,
  `uziv_login` varchar(50) COLLATE utf8_czech_ci NOT NULL,
  `uziv_heslo` varchar(50) COLLATE utf8_czech_ci NOT NULL,
  PRIMARY KEY (`uziv_id`),
  UNIQUE KEY `uziv_login` (`uziv_login`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_czech_ci AUTO_INCREMENT=5 ;

--
-- Dumping data for table `uziv`
--

INSERT INTO `uziv` (`uziv_id`, `uziv_login`, `uziv_heslo`) VALUES
(1, 'uziv1', 'be747d173d5d70c84372229465bb9d3d'),
(2, 'uziv2', 'c7ec97e3638a633dcd9d973715a4f4d4'),
(3, 'uziv3', '2b9e2249ce9e0dd53eff1b6322a057dc');
