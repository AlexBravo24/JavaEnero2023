CREATE TABLE ALUMNO(
ID_ALUMNO NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2 (30), 
FECHANAC DATE, 
SEXO NVARCHAR2 (10), 
CURP NVARCHAR2 (18), 
GRADO NVARCHAR2 (20), 
STATUS NUMBER,
CONSTRAINT "CHECK_SEXO" CHECK (SEXO IN ('MASCULINO','FEMENINO')));

CREATE TABLE CARRERAS(
ID_CARRERA NUMBER PRIMARY KEY, 
NOMBRE NVARCHAR2(30), 
AREA NVARCHAR2(30), 
NUM_SEMESTRES NUMBER, 
NUM_MATERIAS NUMBER, 
CREDITOS NUMBER );

CREATE TABLE CARRERAS_ALUMNOS(
ID_CA NUMBER PRIMARY KEY, 
ID_CARRERA NUMBER,
ID_ALUMNO NUMBER),
CONSTRAINT FK_CA_ALUMNO FOREIGN KEY (ID_ALUMNO) REFERENCES ALUMNO (ID_ALUMNO),
CONSTRAINT FK_CA_CARRERA FOREIGN KEY (ID_CARRERA) REFERENCES CARRERAS (ID_CARRERA);


INSERT INTO ALUMNO VALUES
(7,'TAVO','13/06/1998','MASCULINO','JAFG130698HGRMJ0S2','8O SEMESTRE',1);
INSERT INTO ALUMNO VALUES
(2,'ALEX','08/05/1998','MASCULINO','JAFG130698HGRMJ0S2','8O SEMESTRE',1);
INSERT INTO ALUMNO VALUES
(8,'EMMANUEL','14/06/1993','MASCULINO','JAFG130698HGRMJ0S2','8O SEMESTRE',1);
INSERT INTO ALUMNO VALUES
(1,'AYLIN','19/04/1995','FEMENINO','JAFG130698HGRMJ0S2','8O SEMESTRE',1);
INSERT INTO ALUMNO VALUES
(10,'CESAR','14/02/1997','MASCULINO','JAFG130698HGRMJ0S2','8O SEMESTRE',1);
INSERT INTO ALUMNO VALUES
(3,'ALEX II','25/04/1997','MASCULINO','JAFG130698HGRMJ0S2','8O SEMESTRE',1);
INSERT INTO ALUMNO VALUES
(5,'MARCOS','19/05/1996','MASCULINO','JAFG130698HGRMJ0S2','8O SEMESTRE',1);
INSERT INTO ALUMNO VALUES
(6,'EDUARDO','01/11/1995','MASCULINO','JAFG130698HGRMJ0S2','8O SEMESTRE',1);
INSERT INTO ALUMNO VALUES
(4,'ABDIEL','30/12/1997','MASCULINO','JAFG130698HGRMJ0S2','8O SEMESTRE',1);
INSERT INTO ALUMNO VALUES
(9,'AARON','19/10/1995','MASCULINO','JAFG130698HGRMJ0S2','8O SEMESTRE',1);
INSERT INTO ALUMNO VALUES
(11,'AARON',TO_DATE ('1995/10/19','YYYY-MM-DD'),'MASCULINO','JAFG130698HGRMJ0S2','8O SEMESTRE',1);


SELECT * FROM ALUMNO;
commit;--PARA GUARDAS LOS DATOS EN LA DB

CREATE TABLE TUTORES(
ID_TUTOR NUMBER PRIMARY KEY, 
NOMBRE NVARCHAR2(30), 
CLAVE NVARCHAR2(30),
CONSTRAINT "TUTORES_CHECK" CHECK (CLAVE IN ('A','B','C','D')));

CREATE TABLE ALUMNOS_TUTORES(
ID_REL NUMBER PRIMARY KEY, 
ID_ALUMNO NUMBER, 
ID_TUTOR NUMBER,
CONSTRAINT FK_AT_ALUMNO FOREIGN KEY (ID_ALUMNO) REFERENCES ALUMNO (ID_ALUMNO),
CONSTRAINT FK_AT_TUTORES FOREIGN KEY (ID_TUTOR) REFERENCES TUTORES (ID_TUTOR));


