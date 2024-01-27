#DATABASES
/*create database db;
use db;
alter database db read only = 1;
alter database db read only = 0;
drop database db;*/
#####################################
#Tables
/*create database db;
use db;
create table employees(
ID int,
First_Name varchar(20),
Last_Name varchar(20),
Hourly_Pay decimal(7,5),
Hire_Date date
);
select * from employees;*/
#rename table employees to workers;
/*alter table employees
add Phone_Number varchar(11);
select * from employees;*/
/*alter table employees
rename column Phone_Number to Email;
alter table employees
modify column Email varchar(100);
alter table employees
modify Email varchar(100) first;
select * from employees;*/
/*alter table employees
modify Email varchar(100) after Hourly_Pay;
select * from employees;*/
/*alter table employees
drop column Hire_Date;
select * from employees;*/
#drop table employees;
#drop database db;
#####################################
#Insert Rows
/*use db;
alter table employees 
modify column Hourly_Pay decimal(7,2);
insert into employees 
values(11111111 , "Patrick" , "Batman" , 70000.00 , "BATMAN111@gmail.com");
select * from employees;*/
/*insert into employees(ID , First_Name , Last_Name)
values(00000000 , "Someone" , "New");
select * from employees;*/
#####################################
#Select
#select * from employees;
#select ID , Email from employees;
#select * from employees where id = 20220017;
#select * from employees where Hourly_Pay >= 8000;
#select * from employees where Hourly_Pay is null;
#select * from employees where Hourly_Pay is not null;
#select Email from employees where Hourly_Pay is not null;
#####################################
#Update & Delete
/*update employees set
ID = 77777777,
First_Name = "Peter",
Last_Name = "Parker",
Hourly_Pay = 10000.00,
Email = "SpiderMan000@hotmail.com"
where ID = 00000000;
select * from employees;*/
/*update employees set ID = 10101010;
select * from employees;*/
#delete from employees where ID = 12345678;
#delete from employees;
#####################################
#Autocommit , Commit and Rollback
/*set autocommit = off;
commit;
delete from employees;
select * from employees;*/
/*rollback;
select * from employees;*/
#set autocommit = on;
#####################################
#current_date() & current_time()
/*create table test(
my_date date,
my_time time,
my_datetime datetime);
insert into test values(current_date() , current_time() , now());
insert into test values(current_date()+1 , null , null);
select * from test;
drop table test;*/
#####################################
#Unique (ensures that all values in a column are all different.)
/*create table products(
product_id int,
product_name varchar(25) unique,
product_price decimal(10,2)
);*/
#For a table that already exists:
/*alter table products
add constraint
unique(product_name);*/
#####################################
#Not Null
/*create table products(
product_id int,
product_name varchar(25),
product_price decimal(10,2) not null
);*/
#For a table that already exists:
/*alter table products
modify product_price decimal(10,2) not null;*/
#####################################
#Check
/*create table products(
product_id int,
product_name varchar(25),
product_price decimal(10,2),
constraint chk check(product_price<=999)
);*/
#For a table that already exists:
/*alter table products add constraint chk check(product_price<=999);*/
#alter table products drop check chk;
#####################################
#Default(if there's no value entered, it's automatically set to the default.)
/*create table products(
product_id int,
product_name varchar(25),
product_price decimal(10,2) default 0);*/
#For a table that already exists:
/*alter table products alter product_price set default 0;*/
#####################################
#Primary Key(All items in column must be unique and can't be null. Only 1pk in column.)
/*create table transactions(
id int primary key,
amount decimal(12,2));*/
#For a table that already exists:
/*alter table transactions add constraint primary key(id);*/
#####################################
#Auto Increment
/*create table transactions(
id int auto_increment,
amount decimal(12,2));*/
#For a table that already exists:
/*alter table transactions auto_increment = 1000;*/
#####################################
#Foreign Key
/*CREATE TABLE customers (
  id INT PRIMARY KEY,
  name VARCHAR(50),
  email VARCHAR(50));
CREATE TABLE orders (
  id INT PRIMARY KEY,
  order_number VARCHAR(10),
  customer_id INT,
  FOREIGN KEY (customer_id) REFERENCES customers(id));*/
