-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 17, 2021 at 03:14 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.3.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `testingsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE `book` (
  `Id` int(11) NOT NULL,
  `BookName` varchar(45) NOT NULL,
  `IDCategory` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`Id`, `BookName`, `IDCategory`) VALUES
(1, 'Book1-1', 1),
(2, 'Book2-1', 1),
(3, 'Book3-2', 2),
(4, 'Book4-2', 2),
(5, 'Book5-3', 3);

-- --------------------------------------------------------

--
-- Table structure for table `cateclothes`
--

CREATE TABLE `cateclothes` (
  `idCateClothes` int(11) NOT NULL,
  `nameCateC` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cateclothes`
--

INSERT INTO `cateclothes` (`idCateClothes`, `nameCateC`) VALUES
(1, 'swimWear'),
(2, 'jeans'),
(3, 'dresses');

-- --------------------------------------------------------

--
-- Table structure for table `cateelectronics`
--

CREATE TABLE `cateelectronics` (
  `idCateElectronics` int(11) NOT NULL,
  `nameCateE` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cateelectronics`
--

INSERT INTO `cateelectronics` (`idCateElectronics`, `nameCateE`) VALUES
(1, 'tivi'),
(2, 'laptop'),
(3, 'cellphone');

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `IdCategory` int(11) NOT NULL,
  `NameCategory` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`IdCategory`, `NameCategory`) VALUES
(1, 'Trinh Tham'),
(2, 'Ngon Tinh'),
(3, 'Hanh Dong');

-- --------------------------------------------------------

--
-- Table structure for table `cateshoes`
--

CREATE TABLE `cateshoes` (
  `idCateShoes` int(11) NOT NULL,
  `nameCateS` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cateshoes`
--

INSERT INTO `cateshoes` (`idCateShoes`, `nameCateS`) VALUES
(1, 'sneaker'),
(2, 'boots'),
(3, 'LeatherShoes'),
(4, 'sandle');

-- --------------------------------------------------------

--
-- Table structure for table `clothes`
--

CREATE TABLE `clothes` (
  `idClo` int(11) NOT NULL,
  `nameClo` varchar(45) NOT NULL,
  `IDClothes` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `clothes`
--

INSERT INTO `clothes` (`idClo`, `nameClo`, `IDClothes`) VALUES
(1, 'clo1-swim', 1),
(2, 'clo2-swim', 1),
(3, 'clo3-jean', 2),
(4, 'clo4-jean', 2),
(5, 'clo5-dress', 3);

-- --------------------------------------------------------

--
-- Table structure for table `electronics`
--

CREATE TABLE `electronics` (
  `idEle` int(11) NOT NULL,
  `nameEle` varchar(45) NOT NULL,
  `IDElectronics` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `electronics`
--

INSERT INTO `electronics` (`idEle`, `nameEle`, `IDElectronics`) VALUES
(1, 'Elec1-tivi', '1'),
(2, 'Elec2-tivi', '1'),
(3, 'Elec3-lap', '2'),
(4, 'Elec4-lap', '2'),
(5, 'Elec5-phone', '3');

-- --------------------------------------------------------

--
-- Table structure for table `shoes`
--

CREATE TABLE `shoes` (
  `idS` int(11) NOT NULL,
  `nameS` varchar(45) NOT NULL,
  `IDShoes` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `shoes`
--

INSERT INTO `shoes` (`idS`, `nameS`, `IDShoes`) VALUES
(1, 'sho1-sneaker', 1),
(2, 'sho2-sne', 1),
(3, 'sho3-boo', 2),
(4, 'sho4-boo', 2),
(5, 'sho5-lea', 3),
(6, 'sho6-lea', 3),
(7, 'sho7-sand', 4);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` smallint(5) UNSIGNED NOT NULL,
  `username` char(50) NOT NULL CHECK (octet_length(`username`) >= 6 and octet_length(`username`) <= 50),
  `password` varchar(50) NOT NULL,
  `firstName` varchar(50) CHARACTER SET utf8 NOT NULL,
  `lastName` varchar(50) CHARACTER SET utf8 NOT NULL,
  `role` enum('Admin','Employee','Manager') NOT NULL DEFAULT 'Employee'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `password`, `firstName`, `lastName`, `role`) VALUES
(1, 'hanh.havan', '123456', 'Hà', 'Văn Hanh', 'Manager'),
(2, 'thanhhung12', '123456', 'Nguyễn ', 'Thanh Hưng', 'Manager'),
(3, 'can.tuananh', '123456', 'Cấn', 'Tuấn Anh', 'Manager'),
(4, 'toananh123', '123456', 'Nguyễn', 'Anh Toàn', 'Manager'),
(5, 'duynn03', '123456', 'Nguyễn', 'Duy', 'Manager'),
(6, 'manhhung123', '123456', 'Nguyễn', 'Mạnh Hùng', 'Manager'),
(7, 'maianhvti123', '123456', 'Nguyễn', 'Mai Anh', 'Employee'),
(8, 'tuanvti12344', '123456', 'Nguyễn', 'Văn Tuấn', 'Employee'),
(9, 'ngthuy123', '123456', 'Nguyễn', 'Thị Thủy', 'Employee'),
(10, 'quanganhvti', '123456', 'Nguyễn', 'Quang Anh', 'Manager'),
(11, 'hoanghungvti', '123456', 'Vũ', 'Hoàng Hưng', 'Employee'),
(12, 'quocanhvti', '123456', 'Nguyễn', 'Quốc Anh', 'Admin'),
(13, 'vananhvti', '123456', 'Nguyễn', 'Vân Anh', 'Employee'),
(14, 'mailanvti', '123456', 'Nguyễn', 'Ngọc Bảo Lan', 'Manager'),
(15, 'tuanhungvti', '123456', 'Vũ', 'Tuấn Hưng', 'Employee'),
(16, 'xuanmaivti', '123456', 'Nguyễn', 'Xuân Mai', 'Employee');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `cateclothes`
--
ALTER TABLE `cateclothes`
  ADD PRIMARY KEY (`idCateClothes`);

--
-- Indexes for table `cateelectronics`
--
ALTER TABLE `cateelectronics`
  ADD PRIMARY KEY (`idCateElectronics`);

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`IdCategory`);

--
-- Indexes for table `cateshoes`
--
ALTER TABLE `cateshoes`
  ADD PRIMARY KEY (`idCateShoes`);

--
-- Indexes for table `clothes`
--
ALTER TABLE `clothes`
  ADD PRIMARY KEY (`idClo`);

--
-- Indexes for table `electronics`
--
ALTER TABLE `electronics`
  ADD PRIMARY KEY (`idEle`);

--
-- Indexes for table `shoes`
--
ALTER TABLE `shoes`
  ADD PRIMARY KEY (`idS`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` smallint(5) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
