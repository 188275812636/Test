
CREATE TABLE `tb_stu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `sex` varchar(2) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
INSERT INTO tb_stu(id,name,sex,birthday) VALUES ( 1,'С��', '��', '2014-02-12');
INSERT INTO tb_stu(id,name,sex,birthday) VALUES ( 2,'С��', 'Ů', '2015-09-21');
INSERT INTO tb_stu(id,name,sex,birthday) VALUES ( 3,'����', '��', '2016-04-05');
INSERT INTO tb_stu(id,name,sex,birthday) VALUES ( 4,'����', 'Ů', '2017-02-16');