/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50710
Source Host           : localhost:3306
Source Database       : myproject2

Target Server Type    : MYSQL
Target Server Version : 50710
File Encoding         : 65001

Date: 2016-08-08 22:53:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for idea
-- ----------------------------
DROP TABLE IF EXISTS `idea`;
CREATE TABLE `idea` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` tinytext COMMENT '啥点子',
  `person_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `person_id` (`person_id`),
  CONSTRAINT `person_id` FOREIGN KEY (`person_id`) REFERENCES `person` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of idea
-- ----------------------------
INSERT INTO `idea` VALUES ('5', 'thingking java', '4');
INSERT INTO `idea` VALUES ('6', 'thinging c++', '4');
INSERT INTO `idea` VALUES ('7', 'thingking java', '11');
INSERT INTO `idea` VALUES ('8', 'thinging c++', '11');
INSERT INTO `idea` VALUES ('10', 'thingking python', '13');
INSERT INTO `idea` VALUES ('11', 'thinging ruby', '13');
