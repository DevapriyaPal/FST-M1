create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

insert into customers values  
(3002, 'Nick Rimando', 'New York', 100, 5001), (3007, 'Brad Davis', 'New York', 200, 5001), 
(3005, 'Graham Zusi', 'California', 200, 5002), (3008, 'Julian Green', 'London', 300, 5002), 
(3004, 'Fabian Johnson', 'Paris', 300, 5006), (3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
(3003, 'Jozy Altidor', 'Moscow', 200, 5007), (3001, 'Brad Guzan', 'London', 300, 5005);

insert into customers values  
(3002, 'Nick Rimando', 'New York', 100, 5001), (3007, 'Brad Davis', 'New York', 200, 5001), 
(3005, 'Graham Zusi', 'California', 200, 5002), (3008, 'Julian Green', 'London', 300, 5002), 
(3004, 'Fabian Johnson', 'Paris', 300, 5006), (3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
(3003, 'Jozy Altidor', 'Moscow', 200, 5007), (3001, 'Brad Guzan', 'London', 300, 5005);

insert into customers values  
(3002, 'Nick Rimando', 'New York', 100, 5001);

insert into customers values  
--(3002, 'Nick Rimando', 'New York', 100, 5001), 
(3007, 'Brad Davis', 'New York', 200, 5001);

insert into customers values  
--(3002, 'Nick Rimando', 'New York', 100, 5001), 
--(3007, 'Brad Davis', 'New York', 200, 5001);

(3005, 'Graham Zusi', 'California', 200, 5002);

insert into customers values  
--(3002, 'Nick Rimando', 'New York', 100, 5001), 
--(3007, 'Brad Davis', 'New York', 200, 5001);

(3005, 'Graham Zusi', 'California', 200, 5002);

insert into customers values  
(3005, 'Graham Zusi', 'California', 200, 5002);

insert into customers values  
(3008, 'Julian Green', 'London', 300, 5002);

insert into customers values  
(3004, 'Fabian Johnson', 'Paris', 300, 5006);

insert into customers values  
 (3009, 'Geoff Cameron', 'Berlin', 100, 5003);

insert into customers values  
 (3003, 'Jozy Altidor', 'Moscow', 200, 5007);

insert into customers values  
  (3001, 'Brad Guzan', 'London', 300, 5005);

select * from customers;

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

SELECT a.customer_name AS "Customer Name", a.city, b.name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

select salesman.salesman_id,salesman.salesman_name,customers.customer_id,customers.customer_name from salesman,customers where salesman.salesman_id=customers.salesman_id;

select salesman.salesman_id,salesman.salesman_name,customers.customer_id,customers.customer_name,customers.city from salesman,customers where salesman.salesman_id=customers.salesman_id 
;

SELECT customers.customer_name, customers.city, customers.grade, salesman.name, salesman.city FROM customers   
LEFT OUTER JOIN salesman  ON salesman.salesman_id=customers.salesman_id WHERE customers.grade<300  
ORDER BY customer_id aesc;

SELECT customers.customer_name, customers.city, customers.grade, salesman.name, salesman.city FROM customers   
LEFT OUTER JOIN salesman  ON salesman.salesman_id=customers.salesman_id WHERE customers.grade<300  
ORDER BY customer_id ;

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

insert into customers values  
  (3001, 'Brad Guzan', 'London', 300, 5005);

select * from customers;

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

select salesman.salesman_id,salesman.salesman_name,customers.customer_id,customers.customer_name,customers.city from salesman,customers where salesman.salesman_id=customers.salesman_id 
 
-- Write an SQL statement to make a list in ascending order for the customer who holds a grade less than 300 and works either through a salesman 
SELECT customers.customer_name, customers.city, customers.grade, salesman.name,salesman.city FROM customers   
LEFT OUTER JOIN salesman  ON salesman.salesman_id=customers.salesman_id WHERE customers.grade<300  
ORDER BY customer_id ;

SELECT customers.customer_name, customers.city, customers.grade,salesman.city,salesman.salesman_name FROM customers   
LEFT OUTER JOIN salesman  ON salesman.salesman_id=customers.salesman_id WHERE customers.grade<300  
ORDER BY customer_id ;

SELECT customers.customer_name, customers.city, customers.grade,salesman.salesman_city,salesman.salesman_name FROM customers   
LEFT OUTER JOIN salesman  ON salesman.salesman_id=customers.salesman_id WHERE customers.grade<300  
ORDER BY customer_id ;

SELECT customers.customer_name, customers.city, customers.grade,salesman.salesman_city,salesman.salesman_name FROM customers   
LEFT OUTER JOIN salesman  ON salesman.salesman_id=customers.salesman_id WHERE customers.grade<300  
ORDER BY customer_id ASC;

SELECT customers.customer_name, customers.city, customers.grade,customers.commission from customers INNER JOIN salesman  ON customers.salesman_id=salesman.salesman_id  
WHERE customers.commission>12;

SELECT customers.customer_name, customers.city, customers.grade,salesman.commission from customers INNER JOIN salesman  ON customers.salesman_id=salesman.salesman_id  
WHERE customers.commission>12;

SELECT customers.customer_name, customers.city, customers.grade,salesman.commission from customers INNER JOIN salesman  ON customers.salesman_id=salesman.salesman_id  
WHERE salesman.commission>12;

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

insert into customers values  
  (3001, 'Brad Guzan', 'London', 300, 5005);

select * from customers;

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

select salesman.salesman_id,salesman.salesman_name,customers.customer_id,customers.customer_name,customers.city from salesman,customers where salesman.salesman_id=customers.salesman_id 
 
-- Write an SQL statement to make a list in ascending order for the customer who holds a grade less than 300 and works either through a salesman 
 
SELECT customers.customer_name, customers.city, customers.grade,salesman.salesman_city,salesman.salesman_name FROM customers   
LEFT OUTER JOIN salesman  ON salesman.salesman_id=customers.salesman_id WHERE customers.grade<300  
ORDER BY customer_id ASC 
 
--Write an SQL statement to find the list of customers who appointed a salesman for their jobs who gets a commission from the company is more than 12%. 
SELECT customers.customer_name, customers.city, customers.grade,salesman.commission from customers INNER JOIN salesman  ON customers.salesman_id=salesman.salesman_id  
WHERE salesman.commission>12;

CREATE TABLE order ( 
    order_no int, 
    order_date date, 
    purchase_amount int, 
    customer_id int 
);

CREATE TABLE orders ( 
    order_no int, 
    order_date date, 
    purchase_amount int, 
    customer_id int 
);

insert into values(101,12-12-2022,3000,3001);

insert into orders values(101,12-12-2022,3000,3001);

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

insert into customers values  
  (3001, 'Brad Guzan', 'London', 300, 5005);

select * from customers;

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

CREATE TABLE orders ( 
    order_no int, 
    order_date date, 
    purchase_amount int, 
    customer_id int 
);

insert into orders values(101,"12/12/2022",3000,3001);

SELECT * FROM salesman;

select salesman.salesman_id,salesman.salesman_name,customers.customer_id,customers.customer_name,customers.city from salesman,customers where salesman.salesman_id=customers.salesman_id 
 
-- Write an SQL statement to make a list in ascending order for the customer who holds a grade less than 300 and works either through a salesman 
 
SELECT customers.customer_name, customers.city, customers.grade,salesman.salesman_city,salesman.salesman_name FROM customers   
LEFT OUTER JOIN salesman  ON salesman.salesman_id=customers.salesman_id WHERE customers.grade<300  
ORDER BY customer_id ASC 
 
--Write an SQL statement to find the list of customers who appointed a salesman for their jobs who gets a commission from the company is more than 12%. 
SELECT customers.customer_name, customers.city, customers.grade,salesman.commission from customers INNER JOIN salesman  ON customers.salesman_id=salesman.salesman_id  
WHERE salesman.commission>12;

insert into orders values(101,"12/12/2022",4000,3001);

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

insert into customers values  
  (3001, 'Brad Guzan', 'London', 300, 5005);

select * from customers;

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

CREATE TABLE orders ( 
    order_no int, 
    order_date date, 
    purchase_amount int, 
    customer_id int 
);

insert into orders values(101,12/12/2022,4000,3001);

SELECT * FROM salesman;

select salesman.salesman_id,salesman.salesman_name,customers.customer_id,customers.customer_name,customers.city from salesman,customers where salesman.salesman_id=customers.salesman_id 
 
-- Write an SQL statement to make a list in ascending order for the customer who holds a grade less than 300 and works either through a salesman 
 
SELECT customers.customer_name, customers.city, customers.grade,salesman.salesman_city,salesman.salesman_name FROM customers   
LEFT OUTER JOIN salesman  ON salesman.salesman_id=customers.salesman_id WHERE customers.grade<300  
ORDER BY customer_id ASC 
 
--Write an SQL statement to find the list of customers who appointed a salesman for their jobs who gets a commission from the company is more than 12%. 
SELECT customers.customer_name, customers.city, customers.grade,salesman.commission from customers INNER JOIN salesman  ON customers.salesman_id=salesman.salesman_id  
WHERE salesman.commission>12;

insert into orders values(70001,150.5,2012-10-05,3005,5002);

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

insert into customers values  
  (3001, 'Brad Guzan', 'London', 300, 5005);

select * from customers;

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

CREATE TABLE orders ( 
    order_no int, 
    order_date date, 
    purchase_amount int, 
    customer_id int 
);

insert into orders values(70001,150.5,2012-10-05,5002);

SELECT * FROM salesman;

select salesman.salesman_id,salesman.salesman_name,customers.customer_id,customers.customer_name,customers.city from salesman,customers where salesman.salesman_id=customers.salesman_id 
 
-- Write an SQL statement to make a list in ascending order for the customer who holds a grade less than 300 and works either through a salesman 
 
SELECT customers.customer_name, customers.city, customers.grade,salesman.salesman_city,salesman.salesman_name FROM customers   
LEFT OUTER JOIN salesman  ON salesman.salesman_id=customers.salesman_id WHERE customers.grade<300  
ORDER BY customer_id ASC 
 
--Write an SQL statement to find the list of customers who appointed a salesman for their jobs who gets a commission from the company is more than 12%. 
SELECT customers.customer_name, customers.city, customers.grade,salesman.commission from customers INNER JOIN salesman  ON customers.salesman_id=salesman.salesman_id  
WHERE salesman.commission>12;

insert into orders values(70006,1500,2012-10-05,5003);

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

insert into customers values  
  (3001, 'Brad Guzan', 'London', 300, 5005);

select * from customers;

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

CREATE TABLE orders ( 
    order_no int, 
    order_date date, 
    purchase_amount int, 
    customer_id int 
);

insert into orders values(70001,150.5,2012-10-05,5002);

insert into orders values(70006,150,2012-10-05,5003);

SELECT * FROM salesman;

select salesman.salesman_id,salesman.salesman_name,customers.customer_id,customers.customer_name,customers.city from salesman,customers where salesman.salesman_id=customers.salesman_id 
 
-- Write an SQL statement to make a list in ascending order for the customer who holds a grade less than 300 and works either through a salesman 
 
SELECT customers.customer_name, customers.city, customers.grade,salesman.salesman_city,salesman.salesman_name FROM customers   
LEFT OUTER JOIN salesman  ON salesman.salesman_id=customers.salesman_id WHERE customers.grade<300  
ORDER BY customer_id ASC 
 
--Write an SQL statement to find the list of customers who appointed a salesman for their jobs who gets a commission from the company is more than 12%. 
SELECT customers.customer_name, customers.city, customers.grade,salesman.commission from customers INNER JOIN salesman  ON customers.salesman_id=salesman.salesman_id  
WHERE salesman.commission>12;
