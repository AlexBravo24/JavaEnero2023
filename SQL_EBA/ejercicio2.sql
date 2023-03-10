CREATE TABLE SOCIO(
ID_SOCIO NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(30),
DIRECCION NVARCHAR2 (30),
TELEFONO NVARCHAR2(10)
);

CREATE SEQUENCE SOCIO_SEQ;

CREATE TRIGGER INSERT_SOCIO
BEFORE INSERT ON SOCIO FOR EACH ROW BEGIN
SELECT SOCIO_SEQ.NEXTVAL INTO:NEW.ID_SOCIO FROM DUAL;
END;


CREATE TABLE BARCO(
ID_BARCO NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(30),
NUM_AMARRE NUMBER,
CUOTA NUMBER (6,2)
);

CREATE SEQUENCE BARCO_SEQ;

CREATE TRIGGER INSERT_BARCO
BEFORE INSERT ON BARCO FOR EACH ROW BEGIN
SELECT BARCO_SEQ.NEXTVAL INTO:NEW.ID_BARCO FROM DUAL;
END;

CREATE TABLE PATRONS(
ID_PATRON NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(30),
DIRECCION NVARCHAR2 (30),
TELEFONO NVARCHAR2(10)
);

CREATE SEQUENCE PATRON_SEQ;

CREATE TRIGGER INSERT_PATRON
BEFORE INSERT ON PATRONS FOR EACH ROW BEGIN
SELECT PATRON_SEQ.NEXTVAL INTO:NEW.ID_PATRON FROM DUAL;
END;

CREATE TABLE SOCIOS_BARCO(
ID_SB NUMBER PRIMARY KEY,
ID_SOCIO NUMBER,
ID_BARCO NUMBER,
CONSTRAINT FK_ID_SOCIO
FOREIGN KEY (ID_SOCIO)
REFERENCES SOCIO (ID_SOCIO),
CONSTRAINT FK_ID_BARCO
FOREIGN KEY (ID_BARCO)
REFERENCES BARCO (ID_BARCO)
);

CREATE SEQUENCE SOCIOSBARCO_SEQ;

CREATE TRIGGER INSERT_SOCIOSBARCO
BEFORE INSERT ON SOCIOS_BARCO FOR EACH ROW BEGIN
SELECT SOCIOSBARCO_SEQ.NEXTVAL INTO:NEW.ID_SB FROM DUAL;
END;


CREATE TABLE SALIDAS_BARCO(
ID_SALIDA NUMBER PRIMARY KEY,
DESTINO NVARCHAR2(30),
FECHASALIDA DATE,
ID_BARCO NUMBER,
ID_PATRON NUMBER,
CONSTRAINT FK_IDBARCO
FOREIGN KEY (ID_BARCO)
REFERENCES BARCO (ID_BARCO),
CONSTRAINT FK_IDPATRON
FOREIGN KEY (ID_PATRON)
REFERENCES PATRON (ID_PATRON)
);

CREATE SEQUENCE SALIDASBARCO_SEQ;

CREATE TRIGGER INSERT_SALIDASBARCO
BEFORE INSERT ON SALIDAS_BARCO FOR EACH ROW BEGIN
SELECT SALIDASBARCO_SEQ.NEXTVAL INTO:NEW.ID_SALIDA FROM DUAL;
END;

DESCRIBE SOCIO;

INSERT ALL
INTO SOCIO (NOMBRE, DIRECCION, TELEFONO)  VALUES ('AYLIN','XALAPA','2282330908')
INTO SOCIO (NOMBRE, DIRECCION, TELEFONO)  VALUES ('ALEX','XALAPA','2281072635')
INTO SOCIO (NOMBRE, DIRECCION, TELEFONO)  VALUES ('ALEJANDRO','CDMX','3023079497')
INTO SOCIO (NOMBRE, DIRECCION, TELEFONO)  VALUES ('EMMANUEL','CDMX','5630345103')
INTO SOCIO (NOMBRE, DIRECCION, TELEFONO)  VALUES ('EDUARDO','MORELIA','4438443145')
SELECT * FROM DUAL;

SELECT * FROM SOCIO;

