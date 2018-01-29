/*
SQLyog Ultimate v8.32 
MySQL - 5.6.34 : Database - zgfu_distribution
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`zgfu_distribution` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */;

USE `zgfu_distribution`;

/*Table structure for table `wx_userinfo` */

DROP TABLE IF EXISTS `orders`;

CREATE TABLE `orders` (
  `orderId` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `orderNumber` varchar(100) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '订单号',
  `orderPrice` varchar(25) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '金额',
  `pid` BIGINT(20) NULL DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`orderId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

/*Data for the table `wx_userinfo` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
