-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: hotel
-- ------------------------------------------------------
-- Server version	8.0.39

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
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `room` (
  `id` int NOT NULL AUTO_INCREMENT,
  `available` bit(1) NOT NULL,
  `price` decimal(38,2) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `size` int NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UKgjdug5uoaekerj31s5cdada0h` (`type`,`price`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room`
--

LOCK TABLES `room` WRITE;
/*!40000 ALTER TABLE `room` DISABLE KEYS */;
INSERT INTO `room` VALUES (1,_binary '',100.00,'Single',20),(2,_binary '',150.00,'Double',30),(3,_binary '\0',300.00,'Suite',50),(4,_binary '',120.00,'Single Deluxe',25),(5,_binary '\0',180.00,'Double Deluxe',35),(6,_binary '',350.00,'Family Suite',60),(7,_binary '\0',500.00,'Presidential Suite',80),(8,_binary '',80.00,'Economy',15),(9,_binary '',200.00,'Business',40),(10,_binary '\0',1000.00,'Penthouse',100),(12,_binary '',1000.00,'Single Room',40),(13,_binary '',1200.00,'Double Room',50),(14,_binary '',1400.00,'Twin Room',60),(15,_binary '',1600.00,'Triple Room',70),(16,_binary '',1800.00,'Quad Room',80),(17,_binary '',2000.00,'Queen Room',90),(18,_binary '',2200.00,'King Room',100),(19,_binary '',2400.00,'Hollywood Twin Room',110),(20,_binary '',2600.00,'Suite',120),(21,_binary '',2800.00,'Junior Suite',130),(22,_binary '',3000.00,'Executive Suite',140),(23,_binary '',3200.00,'Presidential Suite',150),(24,_binary '',3400.00,'Studio Room',160),(25,_binary '',3600.00,'Accessible Room',170),(26,_binary '',3800.00,'Deluxe Room',180),(27,_binary '',4000.00,'Standard Room',190);
/*!40000 ALTER TABLE `room` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-09-07 14:41:39
