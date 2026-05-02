use it_company;
create table clients(
 name varchar(100),
 client_id varchar(30) primary key,
 address varchar(50),
 email varchar(50),
 cell varchar(20),
 pass varchar(50)
);
create table transition(
  client_id varchar(30),
  service_take double,
  pay double,
  due double
);
se
