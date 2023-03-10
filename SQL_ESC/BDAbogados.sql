-------------------------------------------------------------------
--EJERCICIO 1
-- Diseñar una base de datos relacional para almacenar información sobre los 
-- asuntos que lleva un gabinete de abogados. Cada asunto tiene un número de 
-- expediente que lo identifica, y corresponde a un solo cliente. Del asunto 
-- se debe almacenar el período (fecha de inicio y fecha de archivo o finalización), 
-- su estado (en trámite, archivado, etc.), Así como los datos personales del 
-- cliente al que  pertenece (DNI, nombre, dirección, etc.). 
-- Algunos asuntos son llevados por uno o varios procuradores, de los que nos 
-- interesan también los datos personales.

--CREAR TABLA PROCURADORE

CREATE TABLE PROCURADORES(
ID_PROCURADOR NUMBER PRIMARY KEY,
NOMBRE VARCHAR2 (10),
APELLIDOS NVARCHAR2 (20),
DIRECCION NVARCHAR2 (40),
DNI_PROCURADOR NVARCHAR2 (20)
);

-- CREAR TABLA PERIODO

CREATE TABLE PERIODO(
ID_PERIODO NUMBER PRIMARY KEY,
FECHA_INICIO DATE,
FECHA_FINALIZACION DATE
);

--CREAR TABLA CLIENTES

CREATE TABLE CLIENTES(
ID_CLIENTE NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2 (10),
APELLIDOS NVARCHAR2 (20),
DIRECCION NVARCHAR2 (40)
);

--CREAR TABLA ASUNTOS
CREATE TABLE ASUNTOS(
ID_ASUNTO NUMBER PRIMARY KEY,
NUM_EXPEDIENTE NVARCHAR2 (20),
ESTADO NVARCHAR2 (10),
ID_CLIENTE NUMBER,
ID_PERIODO NUMBER,
ID_PROCURADOR NUMBER
);


ALTER TABLE CLIENTES ADD CONSTRAINT FK_ID_CLIENTE FOREIGN KEY (ID_CLIENTE) REFERENCES CLIENTES (ID_CLIENTE);
ALTER TABLE PERIODO ADD CONSTRAINT FK_ID_PERIODO FOREIGN KEY (ID_PERIODO) REFERENCES PERIODO (ID_PERIODO);
ALTER TABLE PROCURADORES ADD CONSTRAINT FK_ID_PROCURADOR FOREIGN KEY (ID_PROCURADOR) REFERENCES PROCURADORES(ID_PROCURADOR);
ALTER TABLE ASUNTOS ADD CONSTRAINT CHECK_ESTADO CHECK (ESTADO IN ('EN TRAMITE','ARCHIVADO'));


--CREAR TABLA ASUNTOS_PROCURADOR
CREATE TABLE ASUNTOS_PROCURADOR(
ID_AP NUMBER PRIMARY KEY,
ID_ASUNTO NUMBER,
ID_PROCURADOR NUMBER,
CONSTRAINT FK_IDASUNTO FOREIGN KEY (ID_ASUNTO) REFERENCES ASUNTOS (ID_ASUNTO),
CONSTRAINT FK_IDPROCURADOR FOREIGN KEY (ID_PROCURADOR) REFERENCES PROCURADORES(ID_PROCURADOR)
);


--CREAR SECUENCIA PARA ID_CLIENTE
CREATE SEQUENCE CLIENTE_SEQ 
START WITH 1 
INCREMENT BY 1 
MAXVALUE 999 
MINVALUE 1 
CYCLE;

--CREAR SECUENCIA PARA ID_PROCURADORES
CREATE SEQUENCE PROCURADORES_SEQ 
START WITH 1 
INCREMENT BY 1 
MAXVALUE 999 
MINVALUE 1 
CYCLE;

--CREAR SECUENCIA PARA ID_PERIODO
CREATE SEQUENCE PERIODO_SEQ 
START WITH 1 
INCREMENT BY 1 
MAXVALUE 999 
MINVALUE 1 
CYCLE;

--CREAR SECUENCIA PARA ID_ASUNTO
CREATE SEQUENCE ASUNTO_SEQ;

--CREAR SECUENCIA PARA ASUNTOS_PROCURADOR
CREATE SEQUENCE ASUNTOS_PROCU_SEQ;


-- CREACION DE TRIGGERS
CREATE TRIGGER INSERT_CLIENTES --CREAMOS EL TRIGGER Y SU NOMBRE
BEFORE INSERT ON CLIENTES FOR EACH ROW BEGIN -- DONDE SE EJECUTA EL TRIGGER
SELECT CLIENTE_SEQ.NEXTVAL INTO:NEW.ID_CLIENTE FROM DUAL;--Seleciona el valor de la secuencia y lo inserta
END;

CREATE TRIGGER INSERT_PROCURADORES --CREAMOS EL TRIGGER Y SU NOMBRE
BEFORE INSERT ON PROCURADORES FOR EACH ROW BEGIN -- DONDE SE EJECUTA EL TRIGGER
SELECT PROCURADORES_SEQ.NEXTVAL INTO:NEW.ID_PROCURADOR FROM DUAL;--Seleciona el valor de la secuencia y lo inserta
END;

