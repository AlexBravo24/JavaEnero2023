--------------------------------------------------------------------------
-- EJERCICIO AEROLINEA
----------------------

--ENTIDADES FUERTES

CREATE TABLE BASES(
ID_BASE NUMBER PRIMARY KEY,
TIPO NVARCHAR2(20)
);

CREATE SEQUENCE BASES_SEQ;

CREATE TRIGGER INSERT_BASES 
BEFORE INSERT ON BASES FOR EACH ROW BEGIN
SELECT BASES_SEQ.NEXTVAL INTO:NEW.ID_BASE FROM DUAL;
END;

INSERT INTO BASES (TIPO) VALUES ('MANTENIMIENTO');
INSERT INTO BASES (TIPO) VALUES ('DESCANSO');
SELECT * FROM BASES;

CREATE TABLE VUELO(
ID_VUELO NUMBER PRIMARY KEY,
ORIGEN NVARCHAR2(30),
DESTINO NVARCHAR2(30),
HORARIOVIAJE DATE
);

CREATE SEQUENCE VUELO_SEQ;

CREATE TRIGGER INSERT_VUELO 
BEFORE INSERT ON VUELO FOR EACH ROW BEGIN
SELECT VUELO_SEQ.NEXTVAL INTO:NEW.ID_VUELO FROM DUAL;
END;

INSERT ALL 
INTO VUELO (ORIGEN, DESTINO, HORARIOVIAJE) VALUES
('MEXICO','JAPON', TO_DATE ('20/01/2023 01:30:00', 'DD-MM-YYYY HH24:MI:SS'))
INTO VUELO (ORIGEN, DESTINO, HORARIOVIAJE) VALUES
('CDMX','MEDELLIN', TO_DATE ('21/01/2023 02:30:00', 'DD-MM-YYYY HH24:MI:SS'))
INTO VUELO (ORIGEN, DESTINO, HORARIOVIAJE) VALUES
('CDMX','COSTA RICA', TO_DATE ('22/01/2023 04:30:00', 'DD-MM-YYYY HH24:MI:SS'))
INTO VUELO (ORIGEN, DESTINO, HORARIOVIAJE) VALUES
('MONTERREY','TIJUANA', TO_DATE ('23/01/2023 04:30:00', 'DD-MM-YYYY HH24:MI:SS'))
INTO VUELO (ORIGEN, DESTINO, HORARIOVIAJE) VALUES
('PUEBLA','CANCUN', TO_DATE ('24/01/2023 06:30:00', 'DD-MM-YYYY HH24:MI:SS'))
SELECT * FROM DUAL;

CREATE TABLE LISTAS_CLIENTES(
ID_CLIENTE NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(30),
TELEFONO NVARCHAR2(10),
DIRECCION NVARCHAR2(30)
);

CREATE SEQUENCE LISTAS_CLIENTES_SEQ;

CREATE TRIGGER INSERT_LISTAS_CLIENTES 
BEFORE INSERT ON LISTAS_CLIENTES FOR EACH ROW BEGIN
SELECT LISTAS_CLIENTES_SEQ.NEXTVAL INTO:NEW.ID_CLIENTE FROM DUAL;
END;

INSERT ALL 
INTO LISTAS_CLIENTES (NOMBRE, DIRECCION, TELEFONO) VALUES ('AYLIN','XALAPA','2282330908')
INTO LISTAS_CLIENTES (NOMBRE, DIRECCION, TELEFONO) VALUES ('ALEX','XALAPA','2281072635')
INTO LISTAS_CLIENTES (NOMBRE, DIRECCION, TELEFONO) VALUES ('ALEJANDRO','CDMX','3023079497')
INTO LISTAS_CLIENTES (NOMBRE, DIRECCION, TELEFONO) VALUES ('EMMANUEL','CDMX','5630345103')
INTO LISTAS_CLIENTES (NOMBRE, DIRECCION, TELEFONO) VALUES ('EDUARDO','MORELIA','4438443145')
SELECT * FROM DUAL;

SELECT * FROM LISTAS_CLIENTES;
SELECT * FROM VUELO;

---------------------------
-- ENTIDADES DEBILES

CREATE TABLE AVIONES(
ID_AVION NUMBER PRIMARY KEY,
MODELO NVARCHAR2(20),
ID_BASE NUMBER,
CONSTRAINT FK_IDBASE_AVIONES
FOREIGN KEY (ID_BASE)
REFERENCES BASES (ID_BASE),
CONSTRAINT CHECK_BASE_AVIONES CHECK (ID_BASE IN (1))
);

