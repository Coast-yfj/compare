DROP TABLE IF EXISTS fpb;
CREATE TABLE fpb(
ID IDENTITY PRIMARY KEY,
xh INT ,
 county  varchar(100),
 town    varchar(255),
 village  varchar(255),
 household_num varchar(20),
 person_number varchar(20),
 name varchar(255),
 sex  varchar(20),
 identification_number varchar(20),
 num varchar(20),
 relation varchar(50),
 nation varchar(20),
 cultural_level varchar(20),
 school_is varchar(20),
 health_status  varchar(20),
 labor_ability varchar(20),
 working_condition varchar(20),
 working_time varchar(20),
 is_xnh varchar(20),
 is_xylbx varchar(20),
 is_czylbx varchar(20),
 tpsx varchar(20),
 pkhsx varchar(20),
 zyzpyy varchar(20),
 rjsr varchar(20),
 phone varchar(20),
 bankname varchar(50),
 pname  varchar(50),
 psex    varchar(10),
 pnation  varchar(30),
 househol_type varchar(50),
 person_status varchar(50),
 bankcard varchar(30)

);

CREATE   INDEX   fpb_id ON  FPB(identification_number);

DROP TABLE IF EXISTS pcs;
CREATE TABLE pcs(
 ID IDENTITY PRIMARY KEY,
 PERSON_STATUS  VARCHAR(100),
 HOUSEHOLD_NUM    VARCHAR(255),
 RELATION  VARCHAR(255),
 NAME VARCHAR(255),
 IDENTIFICATION_NUMBER   VARCHAR(20),   
 SEX  VARCHAR(20),
 NATION VARCHAR(20),
 HOUSEHOL_TYPE VARCHAR(25),
 DATE_BIRTH VARCHAR(55),
 ADDRESS VARCHAR(255),
 ATTRIBUTION VARCHAR(255)
);
CREATE   INDEX   pcs_id ON  PCS(identification_number);