#####################################
#Join
/*create table bonus(id int, bonus decimal(6,2));
insert into bonus values(20220017 , 7000),
                        (11111111 , 5000),
                        (12345678 , 4500.75),
                        (77777777 , 4321);
select first_name , last_name , bonus
from employees inner join bonus
on employees.id = bonus.id;*/
#####################################
#Some Functions
#select count(id) as "Labor" from employees;
#select max(hourly_pay) as "Max Pay" from employees;
#select min(hourly_pay) as "Min Pay" from employees;
#select avg(hourly_pay) as "Average Pay" from employees;
#select sum(hourly_pay) as "Wages" from employees;
#select concat(first_name , " " , last_name) as full_name from employees;
#####################################
#Logical Operators
#select * from employees where id=20220017 or id=11111111;
#select * from employees where first_name="Ahmed" and last_name="Hassan";
#select * from employees where not first_name="Ahmed" and not last_name="Batman"
#select * from employees where hourly_pay between 5000 and 10000;
#select * from employees where first_name in("Ahmed" , "Peter" , "Patrick");
#####################################
#WildCards
#select * from employees where first_name like "a%";
#select * from employees where id like "2022%";
#select * from employees where last_name like "%n";
#select * from employees where first_name like "_ete_";
#select * from employees where last_name like "%a%";
#####################################
#Order by
#select * from employees order by id;
#select * from employees order by hourly_pay desc , first_name;
#####################################
#Limit
#select * from employees limit 2;
#select * from employees order by hourly_pay desc limit 3;
#select * from employees limit 2,1; #(1 after 2)
#####################################
#Union
#"union" is an operator combines two tables one after another,
#on condition selecting the same number of columns from both of them.
#"union all" allows duplicating repeated items.
#####################################
#Views
/*create view Labor_Wages as select First_Name , Hourly_Pay from employees;
select * from Labor_Wages;
drop view Labor_Wages;*/
#####################################
#Subqueries
/*select first_name , last_name , hourly_pay ,
(select avg(hourly_pay) from employees) as Average_Pay
from employees;*/
/*select first_name , last_name , hourly_pay from employees
where hourly_pay>(select avg(hourly_pay) from employees);*/
#####################################
#Group By
/*select count(amount) , customer_id
from transactions group by customer_id
having count(amount)>1 and customer_id is not null; #having instead of where*/
#####################################
#Rollup
/*select sum(hourly_pay) as Labor_Wages , first_name from employees
group by first_name with rollup;*/
#####################################
#Stored Procedures
/*delimiter $$
create procedure find_employee(in search_id int)
begin
select * from employees where id = search_id;
end $$
delimiter ;*/
#call find_employee(20220017);
#####################################
#Triggers
/*create table Expenses(
Expense_ID int primary key,
Expense_Name varchar(50),
Total decimal(10,2));*/
/*insert into expenses values
(1 , "Salaries" , 0),
(2 , "Supplies" , 0),
(3 , "Taxes" , 0);*/
/*update expenses
set Total = (select sum(hourly_pay) from employees)
where expense_name = "Salaries";
select * from expenses;*/
/*create trigger after_salary_delete
after delete on employees
for each row
update expenses
set total = total - old.hourly_pay
where expense_name = "Salaries";*/
/*delete from employees where id=77777777;
select * from expenses;*/
/*create trigger after_salary_insert
after insert on employees
for each row
update expenses
set total = total + new.hourly_pay
where expense_name = "Salaries";*/
/*insert into employees values(10000000,
"Hulk",
"Green",
99999.99,
"Hulk999@hotmail.com");
select * from expenses;*/
#####################################
# DDL (Data Definition Language) ===> create , drop , truncate & alter.
# DML (Data Manipulation Language) ===> insert , delete , update & select.
# DCL (Data Control Language) ===> commit (deals with controls, rights, security and permission in the database system.)
#------------------------------------------------------------------------------
# delete : Removes one or more row from a table.
# truncate : Removes all rows in a table except the row with columns names.
# drop : Removes a whole table or a database.
#####################################
#ALHAMDULELLAH <3
#DONE;