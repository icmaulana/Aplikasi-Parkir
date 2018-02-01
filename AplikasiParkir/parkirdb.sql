-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Feb 01, 2018 at 09:40 AM
-- Server version: 5.6.16
-- PHP Version: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `parkirdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `jenis_kendaraan`
--

CREATE TABLE IF NOT EXISTS `jenis_kendaraan` (
  `id_jenis` int(10) NOT NULL AUTO_INCREMENT,
  `jenis` varchar(20) NOT NULL,
  `tarif` int(10) NOT NULL,
  PRIMARY KEY (`id_jenis`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `jenis_kendaraan`
--

INSERT INTO `jenis_kendaraan` (`id_jenis`, `jenis`, `tarif`) VALUES
(1, 'Roda 2', 2000),
(2, 'Roda 4', 5000);

-- --------------------------------------------------------

--
-- Table structure for table `parkir_data`
--

CREATE TABLE IF NOT EXISTS `parkir_data` (
  `id_parkir` int(10) NOT NULL AUTO_INCREMENT,
  `nomor_polisi` varchar(16) NOT NULL,
  `id_jenis` varchar(10) NOT NULL,
  `masuk` datetime NOT NULL,
  `keluar` datetime DEFAULT NULL,
  PRIMARY KEY (`id_parkir`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=42 ;

--
-- Dumping data for table `parkir_data`
--

INSERT INTO `parkir_data` (`id_parkir`, `nomor_polisi`, `id_jenis`, `masuk`, `keluar`) VALUES
(17, 'N 2341 LW', '1', '2016-05-18 09:11:44', '2016-05-18 09:12:50'),
(18, 'N 2341 AS', '1', '2016-05-18 09:46:15', '2016-05-30 15:34:08'),
(19, 'L 3242 FA', '2', '2016-05-18 09:52:24', '2016-05-30 17:02:32'),
(20, 'N 3265 AA', '1', '2016-05-30 17:03:09', '2016-05-30 17:03:26'),
(21, 'L 2233 AV', '1', '2016-05-30 17:04:15', '2016-05-30 17:04:25'),
(23, 'TES', '1', '2016-05-30 17:21:40', '2016-05-31 14:26:44'),
(24, 'TES', '1', '2016-05-30 17:26:49', '2016-05-31 14:26:44'),
(25, 'TES', '1', '2016-05-30 19:20:22', '2016-05-31 14:26:44'),
(26, 'tes', '1', '2016-05-30 21:43:20', '2016-05-31 14:26:44'),
(27, 'TES', '1', '2016-05-31 09:47:40', '2016-05-31 14:26:44'),
(28, 'coba', '1', '2016-05-31 10:13:42', '2016-05-31 10:14:10'),
(29, 'lagi', '1', '2016-05-31 10:15:20', '2016-05-31 11:37:42'),
(30, 'la', '1', '2016-05-31 10:17:36', '2016-05-31 10:17:42'),
(31, 'a', '1', '2016-05-31 10:23:41', '2016-05-31 10:27:22'),
(32, 'ya', '1', '2016-05-31 10:26:30', '2016-05-31 10:26:34'),
(33, 'A', '1', '2016-05-31 10:27:17', '2016-05-31 10:27:22'),
(34, 'w', '1', '2016-05-31 10:29:15', '2016-05-31 10:29:20'),
(35, 'AS', '2', '2016-05-31 11:27:36', '2016-05-31 11:28:29'),
(36, 'uji', '2', '2016-05-31 11:36:55', '2016-05-31 11:37:04'),
(37, 'LAGI', '1', '2016-05-31 11:37:30', '2016-05-31 11:37:42'),
(38, 'yha', '1', '2016-05-31 11:42:25', '2016-05-31 11:44:33'),
(39, 'L 4659 NN', '2', '2016-05-31 12:02:44', '2016-05-31 12:03:14'),
(40, 'L 666 R', '2', '2016-05-31 14:24:22', NULL),
(41, 'TES', '1', '2016-05-31 14:26:40', '2016-05-31 14:26:44');

-- --------------------------------------------------------

--
-- Table structure for table `petugas`
--

CREATE TABLE IF NOT EXISTS `petugas` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `tipe` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `petugas`
--

INSERT INTO `petugas` (`username`, `password`, `tipe`) VALUES
('iqbal', '66', 1),
('ptgs', '05', 2);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
