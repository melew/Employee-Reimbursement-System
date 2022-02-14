create table ERS_USERS(
USERS_ID int primary key ,
username varchar(50) not null unique ,
password varchar (100) not null   ,
fname varchar (100),
lname varchar (100),
email varchar (150) unique  ,
rolesID  int  references ERS_USERS_ROLLES(rolesID) 




)

create table ERS_USERS_ROLLES(

rolesID  number primary key   ,
roles varchar (50)




)

create table ERS_Reimbursement(
REIMB_ID INT primary key ,
REIMB_AMOUNT INT ,
REIMB_SUBMITTED timestamp,
REIMB_RESOLVED timestamp ,
REIMB_DESCRIPTION varchar (300),
REIMB_RECEIPT blob ,
REIMB_AUTHOR INT,
REIMB_RESOLVER  INT,
REIMB_STATUS_ID INT ,
REIMB_TYPE_ID INT 




)



