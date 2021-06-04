CREATE DATABASE IF NOT EXISTS mybatis default charset utf8 COLLATE utf8_general_ci;
use mybatis;
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int NOT NULL,
  `name` varchar(30) DEFAULT (NULL),
  `pwd` varchar(30) DEFAULT (NULL),
  PRIMARY KEY (`id`)
);
INSERT INTO `user` VALUES (1, 'txf', '123');
INSERT INTO `user` VALUES (2, 'suyu', '456');
INSERT INTO `user` VALUES (3, 'abc', '777');