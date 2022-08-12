CREATE DATABASE CONTACTOS;

USE CONTACTOS;



CREATE TABLE  IF NOT EXISTS CONTACTO(
id_contacto INT NOT NULL AUTO_INCREMENT,
nombre varchar(30),
telefono INT,
email  varchar(30),
fecha_nacimiento varchar(15),
estado INT,
PRIMARY KEY(id_contacto)
)ENGINE=INNODB;

INSERT INTO CONTACTO(id_contacto,nombre,telefono,email,fecha_nacimiento,estado)VALUES
(1,'Estevan Tangarife Correa',111,'estevan@.com','1998-07-06',1);


SELECT * FROM CONTACTO;

UPDATE contacto SET estado = 0
where id_contacto = 2;
 