CREATE SEQUENCE AVIONES_SEQ;

CREATE TRIGGER INSERT_AVIONES
BEFORE INSERT ON AVIONES FOR EACH ROW BEGIN
SELECT AVIONES_SEQ.NEXTVAL INTO:NEW.ID_AVION FROM DUAL;
END;

INSERT ALL
INTO AVIONES (MODELO, ID_BASE) VALUES ('BOEING', 1)
INTO AVIONES (MODELO, ID_BASE) VALUES ('AIRBUS 300', 1)
INTO AVIONES (MODELO, ID_BASE) VALUES ('JET', 1)
INTO AVIONES (MODELO, ID_BASE) VALUES ('VOLVO', 1)
INTO AVIONES (MODELO, ID_BASE) VALUES ('Embraer E-Jet', 1)
SELECT * FROM DUAL;
SELECT * FROM AVIONES;

COMMIT;

CREATE TABLE PILOTOS(
ID_PILOTO NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(30),
HORASVIAJE NUMBER,
ID_BASE NUMBER,
CONSTRAINT FK_IDBASE_PILOTOS
FOREIGN KEY (ID_BASE)
REFERENCES BASES (ID_BASE),
CONSTRAINT CHECK_BASE_PILOTOS CHECK (ID_BASE IN (2))
);

CREATE SEQUENCE PILOTOS_SEQ;

CREATE TRIGGER INSERT_PILOTOS 
BEFORE INSERT ON PILOTOS FOR EACH ROW BEGIN
SELECT PILOTOS_SEQ.NEXTVAL INTO:NEW.ID_PILOTO FROM DUAL;
END;

--REGISRO DE PILOTOS
INSERT ALL
INTO PILOTOS (NOMBRE, HORASVIAJE, ID_BASE) VALUES ('HUGO',300, 2)
INTO PILOTOS (NOMBRE, HORASVIAJE, ID_BASE) VALUES ('PACO',600, 2)
INTO PILOTOS (NOMBRE, HORASVIAJE, ID_BASE) VALUES ('LUIS',400, 2)
INTO PILOTOS (NOMBRE, HORASVIAJE, ID_BASE) VALUES ('PEDRO',850, 2)
INTO PILOTOS (NOMBRE, HORASVIAJE, ID_BASE) VALUES ('JAYRO',330, 2)
SELECT * FROM DUAL;


CREATE TABLE VUELO_AVION_PILOTO(
ID_VAP NUMBER PRIMARY KEY,
ID_VUELO NUMBER,
ID_AVION NUMBER,
ID_PILOTO NUMBER,
CONSTRAINT FK_IDVUELO_VAP
FOREIGN KEY (ID_VUELO)
REFERENCES VUELO (ID_VUELO),
CONSTRAINT FK_IDAVION_VAP
FOREIGN KEY (ID_AVION)
REFERENCES AVIONES (ID_AVION),
CONSTRAINT FK_IDPILOTO_VAP
FOREIGN KEY (ID_PILOTO)
REFERENCES PILOTOS (ID_PILOTO)
);

CREATE SEQUENCE VUELO_AVION_PILOTO_SEQ;

CREATE TRIGGER INSERT_VUELO_AVION_PILOTO 
BEFORE INSERT ON VUELO_AVION_PILOTO FOR EACH ROW BEGIN
SELECT VUELO_AVION_PILOTO_SEQ.NEXTVAL INTO:NEW.ID_VAP FROM DUAL;
END;

--REGISTROS DE VUELO_AVION_PILOTO
INSERT ALL
INTO VUELO_AVION_PILOTO (ID_VUELO, ID_AVION, ID_PILOTO) VALUES (1,3,2)
INTO VUELO_AVION_PILOTO (ID_VUELO, ID_AVION, ID_PILOTO) VALUES (2,4,1)
INTO VUELO_AVION_PILOTO (ID_VUELO, ID_AVION, ID_PILOTO) VALUES (3,1,4)
INTO VUELO_AVION_PILOTO (ID_VUELO, ID_AVION, ID_PILOTO) VALUES (4,2,5)
INTO VUELO_AVION_PILOTO (ID_VUELO, ID_AVION, ID_PILOTO) VALUES (5,5,3)
SELECT * FROM DUAL;