CREATE TRIGGER INSERT_PERIODO --CREAMOS EL TRIGGER Y SU NOMBRE
BEFORE INSERT ON PERIODO FOR EACH ROW BEGIN -- DONDE SE EJECUTA EL TRIGGER
SELECT PERIODO_SEQ.NEXTVAL INTO:NEW.ID_PERIODO FROM DUAL;--Seleciona el valor de la secuencia y lo inserta
END;

CREATE TRIGGER INSERT_ASUNTO
BEFORE INSERT ON ASUNTOS FOR EACH ROW BEGIN
SELECT ASUNTO_SEQ.NEXTVAL INTO:NEW.ID_ASUNTO FROM DUAL;
END;

CREATE TRIGGER INSERT_ASUNTOS_PROCU
BEFORE INSERT ON ASUNTOS_PROCURADOR FOR EACH ROW BEGIN
SELECT ASUNTOS_PROCU_SEQ.NEXTVAL INTO:NEW.ID_AP FROM DUAL;
END;

INSERT ALL
INTO CLIENTES (NOMBRE, APELLIDOS,DIRECCION) VALUES ('EMMANUEL','SANDOVAL','DEL TALLER NO.12 SAN FRANCISCO MAZAPA')
INTO CLIENTES (NOMBRE, APELLIDOS,DIRECCION) VALUES ('ALEJANDRO','CARDENAS','DEL TALLER NO.15 SAN FRANCISCO MAZAPA')
INTO CLIENTES (NOMBRE, APELLIDOS,DIRECCION) VALUES ('LUIS','SC','DEL TALLER NO.18 SAN FRANCISCO MAZAPA')
INTO CLIENTES (NOMBRE, APELLIDOS,DIRECCION) VALUES ('ABIGAIL','AG','DEL TALLER NO.150 SAN FRANCISCO MAZAPA')
INTO CLIENTES (NOMBRE, APELLIDOS,DIRECCION) VALUES ('DANIEL','GAL','DURAZNO NO.17 SAN FRANCISCO MAZAPA')
SELECT * FROM DUAL;

INSERT ALL
INTO PROCURADORES (NOMBRE, APELLIDOS,DIRECCION) VALUES ('JORGE','PEREZ','SANTA MARIA COATLAN')
INTO PROCURADORES (NOMBRE, APELLIDOS,DIRECCION) VALUES ('ESTELA','PORTILLO','SAN FRANCISCO MAZAPA')
INTO PROCURADORES (NOMBRE, APELLIDOS,DIRECCION) VALUES ('NANCY','AGUILAR','SAN FRANCISCO MAZAPA')
INTO PROCURADORES (NOMBRE, APELLIDOS,DIRECCION) VALUES ('FRANCISCO','CONTRETAS','TLAJINGA TEOTIHUACAN')
INTO PROCURADORES (NOMBRE, APELLIDOS,DIRECCION) VALUES ('YESENIA','RAMIREZ','SAN FRANCISCO MAZAPA')
SELECT * FROM DUAL;

INSERT ALL
INTO PERIODO (FECHA_INICIO, FECHA_FINALIZACION) VALUES ('01/02/22','20/12/22')
INTO PERIODO (FECHA_INICIO, FECHA_FINALIZACION) VALUES ('15/04/22','20/10/22')
INTO PERIODO (FECHA_INICIO, FECHA_FINALIZACION) VALUES ('30/05/22','20/11/22')
INTO PERIODO (FECHA_INICIO, FECHA_FINALIZACION) VALUES ('25/06/22','20/09/22')
INTO PERIODO (FECHA_INICIO, FECHA_FINALIZACION) VALUES ('08/11/22','')
SELECT * FROM DUAL;

INSERT ALL
INTO ASUNTOS (NUM_EXPEDIENTE, ESTADO, ID_CLIENTE, ID_PERIODO, ID_PROCURADOR) VALUES ('00001','ARCHIVADO',1,1,1)
INTO ASUNTOS (NUM_EXPEDIENTE, ESTADO, ID_CLIENTE, ID_PERIODO, ID_PROCURADOR) VALUES ('00002','ARCHIVADO',2,2,2)
INTO ASUNTOS (NUM_EXPEDIENTE, ESTADO, ID_CLIENTE, ID_PERIODO, ID_PROCURADOR) VALUES ('00003','ARCHIVADO',3,3,3)
INTO ASUNTOS (NUM_EXPEDIENTE, ESTADO, ID_CLIENTE, ID_PERIODO, ID_PROCURADOR) VALUES ('00004','ARCHIVADO',4,4,4)
INTO ASUNTOS (NUM_EXPEDIENTE, ESTADO, ID_CLIENTE, ID_PERIODO, ID_PROCURADOR) VALUES ('00005','EN TRAMITE',4,4,4)
SELECT * FROM DUAL;

INSERT ALL
INTO ASUNTOS_PROCURADOR (ID_ASUNTO, ID_PROCURADOR) VALUES (2,1)
INTO ASUNTOS_PROCURADOR (ID_ASUNTO, ID_PROCURADOR) VALUES (3,2)
INTO ASUNTOS_PROCURADOR (ID_ASUNTO, ID_PROCURADOR) VALUES (4,3)
INTO ASUNTOS_PROCURADOR (ID_ASUNTO, ID_PROCURADOR) VALUES (1,3)
INTO ASUNTOS_PROCURADOR (ID_ASUNTO, ID_PROCURADOR) VALUES (5,5)
SELECT * FROM DUAL;

COMMIT;