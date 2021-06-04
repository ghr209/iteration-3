-- MySQL dump 10.13  Distrib 8.0.22, for macos10.15 (x86_64)
--
-- Host: 127.0.0.1    Database: Corona
-- ------------------------------------------------------
-- Server version	8.0.24

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
-- Table structure for table `Personn`
--

DROP TABLE IF EXISTS `Personn`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Personn` (
  `PersonID` int NOT NULL,
  `Fornavn` varchar(45) DEFAULT NULL,
  `Efternavn` varchar(45) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `Phonenumber` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`PersonID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Personn`
--

LOCK TABLES `Personn` WRITE;
/*!40000 ALTER TABLE `Personn` DISABLE KEYS */;
INSERT INTO `Personn` VALUES (200,'Wiliam','Nielsen','Wilian262@hotmail.com','12345687'),(201,'Oliver','Jensen','Olli@hotmail.com','34567897'),(202,'Noah','Hansen','Hans76@hotmail.com','98765432'),(203,'Emil ','Pedersen','Emmoo@hotmail.com','67896433'),(204,'Victor','Andersen','Vic88@hotmail.com','65438291'),(205,'Magnus','Kristensen','Mggg@hotmail.com','11669008'),(206,'Mohammed','Abdulmajid','Moo2100@hotmail.com','88542566'),(207,'Ahmed','Hassan ','Ahh2200@hotmail.com','77552200'),(208,'Ali','Cleih','AliCl@hotmail.com','56567070'),(209,'Ann','Larsen ','Ann77@hotmail.com','44440909'),(210,'Lucas','Sørgensen','Luc00@hotmail.com','56564343'),(211,'Emma','Rasmussen','Emm@hotmail.com','00252578'),(212,'Alma','Madsen ','Almm@hotmail.com','66900863'),(213,'Julie','Olsen','JulieO@hotmail.com','12345688'),(214,'Clara','Nybo','Clhdh@hotmail.com','00997788'),(215,'Freja','Møller','Frejj@hotmail.com','53406666'),(216,'Khadija','Lauzali','Khaha@hotmail.com','26878765'),(217,'Nora','Ahmad','Nuuur@hotmail.com','34215678'),(220,'Maria','Solle','Mariaa9000@hotmail.com','98765321'),(221,'Alba','Henriksen','AlbbaHH@hotmail.com','88776611'),(222,'Sumeya','Hadiyaa','Sumyaya@hotmail.com','90909088'),(223,'Isak','Musa','Isss22@hotmail.com','88886654'),(224,'Samed','Naki','Sammm6767@hotmail.com','87653245'),(225,'Hanna','Malik','HMalik@hotmail.com','09876437'),(226,'Niels','Nadman','NielsNN@hotmail.com','34346677'),(227,'Jonas','Borg','Jojo55@hotmail.com','23235454'),(228,'Line','Fisker','Line2111@hotmail.com','56568787'),(229,'Annie','Lange','Aniiiielk@hotmail.com','11006655'),(230,'Jasmin','Neziri','JassNez@hotmail.com','55555555');
/*!40000 ALTER TABLE `Personn` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-28 11:15:10
