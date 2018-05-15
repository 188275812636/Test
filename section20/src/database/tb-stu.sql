
CREATE TABLE `tb_stu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `sex` varchar(2) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
INSERT INTO tb_stu(id,name,sex,birthday) VALUES ( 1,'小明', '男', '2014-02-12');
INSERT INTO tb_stu(id,name,sex,birthday) VALUES ( 2,'小红', '女', '2015-09-21');
INSERT INTO tb_stu(id,name,sex,birthday) VALUES ( 3,'张三', '男', '2016-04-05');
INSERT INTO tb_stu(id,name,sex,birthday) VALUES ( 4,'李四', '女', '2017-02-16');