INSERT INTO TUTORES
(ID_TUTOR, NOMBRE, CLAVE)
VALUES(1, 'PACO', 'A');
INSERT INTO TUTORES
(ID_TUTOR, NOMBRE, CLAVE)
VALUES(2, 'JOSE', 'A');
INSERT INTO TUTORES
(ID_TUTOR, NOMBRE, CLAVE)
VALUES(3, 'VANE', 'C');
INSERT INTO TUTORES
(ID_TUTOR, NOMBRE, CLAVE)
VALUES(4, 'JULIO', 'C');
INSERT INTO TUTORES
(ID_TUTOR, NOMBRE, CLAVE)
VALUES(5, 'ANA', 'C');
INSERT INTO TUTORES
(ID_TUTOR, NOMBRE, CLAVE)
VALUES(6, 'OSCAR', 'B');
INSERT INTO TUTORES
(ID_TUTOR, NOMBRE, CLAVE)
VALUES(7, 'LUNA', 'B');
INSERT INTO TUTORES
(ID_TUTOR, NOMBRE, CLAVE)
VALUES(8, 'JIMENA', 'D');
INSERT INTO TUTORES
(ID_TUTOR, NOMBRE, CLAVE)
VALUES(9, 'CRISTINA', 'D');
INSERT INTO TUTORES
(ID_TUTOR, NOMBRE, CLAVE)
VALUES(10, 'DAMIAN', 'D');

INSERT INTO ALUMNOS_TUTORES
(ID_REL, ID_ALUMNO, ID_TUTOR)
VALUES(1, 7, 4);
INSERT INTO ALUMNOS_TUTORES
(ID_REL, ID_ALUMNO, ID_TUTOR)
VALUES(2, 5, 5);
INSERT INTO ALUMNOS_TUTORES
(ID_REL, ID_ALUMNO, ID_TUTOR)
VALUES(3, 4, 7);
INSERT INTO ALUMNOS_TUTORES
(ID_REL, ID_ALUMNO, ID_TUTOR)
VALUES(4, 9, 5);
INSERT INTO ALUMNOS_TUTORES
(ID_REL, ID_ALUMNO, ID_TUTOR)
VALUES(5, 1, 2);

DROP TABLE ALUMNOS_TUTORES;

CREATE SEQUENCE ALUMNO_SEQ START WITH 13 INCREMENT BY 1
MAXVALUE 999 MINVALUE 1 CYCLE;

CREATE SEQUENCE ALUMNO_TUTO_SEQ;

CREATE TRIGGER INSERT_ALUMNOS
BEFORE INSERT ON ALUMNO FOR EACH ROW BEGIN
	SELECT ALUMNO_SEQ.NEXTVAL INTO:NEW.ID_ALUMNO FROM DUAL;	
END;

CREATE TRIGGER INSERT_AL_TUTO
BEFORE INSERT ON ALUMNOS_TUTORES FOR EACH ROW BEGIN
	SELECT ALUMNO_TUTO_SEQ.NEXTVAL INTO:NEW.ID_REL FROM DUAL;	
END;

INSERT INTO ALUMNO VALUES
(1,'AARON',TO_DATE ('1995/10/19','YYYY-MM-DD'),'MASCULINO','JAFG130698HGRMJ0S2','8O SEMESTRE',1);

INSERT ALL
INTO ALUMNOS_TUTORES (ID_ALUMNO,ID_TUTOR) VALUES (1,2)
INTO ALUMNOS_TUTORES (ID_ALUMNO,ID_TUTOR) VALUES (2,2)
INTO ALUMNOS_TUTORES (ID_ALUMNO,ID_TUTOR) VALUES (3,1)
INTO ALUMNOS_TUTORES (ID_ALUMNO,ID_TUTOR) VALUES (4,3)
INTO ALUMNOS_TUTORES (ID_ALUMNO,ID_TUTOR) VALUES (5,3)
SELECT * FROM DUAL;

SELECT * FROM ALUMNOS_TUTORES;