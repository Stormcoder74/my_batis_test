CREATE TABLE subscriber (
	id bigint NOT NULL ,
	name VARCHAR( 255 ) NOT NULL ,
	ref_tariff VARCHAR( 10 ) NOT NULL ,
	PRIMARY KEY ( id ) 
);

CREATE TABLE tariff (
	id bigint NOT NULL ,
	descr VARCHAR( 255 ) NOT NULL ,
	PRIMARY KEY ( id ) 
);

CREATE TABLE payments (
	id bigint NOT NULL ,
	ref_subscriber bigint NOT NULL ,
	summa bigint NOT NULL ,
	PRIMARY KEY ( id ) 
);