-- create and select the database
DROP DATABASE IF EXISTS arivana;
CREATE DATABASE arivana;
USE arivana;


Create table User (
ID 				integer 		primary key auto_increment,
username 		varchar(20) 	not null unique,
password 		blob			not null,
email			varchar(100) 	not null,
isAdmin			boolean			default false
);

insert into User (username,password,email,isAdmin) values('aprice', AES_ENCRYPT('admin@pw123', 'hiddensecret'),'antprice07@gmail.com', true);


-- create a user and grant privileges to that user
DROP USER IF EXISTS arivana_admin@localhost;
CREATE USER arivana_admin@localhost IDENTIFIED BY 'opensesame';
GRANT SELECT, INSERT, DELETE, UPDATE ON arivana.* TO arivana_admin@localhost;
