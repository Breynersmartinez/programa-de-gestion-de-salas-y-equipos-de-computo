-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: estudiantes_ucc
-- ------------------------------------------------------
-- Server version	8.0.34

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `auxiliar`
--

DROP TABLE IF EXISTS `auxiliar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `auxiliar` (
  `idauxiliar` int NOT NULL,
  `documentoidentidad` int NOT NULL,
  `nombres` varchar(100) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  PRIMARY KEY (`idauxiliar`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `auxiliar`
--

LOCK TABLES `auxiliar` WRITE;
/*!40000 ALTER TABLE `auxiliar` DISABLE KEYS */;
INSERT INTO `auxiliar` VALUES (1,1143234567,'Andres','Iniesta'),(2,6975425,'Carlos Andres','Chamorro Ordoñes'),(3,1108704890,'Breyner Paul','Agudelo Muñoz');
/*!40000 ALTER TABLE `auxiliar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `equipo`
--

DROP TABLE IF EXISTS `equipo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `equipo` (
  `idequipo` int NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(100) NOT NULL,
  `sala` varchar(100) NOT NULL,
  `tipoequipo` varchar(100) NOT NULL,
  PRIMARY KEY (`idequipo`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipo`
--

LOCK TABLES `equipo` WRITE;
/*!40000 ALTER TABLE `equipo` DISABLE KEYS */;
INSERT INTO `equipo` VALUES (1,'hp_Desktop','301','escritorio'),(2,'hp_Desktop','301','escritorio'),(3,'SMP1','sala movil','portatil'),(4,'SMP2','SALA MOVIL','portatil');
/*!40000 ALTER TABLE `equipo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `facultad`
--

DROP TABLE IF EXISTS `facultad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `facultad` (
  `idfacultad` int NOT NULL,
  `descripcion` varchar(255) NOT NULL,
  PRIMARY KEY (`idfacultad`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `facultad`
--

LOCK TABLES `facultad` WRITE;
/*!40000 ALTER TABLE `facultad` DISABLE KEYS */;
INSERT INTO `facultad` VALUES (1,'Facultad de Ciencias Administrativas Económicas y Contables'),(2,'Facultad de Derecho'),(3,'Facultad de Ingeniería'),(4,'Facultad de Psicologia');
/*!40000 ALTER TABLE `facultad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prestamo`
--

DROP TABLE IF EXISTS `prestamo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prestamo` (
  `idprestamo` int NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(100) NOT NULL,
  `idusuario` int NOT NULL,
  `idequipo` int NOT NULL,
  `idauxiliar` int NOT NULL,
  PRIMARY KEY (`idprestamo`),
  KEY `rel_prest_equipo` (`idequipo`),
  CONSTRAINT `rel_prest_equipo` FOREIGN KEY (`idequipo`) REFERENCES `equipo` (`idequipo`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prestamo`
--

LOCK TABLES `prestamo` WRITE;
/*!40000 ALTER TABLE `prestamo` DISABLE KEYS */;
INSERT INTO `prestamo` VALUES (1,'Prestamo con cedula profesor porque no trajo carné',1,2,2),(2,'Prestamo usuario invitado',3,3,1),(3,'Prestamo usuario invitado',5,4,3);
/*!40000 ALTER TABLE `prestamo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prestamo_salas`
--

DROP TABLE IF EXISTS `prestamo_salas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prestamo_salas` (
  `idprestamo_SALAS` int NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(100) NOT NULL,
  `bloqueado` varchar(100) NOT NULL,
  `usuario` varchar(100) NOT NULL,
  `numerodocumento` int NOT NULL,
  `idequipo` int NOT NULL,
  `equipo` varchar(100) NOT NULL,
  `descripcion_equipo` varchar(100) NOT NULL,
  `sala_del_equipo` varchar(100) NOT NULL,
  `tipoequipo` varchar(100) NOT NULL,
  `documentoidentidad_aux` int NOT NULL,
  `nombres_aux` varchar(100) NOT NULL,
  `apellidos_aux` varchar(100) NOT NULL,
  PRIMARY KEY (`idprestamo_SALAS`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prestamo_salas`
--

LOCK TABLES `prestamo_salas` WRITE;
/*!40000 ALTER TABLE `prestamo_salas` DISABLE KEYS */;
INSERT INTO `prestamo_salas` VALUES (1,'CON TARJETA','no','BREYNER',1107840704,1,'hp_Desktop','NINGUNA','301','ESCRITORIO',1143234567,'Andres','Iniesta'),(2,'CON TARJETA','NO','MARIANO ANDRES',1234567,3,'SMP1','ENTREGADO EN BUEN ESTADO','SALA MOVIL','PORTATIL',6975425,'Carlos Andres','Chamorro Ordoñes');
/*!40000 ALTER TABLE `prestamo_salas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `programa`
--

DROP TABLE IF EXISTS `programa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `programa` (
  `idprograma` int NOT NULL,
  `descripcion` varchar(255) NOT NULL,
  PRIMARY KEY (`idprograma`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `programa`
--

LOCK TABLES `programa` WRITE;
/*!40000 ALTER TABLE `programa` DISABLE KEYS */;
INSERT INTO `programa` VALUES (1,'Ingeniería de Sistemas'),(2,'Ingeniería Industrial'),(3,'Ingeniería Ambiental'),(4,'Psicologia'),(5,'Administracion de empresas'),(6,'Derecho'),(7,'Comercio internacional'),(8,'Contaduria publica');
/*!40000 ALTER TABLE `programa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sala`
--

DROP TABLE IF EXISTS `sala`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sala` (
  `idsala` int NOT NULL,
  `descripcion` varchar(255) NOT NULL,
  PRIMARY KEY (`idsala`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sala`
--

LOCK TABLES `sala` WRITE;
/*!40000 ALTER TABLE `sala` DISABLE KEYS */;
INSERT INTO `sala` VALUES (1,'301'),(2,'302'),(3,'303'),(4,'Sala Móvil');
/*!40000 ALTER TABLE `sala` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipoequipo`
--

DROP TABLE IF EXISTS `tipoequipo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipoequipo` (
  `idtipoequipo` int NOT NULL,
  `descripcion` varchar(255) NOT NULL,
  PRIMARY KEY (`idtipoequipo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipoequipo`
--

LOCK TABLES `tipoequipo` WRITE;
/*!40000 ALTER TABLE `tipoequipo` DISABLE KEYS */;
INSERT INTO `tipoequipo` VALUES (1,'Escritorio'),(2,'Pórtatil');
/*!40000 ALTER TABLE `tipoequipo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipousuario`
--

DROP TABLE IF EXISTS `tipousuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipousuario` (
  `idtipousuario` int NOT NULL,
  `descripcion` varchar(255) NOT NULL,
  PRIMARY KEY (`idtipousuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipousuario`
--

LOCK TABLES `tipousuario` WRITE;
/*!40000 ALTER TABLE `tipousuario` DISABLE KEYS */;
INSERT INTO `tipousuario` VALUES (1,'Profesor'),(2,'Estudiante'),(3,'Invitado'),(4,'Funcionario');
/*!40000 ALTER TABLE `tipousuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `idusuario` int NOT NULL AUTO_INCREMENT,
  `numerodocumento` int NOT NULL,
  `nombres` varchar(100) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  `semestre` int DEFAULT NULL,
  `jornada` varchar(100) DEFAULT NULL,
  `programa` varchar(100) NOT NULL,
  `tipousuario` varchar(100) NOT NULL,
  `facultad` varchar(100) NOT NULL,
  `numerocelular` varchar(11) NOT NULL,
  `dependencia` varchar(11) NOT NULL,
  PRIMARY KEY (`idusuario`)
) ENGINE=InnoDB AUTO_INCREMENT=2659 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,147,'jhon','cano',NULL,NULL,'Ingenieria de sistemas','profesor','ingenieria','',''),(2,365,'andres','lopez',2,'Nocturno','Ingenieria de sistemas','estudiante','ingenieria','',''),(4,25346,'Sebastian','Tejada',2,'Nocturno','Ingenieria de sistemas','estudiante','ingenieria','',''),(5,25346,'Sebastian','herrera',3,'Nocturno','Ingenieria industrial','estudiante','ingenieria','',''),(6,2582346,'carlos','andres',9,'Nocturno','Ingenieria de sistemas','estudiante','ingenieria','',''),(7,1234567,'Mariano','andres',6,'Nocturno','Ingenieria ambiental','estudiante','ingenieria','',''),(8,0,'julian dad','muñoz pdofvp',NULL,NULL,'ingenieria de sistemas','Invitado','','',''),(9,0,'hfmfmdm','ghmghmghm',NULL,NULL,'mgdhmgdhm','Invitado','','',''),(10,0,'vsrfvsfdv','fdvbsdfvbsdb',NULL,NULL,'fdbsdfbsdf','Invitado','','',''),(11,0,'hgjvghjhj','ghjvgjghjvh',NULL,NULL,'ghjhjhgjgh','Invitado','','',''),(12,0,'dsvsdvsd','dsvsdvsd',NULL,NULL,'sdvsdvdsvdv','Invitado','','',''),(13,727516156,'fdbdfbdfb','dfbdfbdf',NULL,NULL,'fdbdfbfdb','Invitado','','',''),(14,0,'huvjhv','dgbcb',NULL,NULL,'fdbdfbf','Invitado','','',''),(15,165161615,'gebgerb','fbefbeb',NULL,NULL,'fbefbdfe','Invitado','','',''),(16,561651651,'gloria amparo','muñoz soscue',NULL,NULL,'ingenieria desistemas','Invitado','','',''),(17,15161651,'juan david ','perez murcia',NULL,NULL,'ingenieria industrial','Invitado','','',''),(18,161616155,'8H8UH8H8H','JASBULLA',NULL,NULL,'DERECHO','Invitado','','',''),(19,516161,'GHMGHMGH','HMGHNMHG',NULL,NULL,'HNFHNDF','Invitado','','',''),(20,123456789,'abigail ','past nets ',NULL,NULL,'ingenieria ambenta','Invitado','','',''),(21,16516156,'dfvbdfv','dfbzdfb',NULL,NULL,'dfbdfb','Invitado','','',''),(22,1665165,'cvb df ','df ',NULL,NULL,'df df ','Invitado','','',''),(23,26424,'26424','fdzbdzfb',NULL,NULL,'dfbzdf','PROFESOR','dfbzdf','',''),(24,1234,'BRTFDF','BDFB',NULL,NULL,'FDBDF','PROFESOR','FDBDF','',''),(25,0,'CALOS DAVID ','HENSH ',NULL,NULL,'INGE','PROFESOR','INGE','',''),(26,516165,'fbdfbd','dfbfd',NULL,NULL,'dbd','Invitado','','',''),(27,321,'bfbfgbdf','xfgbfbfg',NULL,NULL,'fgnfn','PROFESOR','fgnfn','565616','fgnfgn'),(28,0,'dfgbn','dasfgbh',6,'fbgb','dsfgh','ESTUDIANTE','0','6',''),(29,0,'dfgbn','dasfgbh',6,'fbgb','dsfgh','ESTUDIANTE','0','6',''),(30,0,'sandi','durazno',0,'mañana','ingenieria','ESTUDIANTE','ingenieria','123644',''),(31,0,'sandi','durazno',0,'mañana','ingenieria','ESTUDIANTE','ingenieria','123644',''),(32,0,'primero','segundo',0,'mañana','ingenieria ','ESTUDIANTE','ingenieria ','3103215698',''),(33,0,'segundo ','muñoz jojoa',0,'mañana','ingenieria ','ESTUDIANTE','ingenieria ','310651',''),(34,0,'segundo ','muñoz jojoa',0,'mañana','ingenieria ','ESTUDIANTE','ingenieria ','310651',''),(35,0,'edgar','muñoz s',0,'mañana','derecho','ESTUDIANTE','derecho','3513513',''),(36,0,'hermencia','soscue boti',0,'mañana','ing sistemas e ind','ESTUDIANTE','ingenieria','3103215685',''),(37,0,'hermencia,','soscue boti',0,'mañana','ing sistemas e ind','ESTUDIANTE','ingenieria','3103215685',''),(38,0,'hermencia,.','soscue boti',0,'mañana','ing sistemas e ind','ESTUDIANTE','ingenieria','3103215685',''),(39,0,'hermencia','soscue boti',0,'mañana','ing sistemas e ind','ESTUDIANTE','ingenieria','31.03215685',''),(40,0,'hermencia','soscue boti',0,'mañana','ing sistemas e ind','ESTUDIANTE','ingenieria','31,03215685',''),(41,0,'ever','muñoz soscue',7,'mañana','ingenieria ambiental','ESTUDIANTE','ingenieria','32035268',''),(2654,1107840704,'Breyner Saul','Martinez Muñoz',2,'Nocturno','Ingenieria de sistemas','Estudiante','Ingenieria','3103212753','No'),(2655,0,'BREYNER SAUL','MARTINEZ MUÑOZ',2,'NOCTURNA','INGENIERIA DE SISTEMAS ','ESTUDIANTE','INGENIERIA ','3103212753',''),(2656,0,'BREYNER SAUL','MARTINEZ MUÑOZ',2,'NOCTURNA','INGENIERIA DE SISTEMAS ','ESTUDIANTE','INGENIERIA ','3103212753',''),(2657,561651651,'GLORIA AMPARO ','MUÑOZ SOSCUE ',NULL,NULL,'INGENIERIA DE SISTEMAS ','Invitado','','',''),(2658,27276807,'GLORIA AMPARO','MUÑOZ SOSCUE ',NULL,NULL,'INGEIERIA DE SISTEMAS','Invitado','','','');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-25  9:16:45
