-- EJERCICIO 1

CREATE TABLE asunto(
    id_asunto NUMBER PRIMARY KEY,
    No_expediente NUMBER,
    estado NVARCHAR2(10),
    id_periodo NUMBER,
    id_cliente NUMBER
);

-- CREANDO UNA RESTRICCION DE ESTADO
ALTER TABLE asunto ADD CONSTRAINT chek_estado CHECK (estado IN('TRAMITE', 'ARCHIVADO'));


CREATE TABLE cliente(
    id_cliente NUMBER PRIMARY KEY,
    dni NVARCHAR2(18) ,
    nombre NVARCHAR2(30),
    direccion NVARCHAR2(40)
);


CREATE TABLE procurador(
    id_procurador NUMBER PRIMARY KEY,
    cedula NUMBER,
    nombre NVARCHAR2(30),
    direccion NVARCHAR2(40)
);


CREATE TABLE periodo(
    id_periodo NUMBER PRIMARY KEY,
    fech_inicio DATE,
    fecha_archivo DATE NULL
);

CREATE TABLE asunto_procurador(
    id_ap NUMBER PRIMARY KEY,
    id_asunto NUMBER,
    id_procurador NUMBER
);
    


--RELACIONANDO LAS TABLAS
ALTER TABLE asunto ADD CONSTRAINT fk_id_periodo 
FOREIGN KEY (id_periodo) 
REFERENCES periodo (id_periodo);

ALTER TABLE asunto ADD CONSTRAINT fk_id_cliente 
FOREIGN KEY (id_cliente) 
REFERENCES cliente (id_cliente);

ALTER TABLE asunto_procurador ADD CONSTRAINT fk_id_asunto 
FOREIGN KEY (id_asunto) 
REFERENCES asunto (id_asunto);

ALTER TABLE asunto_procurador ADD CONSTRAINT fk_id_procurador 
FOREIGN KEY (id_procurador) 
REFERENCES procurador (id_procurador);


-- CREANDO LOS TRIGGERS

-- TABLA CLIENTE
CREATE SEQUENCE cliente_seq;

CREATE TRIGGER insert_cliente 
BEFORE INSERT ON cliente FOR EACH ROW BEGIN 
SELECT cliente_seq.NEXTVAL INTO:NEW.id_cliente FROM DUAL; 
END; 

-- TABLA ASUNTO
CREATE SEQUENCE asunto_seq;

CREATE TRIGGER insert_asunto 
BEFORE INSERT ON asunto FOR EACH ROW BEGIN 
SELECT asunto_seq.NEXTVAL INTO:NEW.id_asunto FROM DUAL; 
END;

-- TABLA PROCURADOR
CREATE SEQUENCE procurador_seq;

CREATE TRIGGER insert_procurador 
BEFORE INSERT ON procurador FOR EACH ROW BEGIN 
SELECT procurador_seq.NEXTVAL INTO:NEW.id_procurador FROM DUAL; 
END;

-- TABLA PERIODO
CREATE SEQUENCE periodo_seq;

CREATE TRIGGER insert_periodo 
BEFORE INSERT ON periodo FOR EACH ROW BEGIN 
SELECT periodo_seq.NEXTVAL INTO:NEW.id_periodo FROM DUAL; 
END;

--TABLA ASUNTO_PROCURADOR
CREATE SEQUENCE asunto_procurador_seq;

CREATE TRIGGER insert_periodo_procurador
BEFORE INSERT ON asunto_procurador FOR EACH ROW BEGIN
SELECT asunto_procurador_seq.NEXTVAL INTO:NEW.id_ap FROM DUAL;
END;

commit;

-- INSERTANDO DATOS CLIENTES 
INSERT ALL 
INTO cliente (dni, nombre,direccion) VALUES('254864', 'JOSE RODRIGUES', ' LAS PALMAS 25 RUSIA MEXICO DF 68454')
INTO cliente (dni, nombre,direccion) VALUES('154864', 'ALBERTO MORALEZ', ' LAS PALMAS 25 RUSIA MEXICO DF 68454')
INTO cliente (dni, nombre,direccion) VALUES('854864', 'CARLOS GUTIERREZ', ' LAS PALMAS 25 RUSIA MEXICO DF 68454')
INTO cliente (dni, nombre,direccion) VALUES('954864', 'JESUS AYALA', ' LAS PALMAS 25 RUSIA MEXICO DF 68454')
INTO cliente (dni, nombre,direccion) VALUES('754864', 'ROSA PEREZ', ' LAS PALMAS 25 RUSIA MEXICO DF 68454')
SELECT * FROM DUAL;

describe cliente;

--INSERTANDO DATOS PROCURADOR
INSERT ALL 
INTO procurador (cedula, nombre,direccion) VALUES(2548864, 'JOSE RODRIGUES', ' LAS PALMAS 25 RUSIA MEXICO DF 68454')
INTO procurador (cedula, nombre,direccion) VALUES(1548694, 'ALBERTO MORALEZ', ' LAS PALMAS 25 RUSIA MEXICO DF 68454')
INTO procurador (cedula, nombre,direccion) VALUES(8548674, 'CARLOS GUTIERREZ', ' LAS PALMAS 25 RUSIA MEXICO DF 68454')
INTO procurador (cedula, nombre,direccion) VALUES(9548664, 'JESUS AYALA', ' LAS PALMAS 25 RUSIA MEXICO DF 68454')
INTO procurador (cedula, nombre,direccion) VALUES(7548264, 'ROSA PEREZ', ' LAS PALMAS 25 RUSIA MEXICO DF 68454')
SELECT * FROM DUAL;

describe procurador;

-- INSERTANDO DATOS PERIODO
INSERT ALL 
INTO periodo (fech_inicio, fecha_archivo) VALUES('01/12/20','08/06/22')
INTO periodo (fech_inicio, fecha_archivo) VALUES('05/02/21','08/06/22')
INTO periodo (fech_inicio, fecha_archivo) VALUES('08/06/21','08/06/22')
INTO periodo (fech_inicio, fecha_archivo) VALUES('18/05/21','08/06/22')
INTO periodo (fech_inicio, fecha_archivo) VALUES('19/04/20','08/06/22')
SELECT * FROM DUAL;

describe periodo;

--INSERTANDO DATOS ASUNTO
INSERT ALL 
INTO asunto (No_expediente, estado, id_periodo, id_cliente) VALUES(12,'TRAMITE',1,1)
INTO asunto (No_expediente, estado, id_periodo, id_cliente) VALUES(15, 'TRAMITE',2,2)
INTO asunto (No_expediente, estado, id_periodo, id_cliente) VALUES(25, 'TRAMITE',3,3)
INTO asunto (No_expediente, estado, id_periodo, id_cliente) VALUES(30, 'TRAMITE',4,4)
INTO asunto (No_expediente, estado, id_periodo, id_cliente) VALUES(36, 'TRAMITE',5,5)
SELECT * FROM DUAL;
describe asunto;

-- INSERTANDO DATOS EN ASUNTO_PROCURADOR
INSERT ALL 
INTO asunto_procurador (id_asunto, id_procurador) VALUES (1,1)
INTO asunto_procurador (id_asunto, id_procurador) VALUES (2,2)
INTO asunto_procurador (id_asunto, id_procurador) VALUES (3,1)
INTO asunto_procurador (id_asunto, id_procurador) VALUES (4,3)
INTO asunto_procurador (id_asunto, id_procurador) VALUES (5,3)
SELECT * FROM DUAL;

DESCRIBE asunto_procurador;
COMMIT;