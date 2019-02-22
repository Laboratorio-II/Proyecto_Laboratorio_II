-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 22-02-2019 a las 02:40:09
-- Versión del servidor: 5.7.24
-- Versión de PHP: 7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyecto_laboratorio_ii`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `areas_profesionales`
--

DROP TABLE IF EXISTS `areas_profesionales`;
CREATE TABLE IF NOT EXISTS `areas_profesionales` (
  `id` int(10) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `estatus` char(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cargos`
--

DROP TABLE IF EXISTS `cargos`;
CREATE TABLE IF NOT EXISTS `cargos` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) NOT NULL,
  `estatus` char(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carreras`
--

DROP TABLE IF EXISTS `carreras`;
CREATE TABLE IF NOT EXISTS `carreras` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `idArea` int(10) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `estatus` char(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudades`
--

DROP TABLE IF EXISTS `ciudades`;
CREATE TABLE IF NOT EXISTS `ciudades` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `ciudades` int(10) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `estatus` char(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `conocimientos`
--

DROP TABLE IF EXISTS `conocimientos`;
CREATE TABLE IF NOT EXISTS `conocimientos` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `usuario` int(10) DEFAULT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `estatus` char(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `conocimientos`
--

INSERT INTO `conocimientos` (`id`, `usuario`, `nombre`, `estatus`) VALUES
(1, 33, 'Ingles', 'A'),
(2, 33, 'PHP', 'A'),
(3, 33, 'Java', 'A'),
(4, 33, 'SQL', 'A'),
(5, 33, 'Redes', 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `crear_oferta`
--

DROP TABLE IF EXISTS `crear_oferta`;
CREATE TABLE IF NOT EXISTS `crear_oferta` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `idempresa` int(11) NOT NULL,
  `descripcion` varchar(50) NOT NULL,
  `estado` int(10) NOT NULL,
  `area` int(10) NOT NULL,
  `dedicacion` int(10) NOT NULL,
  `salario` float NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=51 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `crear_oferta`
--

INSERT INTO `crear_oferta` (`id`, `idempresa`, `descripcion`, `estado`, `area`, `dedicacion`, `salario`) VALUES
(5, 5, 'e', 5, 5, 5, 300000),
(39, 23, 'zai thazte el cafee pero negroo y con azucar menor', 14, 9, 1, 120000),
(38, 23, 'hermes es un webo en la vistaa', 14, 9, 1, 140000),
(40, 23, 'marcell es un idiota que no ve la vista', 14, 9, 1, 75000),
(41, 23, 'comida y gatos', 19, 4, 1, 150000),
(42, 23, 'aaaaaaaaaaaaaaa', 3, 3, 2, 222),
(43, 23, 'aaaaaaaaaaaaaaa', 17, 3, 3, 2222),
(44, 23, 'aaaaaaaaaaaaaaa', 18, 5, 2, 4444),
(45, 23, 'aaaaaaaaaaaaaaa', 18, 5, 2, 4444),
(46, 23, 'aaaaaaaaaaaaaaa', 17, 3, 2, 120000),
(47, 23, 'sdfsdf', 6, 5, 3, 2.22222e15),
(48, 23, 'sdfsdf', 5, 2, 3, 1111110000),
(49, 23, 'aaaaaaaaaaaaaaa', 3, 3, 2, 120000),
(50, 23, 'rstsrdsdgsdfgsdf', 3, 2, 3, 123457000000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cv_empresas`
--

DROP TABLE IF EXISTS `cv_empresas`;
CREATE TABLE IF NOT EXISTS `cv_empresas` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `usuarioP` int(10) DEFAULT NULL,
  `usuarioE` int(10) DEFAULT NULL,
  `nombreUsuario` varchar(30) DEFAULT NULL,
  `nombreEmpresa` varchar(30) DEFAULT NULL,
  `fecha_agregado` date DEFAULT NULL,
  `estatus` char(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cv_empresas`
--

INSERT INTO `cv_empresas` (`id`, `usuarioP`, `usuarioE`, `nombreUsuario`, `nombreEmpresa`, `fecha_agregado`, `estatus`) VALUES
(1, 33, 34, ' Usuario 33', 'Empresas Polar', '2019-02-06', 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `datos_laborales`
--

DROP TABLE IF EXISTS `datos_laborales`;
CREATE TABLE IF NOT EXISTS `datos_laborales` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `usuario` int(10) DEFAULT NULL,
  `empresa` varchar(30) DEFAULT NULL,
  `cargo` varchar(30) DEFAULT NULL,
  `area` int(10) DEFAULT NULL,
  `estado` char(1) DEFAULT NULL,
  `periodo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `datos_laborales`
--

INSERT INTO `datos_laborales` (`id`, `usuario`, `empresa`, `cargo`, `area`, `estado`, `periodo`) VALUES
(1, 33, 'polar', 'jefe', 1, 'A', 'sdfs'),
(2, 33, 'asdasd', 'adas', 1, 'S', 'awda'),
(5, 33, 'v', '', 0, 'S', ''),
(6, 33, 'h', '', 0, 'S', ''),
(14, 33, 'volvera', '', 0, 'S', ''),
(17, 33, 'boton', '', 8, 'S', ''),
(18, 33, 'jkhkj', 'ikjk', 2, '2', 'kjhk'),
(19, 34, NULL, NULL, NULL, 'U', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `datos_personales`
--

DROP TABLE IF EXISTS `datos_personales`;
CREATE TABLE IF NOT EXISTS `datos_personales` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `usuario` int(10) NOT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `apellido` varchar(30) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `estado_civil` char(1) DEFAULT NULL,
  `telefono` varchar(12) DEFAULT NULL,
  `pais` int(10) DEFAULT NULL,
  `estado` int(10) DEFAULT NULL,
  `ciudad` int(10) DEFAULT NULL,
  `genero` char(1) DEFAULT NULL,
  `descripcion` varchar(50) DEFAULT NULL,
  `estatus` char(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `datos_personales`
--

INSERT INTO `datos_personales` (`id`, `usuario`, `nombre`, `apellido`, `fecha_nacimiento`, `estado_civil`, `telefono`, `pais`, `estado`, `ciudad`, `genero`, `descripcion`, `estatus`) VALUES
(2, 33, 'marcell raul ', 'Viera Ochoa', '2019-02-23', 'S', '0412', 1, 0, 1, 'M', 'cuidadoa venezola', 'A'),
(3, 34, NULL, NULL, NULL, 'U', NULL, NULL, NULL, NULL, 'U', NULL, 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dedicaciones`
--

DROP TABLE IF EXISTS `dedicaciones`;
CREATE TABLE IF NOT EXISTS `dedicaciones` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(50) NOT NULL,
  `horastrabajadas` int(10) NOT NULL,
  `estatus` char(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empresas`
--

DROP TABLE IF EXISTS `empresas`;
CREATE TABLE IF NOT EXISTS `empresas` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `usuario` int(10) DEFAULT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `rif` varchar(20) DEFAULT NULL,
  `pais` int(10) DEFAULT NULL,
  `estado` int(10) DEFAULT NULL,
  `ciudad` int(10) DEFAULT NULL,
  `direccion` varchar(30) DEFAULT NULL,
  `descripcion` varchar(50) DEFAULT NULL,
  `estatus` char(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `empresas`
--

INSERT INTO `empresas` (`id`, `usuario`, `nombre`, `rif`, `pais`, `estado`, `ciudad`, `direccion`, `descripcion`, `estatus`) VALUES
(1, 34, 'UCLA', '12345678', 1, 14, 0, NULL, 'Esta es una empresa de prueba', 'A'),
(2, 39, 'UCLA', '12345678', 1, 14, 0, NULL, 'Esta es una empresa de prueba', 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estados`
--

DROP TABLE IF EXISTS `estados`;
CREATE TABLE IF NOT EXISTS `estados` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `pais` int(10) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `estatus` char(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudios_formales`
--

DROP TABLE IF EXISTS `estudios_formales`;
CREATE TABLE IF NOT EXISTS `estudios_formales` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `usuario` int(10) DEFAULT NULL,
  `centro` varchar(30) DEFAULT NULL,
  `nivel` int(10) DEFAULT NULL,
  `estado` char(1) DEFAULT NULL,
  `periodo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `estudios_formales`
--

INSERT INTO `estudios_formales` (`id`, `usuario`, `centro`, `nivel`, `estado`, `periodo`) VALUES
(1, 33, 'hasdasd', 2, 'a', 'asfdf'),
(2, 33, 'aaaa', 2, 'C', 'kkk'),
(3, 33, 'qqqqqq', 5, 'C', 'nnnn'),
(4, 33, 'wqerwerwe', 1, 'C', 'nnn'),
(5, 33, '666', 3, 'C', 'gg'),
(6, 33, 'pppppp', 3, 'C', 'gg'),
(7, 33, 'peometo', 2, 'C', 'hhhhhhhhhhhhhhhh'),
(9, 33, 'nuevo', 1, 'C', ''),
(10, 33, 'joojo', 4, 'C', 'hjkhk'),
(11, 33, 'kjhk', 2, 'C', ''),
(12, 34, NULL, NULL, 'U', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `etapas`
--

DROP TABLE IF EXISTS `etapas`;
CREATE TABLE IF NOT EXISTS `etapas` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(50) NOT NULL,
  `estatus` char(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `idiomas`
--

DROP TABLE IF EXISTS `idiomas`;
CREATE TABLE IF NOT EXISTS `idiomas` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) NOT NULL,
  `estatus` char(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paises`
--

DROP TABLE IF EXISTS `paises`;
CREATE TABLE IF NOT EXISTS `paises` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) NOT NULL,
  `estatus` char(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personas_a_cargo`
--

DROP TABLE IF EXISTS `personas_a_cargo`;
CREATE TABLE IF NOT EXISTS `personas_a_cargo` (
  `id` int(10) NOT NULL,
  `usuario` int(10) DEFAULT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `apellido` varchar(30) DEFAULT NULL,
  `cargo` varchar(30) DEFAULT NULL,
  `telefono` varchar(12) DEFAULT NULL,
  `estatus` char(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `personas_a_cargo`
--

INSERT INTO `personas_a_cargo` (`id`, `usuario`, `nombre`, `apellido`, `cargo`, `telefono`, `estatus`) VALUES
(1, 34, 'acargo', '', 'Selecciona tu cargo', '', 'A'),
(2, 39, ' ', ' ', ' ', ' ', 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `postulaciones`
--

DROP TABLE IF EXISTS `postulaciones`;
CREATE TABLE IF NOT EXISTS `postulaciones` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `idcv` int(10) NOT NULL,
  `nroetapa` int(10) NOT NULL,
  `fechapostulacion` date NOT NULL,
  `idoferta` int(10) NOT NULL,
  `estatus` char(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE IF NOT EXISTS `usuarios` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `email` varchar(30) COLLATE utf8_spanish2_ci NOT NULL,
  `pass` varchar(30) COLLATE utf8_spanish2_ci NOT NULL,
  `rol` int(2) NOT NULL,
  `estatus` char(1) COLLATE utf8_spanish2_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `email`, `pass`, `rol`, `estatus`) VALUES
(2, 'zaidi@gmail.com', '123', 2, 'I'),
(6, 'marcell@gmqil', '6', 6, 'A'),
(18, 'pruebaseion@fdsd.com', '123', 2, 'A'),
(19, 'orta@fas.com', '123', 2, 'A'),
(20, 'orta@fas.com', '123', 2, 'A'),
(21, '111@asf.com', '1231', 2, 'A'),
(22, 'epal@sdf.com', '213', 2, 'A'),
(23, 'holaaa@asfd.com', '123', 2, 'A'),
(24, 'noo@safd.com', '213', 2, 'A'),
(25, 'personales@sefd.com', '23423r', 2, 'A'),
(26, 'personales@sefd.com', 'qweqw', 2, 'A'),
(27, 'sfsdf@sdfs.com', 'werwe', 2, 'A'),
(28, 'otra@asfda.com', 'sfd', 2, 'A'),
(29, 'tttt@safs.com', 'sdf', 2, 'A'),
(30, 'hanaa@gsdg.com', 'afas', 2, 'A'),
(31, 'csdfgsd@sfs.com', 'f', 2, 'A'),
(32, 'AHROASI@safs.com', 'sdfs', 2, 'A'),
(33, 'aaaaaa@asd.com', 'sdfs', 2, 'A'),
(34, 'marcellraul20@gmail.com', 'sorelis8', 2, 'A'),
(35, 'marcellraul20@gmail.com', 'sorelis8', 3, 'A');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
