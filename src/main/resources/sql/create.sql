CREATE TABLE IF NOT EXISTS user (
  `id` INT(10) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(50),
  `age` INT(3) ,
  `flower_id` VARCHAR(10) ,
  PRIMARY KEY (id)
)

insert into user (id, name, age, flower_id)
values(1, 'TT1-M1', 20, '5691'),
(2, 'TT1-M2', 25, '5691'),
(3, 'TT2-N1', 21, '2779'),
(4, 'TT2-N2', 30, '3306'),
(5, 'TT2-N3', 33, '3306');