CREATE TABLE TRIPULACION(
ID_TRIPULACION NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(30),
ID_BASE NUMBER,
CONSTRAINT FK_IDBASE_TRIPULACION
FOREIGN KEY (ID_BASE)
REFERENCES BASES (ID_BASE),
CONSTRAINT CHECK_BASE_TRIPULACION CHECK (ID_BASE IN (2))
);

CREATE SEQUENCE TRIPULACION_SEQ;

CREATE TRIGGER INSERT_TRIPULACION 
BEFORE INSERT ON TRIPULACION FOR EACH ROW BEGIN
SELECT TRIPULACION_SEQ.NEXTVAL INTO:NEW.ID_TRIPULACION FROM DUAL;
END;

--REGISTROS DE TRIPULACION
INSERT ALL
INTO TRIPULACION (NOMBRE, ID_BASE) VALUES ('ABDIEL',2)
INTO TRIPULACION (NOMBRE, ID_BASE) VALUES ('MARCOS',2)
INTO TRIPULACION (NOMBRE, ID_BASE) VALUES ('TAVO',2)
INTO TRIPULACION (NOMBRE, ID_BASE) VALUES ('AARON',2)
INTO TRIPULACION (NOMBRE, ID_BASE) VALUES ('CESAR',2)
SELECT * FROM DUAL;

SELECT * FROM TRIPULACION;
COMMIT;

CREATE TABLE VUELO_TRIPULACION(
ID_VT NUMBER PRIMARY KEY,
ID_VUELO NUMBER,
ID_TRIPULACION NUMBER,
CONSTRAINT FK_IDVUELO_VT
FOREIGN KEY (ID_VUELO)
REFERENCES VUELO (ID_VUELO),
CONSTRAINT FK_IDTRIPULACION_VT
FOREIGN KEY (ID_TRIPULACION)
REFERENCES TRIPULACION (ID_TRIPULACION)
);

CREATE SEQUENCE VUELO_TRIPULACION_SEQ;

CREATE TRIGGER INSERT_VUELO_TRIPULACION 
BEFORE INSERT ON VUELO_TRIPULACION FOR EACH ROW BEGIN
SELECT VUELO_TRIPULACION_SEQ.NEXTVAL INTO:NEW.ID_VT FROM DUAL;
END;

--REGISTROS DE VUELO_TRIPULACION
INSERT ALL
INTO VUELO_TRIPULACION (ID_VUELO, ID_TRIPULACION) VALUES (1,2)
INTO VUELO_TRIPULACION (ID_VUELO, ID_TRIPULACION) VALUES (2,3)
INTO VUELO_TRIPULACION (ID_VUELO, ID_TRIPULACION) VALUES (3,4)
INTO VUELO_TRIPULACION (ID_VUELO, ID_TRIPULACION) VALUES (4,5)
INTO VUELO_TRIPULACION (ID_VUELO, ID_TRIPULACION) VALUES (5,1)
SELECT * FROM DUAL;

CREATE TABLE BOLETOS(
ID_BOLETO NUMBER PRIMARY KEY,
ID_VUELO NUMBER,
ID_CLIENTE NUMBER,
COSTO NUMBER (6,2),
CONSTRAINT FK_IDVUELO_BOLETOS
FOREIGN KEY (ID_VUELO)
REFERENCES VUELO (ID_VUELO),
CONSTRAINT FK_IDCLIENTE_BOLETOS
FOREIGN KEY (ID_CLIENTE)
REFERENCES LISTAS_CLIENTES (ID_CLIENTE)
);

CREATE SEQUENCE BOLETOS_SEQ;

CREATE TRIGGER INSERT_BOLETOS
BEFORE INSERT ON BOLETOS FOR EACH ROW BEGIN
SELECT BOLETOS_SEQ.NEXTVAL INTO:NEW.ID_BOLETO FROM DUAL;
END;

--REGISTROS DE BOLETOS
INSERT ALL
INTO BOLETOS (ID_VUELO, ID_CLIENTE, COSTO) VALUES (1,3,9999.99)
INTO BOLETOS (ID_VUELO, ID_CLIENTE, COSTO) VALUES (2,4,8999.99)
INTO BOLETOS (ID_VUELO, ID_CLIENTE, COSTO) VALUES (3,5,7999.99)
INTO BOLETOS (ID_VUELO, ID_CLIENTE, COSTO) VALUES (4,1,4999.50)
INTO BOLETOS (ID_VUELO, ID_CLIENTE, COSTO) VALUES (5,2,5500)
SELECT * FROM DUAL;

SELECT * FROM BOLETOS;
COMMIT;