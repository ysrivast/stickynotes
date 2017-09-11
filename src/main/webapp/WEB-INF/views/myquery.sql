create database usersdb;
 
use usersdb;
 
CREATE TABLE `users` (
   `name` varchar(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`username`)
);

insert into users values("Yogesh","yogi","hello","yogi@yogi.com");