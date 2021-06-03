SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int NOT NULL,
  `name` varchar(30) DEFAULT (NULL),
  `pwd` varchar(30) DEFAULT (NULL),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES (1, 'txf', '123');
INSERT INTO `user` VALUES (2, 'suyu', '456');
INSERT INTO `user` VALUES (3, 'abc', '777');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