INSERT ALL
INTO PATRONS (NOMBRE, DIRECCION, TELEFONO)  VALUES ('ABDIEL','XALAPA','2282535827')
INTO PATRONS (NOMBRE, DIRECCION, TELEFONO)  VALUES ('MARCOS','XALAPA','2283054341')
INTO PATRONS (NOMBRE, DIRECCION, TELEFONO)  VALUES ('TAVO','ACAPULCO','7441198412')
INTO PATRONS (NOMBRE, DIRECCION, TELEFONO)  VALUES ('AARON','XALAPA','2283443722')
INTO PATRONS (NOMBRE, DIRECCION, TELEFONO)  VALUES ('CESAR','ACAPULCO','7443838589')
SELECT * FROM DUAL;

SELECT * FROM PATRON;

DESCRIBE BARCO;
INSERT ALL
INTO BARCO (NOMBRE, NUM_AMARRE, CUOTA) VALUES ('LA NI???A', 11, 800.50)
INTO BARCO (NOMBRE, NUM_AMARRE, CUOTA) VALUES ('LA PINTA', 12, 900.50)
INTO BARCO (NOMBRE, NUM_AMARRE, CUOTA) VALUES ('ST. MARIE', 13, 1000.50)
INTO BARCO (NOMBRE, NUM_AMARRE, CUOTA) VALUES ('MINI TITANIC', 14, 2000.50)
INTO BARCO (NOMBRE, NUM_AMARRE, CUOTA) VALUES ('POSEIDON', 15, 5000.50)
SELECT * FROM DUAL;

SELECT * FROM BARCO;

DESCRIBE SOCIOS_BARCO;

INSERT ALL
INTO SOCIOS_BARCO (ID_SOCIO,ID_BARCO) VALUES (1,1)
INTO SOCIOS_BARCO (ID_SOCIO,ID_BARCO) VALUES (2,2)
INTO SOCIOS_BARCO (ID_SOCIO,ID_BARCO) VALUES (3,3)
INTO SOCIOS_BARCO (ID_SOCIO,ID_BARCO) VALUES (4,4)
INTO SOCIOS_BARCO (ID_SOCIO,ID_BARCO) VALUES (5,5)
SELECT * FROM DUAL;

SELECT * FROM SOCIOS_BARCO;

DESCRIBE SALIDAS_BARCO;

INSERT ALL
INTO SALIDAS_BARCO (DESTINO,FECHASALIDA,ID_BARCO,ID_PATRON) 
VALUES ('VERACRUZ',TO_DATE('20/01/2023 01:30:00','DD-MM-YYYY HH24:MI:SS'),1,1)
INTO SALIDAS_BARCO (DESTINO,FECHASALIDA,ID_BARCO,ID_PATRON) 
VALUES ('VILLAHERMOSA',TO_DATE('21/01/2023 13:30:00','DD-MM-YYYY HH24:MI:SS'),1,1)
INTO SALIDAS_BARCO (DESTINO,FECHASALIDA,ID_BARCO,ID_PATRON) 
VALUES ('CAMPECHE',TO_DATE('22/01/2023 14:30:00','DD-MM-YYYY HH24:MI:SS'),1,1)
INTO SALIDAS_BARCO (DESTINO,FECHASALIDA,ID_BARCO,ID_PATRON) 
VALUES ('YUCATAN',TO_DATE('23/01/2023 15:30:00','DD-MM-YYYY HH24:MI:SS'),1,1)
INTO SALIDAS_BARCO (DESTINO,FECHASALIDA,ID_BARCO,ID_PATRON) 
VALUES ('CANCUN',TO_DATE('24/01/2023 16:30:00','DD-MM-YYYY HH24:MI:SS'),1,1)
SELECT * FROM DUAL;

INSERT INTO SALIDAS_BARCO (DESTINO,FECHASALIDA,ID_BARCO,ID_PATRON) 
VALUES ('COZUMEL',TO_DATE('25/01/2023 12:00:00','DD-MM-YYYY HH24:MI:SS'),1,1);

SELECT * FROM SALIDAS_BARCO;

-- CONSULTAR HORARIO Y FECHA
SELECT ID_SALIDA,DESTINO, TO_CHAR(FECHASALIDA, 'DD-MM-YYYY HH24:MI:SS') FROM SALIDAS_BARCO;

-- CONSULTAR UNICAMENTE HORARIO DE SALIDA
SELECT ID_SALIDA,DESTINO, TO_CHAR(FECHASALIDA, 'HH24:MI:SS') FROM SALIDAS_BARCO;

COMMIT;







