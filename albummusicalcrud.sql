-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 16-05-2024 a las 17:28:20
-- Versión del servidor: 5.7.36
-- Versión de PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `albummusicalcrud`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `artistas`
--

DROP TABLE IF EXISTS `artistas`;
CREATE TABLE IF NOT EXISTS `artistas` (
  `ID` int(11) NOT NULL,
  `Nombre` varchar(255) DEFAULT NULL,
  `PaisOrigen` varchar(255) DEFAULT NULL,
  `EstiloMusical` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `artistas`
--

INSERT INTO `artistas` (`ID`, `Nombre`, `PaisOrigen`, `EstiloMusical`) VALUES
(1, 'Michael Jackson', 'Gary, Indiana, Estados Unidos', 'Rock, Pop, R&B'),
(2, 'Freddie Mercury', 'Stone Town, Tanzania', 'Rock, Opera'),
(3, 'Lionel Richie', 'Alabama, Estados Unidos', 'Soul, R&B, funk'),
(4, 'Kenny Rogers', 'Houston, Texas, Estados Unidos', 'Country, pop'),
(5, 'Tina Turner', 'Estados Unidos (nacida en Alemania)', 'Rock, pop, soul'),
(6, 'Diana Ross', 'Michigan, Estados Unidos', 'Pop, soul, R&B'),
(7, 'Bruce Springsteen', 'Freehold, Nueva Jersey, Estados Unidos', 'Rock, folk'),
(8, 'Steve Perry', 'Hanford, California, Estados Unidos', 'Rock, pop'),
(9, 'Cyndi Lauper', 'Ozone Park, Queens, Nueva York, Estados Unidos', 'Pop, rock, new wave'),
(10, 'Bob Dylan', 'Duluth, Minnesota, Estados Unidos', 'Folk, rock, blues'),
(11, 'Ariana Grande', 'Estados Unidos', 'Pop, R&B'),
(12, 'Billie Eilish', 'Estados Unidos', 'Pop, electropop, alternative pop'),
(13, 'BTS', 'Corea del Sur', 'K-pop, pop, hip hop'),
(14, 'The Weeknd', 'Canada', 'Pop, R&B, alternative R&B'),
(15, 'Dua Lipa', 'Reino Unido', 'Pop, disco, funk'),
(16, 'Taylor Swift', 'Estados Unidos', 'Pop, country'),
(17, 'J Balvin', 'Medellin, Colombia', 'Reggaeton, Latin trap, pop latino'),
(18, 'Daddy Yankee', 'San Juan, Puerto Rico', 'Reggaeton, Latin trap, hip hop'),
(19, 'Anuel AA', 'Carolina, Puerto Rico', 'Reggaeton, Latin trap, hip hop'),
(20, 'Farruko', 'Bayamon, Puerto Rico', 'Reggaeton, Latin trap, pop latino');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cdsindividuales`
--

DROP TABLE IF EXISTS `cdsindividuales`;
CREATE TABLE IF NOT EXISTS `cdsindividuales` (
  `ID` int(11) NOT NULL,
  `Titulo` varchar(255) DEFAULT NULL,
  `Artista` varchar(255) DEFAULT NULL,
  `Genero` varchar(255) DEFAULT NULL,
  `Duracion` int(11) DEFAULT NULL,
  `Precio` float DEFAULT NULL,
  `ColeccionID` int(11) DEFAULT NULL,
  `CompaniaDiscograficaID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ColeccionID` (`ColeccionID`),
  KEY `CompaniaDiscograficaID` (`CompaniaDiscograficaID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cdsindividuales`
--

INSERT INTO `cdsindividuales` (`ID`, `Titulo`, `Artista`, `Genero`, `Duracion`, `Precio`, `ColeccionID`, `CompaniaDiscograficaID`) VALUES
(1122, 'HYStory', 'Michael Jackson', 'Rock, Soul, R&B', 42, 500, 1, 107),
(1133, 'Dawn FM', 'The Weeknd', 'Dance-Pop y Synth-Pop', 51, 180, 2, 102),
(7755, 'Dangerous', 'Michael Jackson', 'Rock, Soul, Rap', 77, 250, 3, 103);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `colecciones`
--

DROP TABLE IF EXISTS `colecciones`;
CREATE TABLE IF NOT EXISTS `colecciones` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Titulo` varchar(255) DEFAULT NULL,
  `Artistas` varchar(255) DEFAULT NULL,
  `Genero` varchar(255) DEFAULT NULL,
  `PrecioTotal` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=23 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `colecciones`
--

INSERT INTO `colecciones` (`ID`, `Titulo`, `Artistas`, `Genero`, `PrecioTotal`) VALUES
(1, 'Bandas de Rock', 'Guns N\' Roses, Queen, Bon Jovi', 'Rock, Pop', '80.00'),
(3, 'Grupos de Kpop', 'Bts, Blackpink, Twice', 'Kpop', '50.00'),
(15, 'Clasicos de la Musica Clasica', 'Ludwig van Beethoven, Wolfgang Amadeus Mozart, Johann Sebastian Bach', 'Musica Clasica', '60.00'),
(16, 'Iconos del Jazz', 'Miles Davis, John Coltrane, Charlie Parker, Ella Fitzgerald, Billie Holiday', 'Jazz', '55.00'),
(17, 'Leyendas del Pop', 'Michael Jackson, Madonna, Elvis Presley, Whitney Houston', 'Pop', '90.00'),
(18, 'Ritmos del Caribe', 'Bob Marley, Celia Cruz, Ruben Blades, Juan Luis Guerra', 'Salsa, Reggae, Merengue, Bachata', '40.00'),
(19, 'Antalogia de la Musica Electronica', 'Daft Punk, Skrillex, Deadmau5, Swedish House Mafia, Martin Garrix', 'Musica ElectrÃ³nica, EDM', '35.00'),
(20, 'Voces del Soul', 'Aretha Franklin, James Brown, Ray Charles, Otis Redding, Stevie Wonder', 'Soul, R&B	', '60.00'),
(21, 'Cantautores Legendarios	', 'Bob Dylan, Leonard Cohen, Joan Baez, Joni Mitchell, Paul Simon	', 'Folk, Rock	', '80.00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `companiasdiscograficas`
--

DROP TABLE IF EXISTS `companiasdiscograficas`;
CREATE TABLE IF NOT EXISTS `companiasdiscograficas` (
  `ID` int(11) NOT NULL,
  `Nombre` varchar(255) DEFAULT NULL,
  `Pais` varchar(255) DEFAULT NULL,
  `Ciudad` varchar(255) DEFAULT NULL,
  `Direccion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `companiasdiscograficas`
--

INSERT INTO `companiasdiscograficas` (`ID`, `Nombre`, `Pais`, `Ciudad`, `Direccion`) VALUES
(33, 'Universal Music', 'Reino Unido', 'Londres', '4 Pancras Square, Kings Cross, London N1C 4AG'),
(44, 'Sony Music', 'Estados Unidos', 'Nueva York', '25 Madison Ave, New York, NY 10010'),
(12, 'HYBE Corporation', 'Corea del Sur', 'Seul', '30, Jangchungdan-ro 60-gil, Jung-gu, Seoul');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
