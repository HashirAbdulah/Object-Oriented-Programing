create database travelmanagmentsystem;
show databases;
use travelmanagmentsystem;
create table account(usern varchar(15), name varchar(30), pass varchar(8), security varchar(100), answer varchar(40));
select * from account;
create table customer(username varchar(10), id varchar(30), number varchar(30), name varchar(30), gender varchar(20), country varchar(20), adress varchar(100), phone varchar(15), email varchar(30));
select * from customer;
create table bookPackage(username varchar(10), package varchar(30), NoOfPersons varchar(30), idtype varchar(30), idNumber varchar(20), Phone varchar(20), packagePrice varchar(10));
select * from bookPackage;
