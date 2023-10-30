/*
 Navicat Premium Data Transfer

 Source Server         : atguigu01
 Source Server Type    : MySQL
 Source Server Version : 80033 (8.0.33)
 Source Host           : localhost:3306
 Source Schema         : blog

 Target Server Type    : MySQL
 Target Server Version : 80033 (8.0.33)
 File Encoding         : 65001

 Date: 30/10/2023 19:48:05
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article`  (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `title` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `content` text CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL,
  `cid` bigint NULL DEFAULT NULL,
  `uid` bigint NULL DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 32 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of article
-- ----------------------------
INSERT INTO `article` VALUES (3, 'Java基础', 'javase', 10, 2, '2023-10-28 10:27:21', '2023-10-28 10:27:21');
INSERT INTO `article` VALUES (4, 'sql工具', 'mysql', 3, 1, '2023-10-28 10:25:56', '2023-10-28 10:25:56');
INSERT INTO `article` VALUES (5, 'myshql', 'mysql', 3, 2, '2023-10-28 10:25:04', '2023-10-28 10:25:04');
INSERT INTO `article` VALUES (7, 'php', 'php', 6, 2, '2023-10-28 10:23:55', '2023-10-28 10:23:55');
INSERT INTO `article` VALUES (8, 'javaSE', 'javase', 10, 2, '2023-10-28 10:23:29', '2023-10-28 10:23:29');
INSERT INTO `article` VALUES (9, 'Spring轻量级框架', 'Java是一门面向对象的编程语言，不仅吸收了C++语言的各种优点，还摒弃了C++里难以理解的多继承、指针等概念，因此Java语言具有功能强大和简单易用两个特征。Java语言作为静态面向对象编程语言的代表，极好地实现了面向对象理论，允许程序员以优雅的思维方式进行复杂的编程 [1]。\r\nJava具有简单性、面向对象、分布式、健壮性、安全性、平台独立与可移植性、多线程、动态性等特点 [2]。Java可以编写桌面应用程序、Web应用程序、分布式系统和嵌入式系统应用程序等 [3]。\r\nJava是一门面向对象的编程语言，不仅吸收了C++语言的各种优点，还摒弃了C++里难以理解的多继承、指针等概念，因此Java语言具有功能强大和简单易用两个特征。Java语言作为静态面向对象编程语言的代表，极好地实现了面向对象理论，允许程序员以优雅的思维方式进行复杂的编程 [1]。\r\nJava具有简单性、面向对象、分布式、健壮性、安全性、平台独立与可移植性、多线程、动态性等特点 [2]。Java可以编写桌面应用程序、Web应用程序、分布式系统和嵌入式系统应用程序等 [3]。', 2, 1, '2023-06-28 12:27:41', '2023-06-28 12:27:41');
INSERT INTO `article` VALUES (11, 'Vue前端框架', 'Vue 是一个框架，也是一个生态。其功能覆盖了大部分前端开发常见的需求。但 Web 世界是十分多样化的，不同的开发者在 Web 上构建的东西可能在形式和规模上会有很大的不同。考虑到这一点，Vue 的设计非常注重灵活性和“可以被逐步集成”这个特点。根据你的需求场景，你可以用不同的方式使用 Vue：\r\n\r\n无需构建步骤，渐进式增强静态的 HTML\r\n在任何页面中作为 Web Components 嵌入\r\n单页应用 (SPA)\r\n全栈 / 服务端渲染 (SSR)\r\nJamstack / 静态站点生成 (SSG)\r\n开发桌面端、移动端、WebGL，甚至是命令行终端中的界面\r\n如果你是初学者，可能会觉得这些概念有些复杂。别担心！理解教程和指南的内容只需要具备基础的 HTML 和 JavaScript 知识。即使你不是这些方面的专家，也能够跟得上。\r\n\r\n如果你是有经验的开发者，希望了解如何以最合适的方式在项目中引入 Vue，或者是对上述的这些概念感到好奇，我们在使用 Vue 的多种方式中讨论了有关它们的更多细节。\r\n\r\n无论再怎么灵活，Vue 的核心知识在所有这些用例中都是通用的。即使你现在只是一个初学者，随着你的不断成长，到未来有能力实现更复杂的项目时，这一路上获得的知识依然会适用。如果你已经是一个老手，你可以根据实际场景来选择使用 Vue 的最佳方式，在各种场景下都可以保持同样的开发效率。这就是为什么我们将 Vue 称为“渐进式框架”：它是一个可以与你共同成长、适应你不同需求的框架。', 9, 1, '2023-06-28 12:30:17', '2023-06-28 12:30:17');
INSERT INTO `article` VALUES (19, 'Java', 'java', 2, 1, '2023-07-11 20:20:45', '2023-07-11 20:20:45');
INSERT INTO `article` VALUES (31, 'aaaa', '<p>swafqaf</p>', 3, NULL, '2023-10-30 08:31:49', '2023-10-30 08:31:49');

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category`  (
  `cid` bigint NOT NULL AUTO_INCREMENT,
  `cname` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`cid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 57 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES (2, 'java', '2023-06-28 09:59:54', '2023-06-28 09:49:54');
INSERT INTO `category` VALUES (3, 'mysql', '2023-06-28 09:50:03', '2023-06-28 09:50:03');
INSERT INTO `category` VALUES (6, 'php', '2023-10-25 16:24:51', '2023-10-25 16:24:54');
INSERT INTO `category` VALUES (9, 'vue', '2023-07-11 20:28:31', '2023-07-11 20:28:31');
INSERT INTO `category` VALUES (10, 'javaSE', '2023-10-27 10:15:16', '2023-10-27 10:20:40');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `uid` bigint NOT NULL AUTO_INCREMENT,
  `username` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `password` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `phone` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `introduction` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'root', 'root123', '17513080367', '1', '2023-06-28 10:31:48', '2023-10-26 16:53:49');
INSERT INTO `user` VALUES (2, 'peiqi', '123456', '18117407936', '你很酷', '2023-07-11 20:37:19', '2023-10-27 10:34:40');
INSERT INTO `user` VALUES (3, 'xiaoming', '123456', '13296575847', '我喜欢打篮球', '2023-10-28 15:42:14', '2023-10-28 15:42:14');
INSERT INTO `user` VALUES (5, 'asdasd', 'dasfgqaefwfa', 'dasd', 'dasd', '2023-10-28 17:12:16', '2023-10-28 17:12:16');
INSERT INTO `user` VALUES (6, 'yuquanming', '123123321', '110', '很傻的孩子', '2023-10-30 08:33:44', '2023-10-30 08:33:44');

SET FOREIGN_KEY_CHECKS = 1;
