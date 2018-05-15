
CREATE TABLE `tb_emp` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `sex` varchar(2) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `dapt` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
INSERT INTO `tb_emp` VALUES ('1', '张三', '男', '2013-04-15', '销售部');
INSERT INTO `tb_emp` VALUES ('2', '李四', '女', '2014-02-12', '运营部');
INSERT INTO `tb_emp` VALUES ('3', '王五', '男', '2016-10-15', '销售部');
INSERT INTO `tb_emp` VALUES ('4', '赵六', '女', '2017-04-03', '运营部');