# Servlet_Jsp_projects
This is my first attempt to create jsp/servlet project with mysql . it's a simple file upload and download project.
for this project you need to add 2 connectors in your libraries folder of your project in "Netbeans"
1. mysql-connector-java-5.1.41
2. jstl-1.2
(both connectors are provided)
and you also need to create 2 tables for it.

1. first table in mysql
CREATE TABLE data (
 `id` int(11) NOT NULL AUTO_INCREMENT,
 `firstname` varchar(255) NOT NULL,
 `lastname` varchar(255) NOT NULL,
 `filename` varchar(255) NOT NULL,
 `path` varchar(255) NOT NULL,
 `added_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
 PRIMARY KEY (`id`)
)

2. second table in mysql

CREATE TABLE Login (
 Email varchar(50) NOT NULL,
 password varchar(50) NOT NULL
)

Note: I have tested this project only on NetBeans 

Thank You
