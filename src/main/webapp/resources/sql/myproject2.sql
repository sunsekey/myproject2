/*
Navicat MySQL Data Transfer

Source Server         : local5.7.10
Source Server Version : 50710
Source Host           : localhost:3308
Source Database       : myproject2

Target Server Type    : MYSQL
Target Server Version : 50710
File Encoding         : 65001

Date: 2016-08-21 10:31:30
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
INSERT INTO `idea` VALUES ('5', 'test trigger', '4');
INSERT INTO `idea` VALUES ('6', 'test trigger', '4');
INSERT INTO `idea` VALUES ('7', 'test trigger', '11');
INSERT INTO `idea` VALUES ('8', 'test trigger', '11');
INSERT INTO `idea` VALUES ('10', 'test trigger', '13');
INSERT INTO `idea` VALUES ('11', 'test trigger', '13');

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL COMMENT '叫啥',
  `age` int(3) DEFAULT NULL COMMENT '多大',
  `sex` tinyint(1) DEFAULT NULL COMMENT '0：男，1：女',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('4', 'abc', '12', '1', null, '2016-08-17 22:16:37');
INSERT INTO `person` VALUES ('11', 'DD2', '2', '1', null, null);
INSERT INTO `person` VALUES ('13', 'GG', '32', '2', null, null);
INSERT INTO `person` VALUES ('19', 'abc', '12', '1', '2016-08-17 22:33:12', null);

-- ----------------------------
-- Table structure for thought
-- ----------------------------
DROP TABLE IF EXISTS `thought`;
CREATE TABLE `thought` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` tinytext COMMENT '想什么',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of thought
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `account` varchar(30) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `sex` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('2', '老王33 d', 's001ddd', '123456', '29', null);
INSERT INTO `user` VALUES ('6', '1 dd', '1', '1', '1', null);
INSERT INTO `user` VALUES ('7', '2 ', '1', '2', '1', '001');
INSERT INTO `user` VALUES ('9', '2 ', '313957847@qq.com', '', '4', '002');
INSERT INTO `user` VALUES ('10', '2 ', '313957847@qq.com', '', '4', '002');
INSERT INTO `user` VALUES ('11', '2 ', '313957847@qq.com', '', '4', '002');
INSERT INTO `user` VALUES ('12', '1 ', '1w', 'd', '1', '001');
INSERT INTO `user` VALUES ('13', '1 ', '1', '1', '1', null);
INSERT INTO `user` VALUES ('14', 'fq ', '2', 'ef', '2', '001');
INSERT INTO `user` VALUES ('15', 'fqadf ', '2efw', '222ee', '2', '001');
INSERT INTO `user` VALUES ('16', 'asd ', 'adf', 'ef', '323', null);
INSERT INTO `user` VALUES ('17', '1 ', '111', '1', '1', '001');
DROP TRIGGER IF EXISTS `UPDATE_CREATE_TIME`;
DELIMITER ;;
CREATE TRIGGER `UPDATE_CREATE_TIME` BEFORE INSERT ON `person` FOR EACH ROW BEGIN
SET new.create_time = CURTIME();
END
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `update_time`;
DELIMITER ;;
CREATE TRIGGER `update_time` BEFORE UPDATE ON `person` FOR EACH ROW BEGIN
 SET new.modify_time = CURTIME();
update idea set content = "test trigger";
END
;;
DELIMITER ;
