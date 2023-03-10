-------------------------------------------------------------------------------------
------ EJERCICIO 1 DESPACHO
-------------------------------------------------------------------------------------

CREATE TABLE Cliente(
Id NUMBER PRIMARY KEY,
Nombre NVARCHAR2 (30),  
Curp NVARCHAR2 (18), 
Dir NVARCHAR2 (30));

CREATE TABLE Abogado(
Id NUMBER PRIMARY KEY,
Nombre NVARCHAR2 (30),  
Curp NVARCHAR2 (18), 
Dir NVARCHAR2 (30));

CREATE TABLE Status(
Id NUMBER PRIMARY KEY,
Nom_Status NVARCHAR2(30));
INSERT INTO Status VALUES (1,'En trámite');
INSERT INTO Status VALUES (2,'Archivado');

CREATE TABLE Expediente(
Id NUMBER PRIMARY KEY,
No_Exp NUMBER,
F_Inicio DATE,--Si quieres forzar una fecha inicio siempre NOT NULL;
F_Fin DATE,
Id_Status NUMBER,
CONSTRAINT Chk_No_Exp UNIQUE (No_Exp),
CONSTRAINT Chk_Status CHECK (Id_Status IN (1,2)),
CONSTRAINT FK_Exp_Status FOREIGN KEY (Id_Status) REFERENCES Status (Id));
---------Nombre de la fk----------- id destino -- id origen (tabla y columna)
-- Si quieres forzar una fecha inicio siempre mod despues: ALTER TABLE TB.EXPEDIENTE MODIFY F_INICIO DATE NOT NULL;

CREATE TABLE Asunto(
Id NUMBER PRIMARY KEY,
Id_Exp NUMBER,   
Id_Cliente NUMBER,
CONSTRAINT Chk_1Exp_1Asunto UNIQUE (Id_Exp),
CONSTRAINT FK_Asunto_Exp FOREIGN KEY (Id_Exp) REFERENCES Expediente (Id),
CONSTRAINT FK_Asunto_Cliente FOREIGN KEY (Id_Cliente) REFERENCES Cliente (Id));
---------Nombre de la fk----------- id destino -- id origen (tabla y columna)


CREATE TABLE Rel_Asunto(
Id NUMBER PRIMARY KEY,
Id_Asunto NUMBER,  
Id_Abogado NUMBER,
CONSTRAINT FK_Rel_Asunto_Asunto FOREIGN KEY (Id_Asunto) REFERENCES Asunto (Id),
CONSTRAINT FK_Rel_Asunto_Abogado FOREIGN KEY (Id_Abogado) REFERENCES Abogado (Id));
---------Nombre de la fk----------- id destino -- id origen (tabla y columna)

CREATE SEQUENCE Cliente_Seq;
CREATE SEQUENCE Abogado_Seq;
CREATE SEQUENCE Exp_Seq;
CREATE SEQUENCE Asunto_Seq;
CREATE SEQUENCE Rel_Asunto_Seq;

CREATE TRIGGER Auto_Id_Cliente
BEFORE INSERT ON Cliente FOR EACH ROW BEGIN
	SELECT Cliente_Seq.NEXTVAL INTO:NEW.Id FROM DUAL;	
END;
CREATE TRIGGER Auto_Id_Abogado
BEFORE INSERT ON Abogado FOR EACH ROW BEGIN
	SELECT Abogado_Seq.NEXTVAL INTO:NEW.Id FROM DUAL;	
END;
CREATE TRIGGER Auto_Id_Exp
BEFORE INSERT ON Expediente FOR EACH ROW BEGIN
	SELECT Exp_Seq.NEXTVAL INTO:NEW.Id FROM DUAL;	
END;
CREATE TRIGGER Auto_Id_Asunto
BEFORE INSERT ON Asunto FOR EACH ROW BEGIN
	SELECT Asunto_Seq.NEXTVAL INTO:NEW.Id FROM DUAL;	
END;
CREATE TRIGGER Auto_Id_Rel_Asunto
BEFORE INSERT ON Rel_Asunto FOR EACH ROW BEGIN
	SELECT Rel_Asunto_Seq.NEXTVAL INTO:NEW.Id FROM DUAL;	
END;

INSERT ALL--Clientes
INTO Cliente VALUES (1,'Hernan Quintillo','QUIENTO123KJF41','Calle Niños Heroes #12')
INTO Cliente VALUES (1,'Joaquin Guerrero','QUIENTO123KJF41','Calle Ferrocarril #2')
INTO Cliente VALUES (1,'Brenda Cruz','QUIENTO123KJF41','Calle Hermosillo #5')
INTO Cliente VALUES (1,'Victor Hugo','QUIENTO123KJF41','Salomitas #1')
INTO Cliente VALUES (1,'Javier Cruz','QUIENTO123KJF41','Calle Benito Juarez #33')
SELECT * FROM DUAL;

INSERT ALL--Abogados
INTO Abogado VALUES (1,'Julio Felix','COOKLASKEM22939','Vista Alegre #2')
INTO Abogado VALUES (1,'Paola Figeroa','COOKLASKEM22939','Hungaros #1')
INTO Abogado VALUES (1,'Raul Morilla','COOKLASKEM22939','Guerrero #44')
INTO Abogado VALUES (1,'Jimena Morilla','COOKLASKEM22939','Guerrero #44')
INTO Abogado VALUES (1,'Karla Vinai','COOKLASKEM22939','Barraroja #16')
SELECT * FROM DUAL;

INSERT ALL--ExpedientesSecretosX
INTO Expediente VALUES (1,19228,'15/01/2023',null,1)
INTO Expediente VALUES (1,76228,'13/02/2013','24/06/2013',2)
INTO Expediente VALUES (1,55228,'15/03/2019',null,1)
INTO Expediente VALUES (1,02554,'05/05/2021',null,1)
INTO Expediente VALUES (1,15448,'19/12/2001','06/06/2004',2)
SELECT * FROM DUAL;

INSERT ALL--Asunto
INTO Asunto VALUES (1,1,2)
INTO Asunto VALUES (1,2,2)
INTO Asunto VALUES (1,3,4)
INTO Asunto VALUES (1,4,3)
INTO Asunto VALUES (1,5,1)
SELECT * FROM DUAL;

INSERT ALL--Rel_Asunto
INTO Rel_Asunto VALUES (1,1,3)
INTO Rel_Asunto VALUES (1,1,5)
INTO Rel_Asunto VALUES (1,2,1)
INTO Rel_Asunto VALUES (1,5,2)
INTO Rel_Asunto VALUES (1,4,4)
SELECT * FROM DUAL;

----------------------------------------------------------------------------------------------------------------------------
----------------- Ejercicio 2 Yo no soy marinero soy capitan soy capitan
----------------------------------------------------------------------------------------------------------------------------

CREATE TABLE Patron(
Id NUMBER PRIMARY KEY,
Nombre NVARCHAR2 (30),  
Curp NVARCHAR2 (18), 
Dir NVARCHAR2 (30),
Status_Socio NUMBER(1),
CONSTRAINT Chk_Status_Socio CHECK (Status_Socio IN (0,1)));

CREATE TABLE Barco(
Id NUMBER PRIMARY KEY,
Nombre NVARCHAR2 (30), 
No_Mat NVARCHAR2 (30),
No_Amarre NVARCHAR2 (30),
Couta NUMBER,
Id_Patron NUMBER,
CONSTRAINT Chk_No_Mat UNIQUE (No_Mat),
CONSTRAINT Chk_No_Amarre UNIQUE (No_Amarre),
CONSTRAINT FK_Barco_Patron FOREIGN KEY (Id_Patron) REFERENCES Patron (Id));

CREATE TABLE Reg_Salida(
Id NUMBER PRIMARY KEY,
Fecha DATE, 
Destino NVARCHAR2 (30),
Id_Patron NUMBER,
Id_Barco NUMBER,
CONSTRAINT FK_Salida_Patron FOREIGN KEY (Id_Patron) REFERENCES Patron (Id),
CONSTRAINT FK_Salida_Barco FOREIGN KEY (Id_Barco) REFERENCES Barco (Id));

CREATE SEQUENCE Patron_Seq;
CREATE SEQUENCE Barco_Seq;
CREATE SEQUENCE Salida_Seq;

CREATE TRIGGER Auto_Id_Patron
BEFORE INSERT ON Patron FOR EACH ROW BEGIN
	SELECT Patron_Seq.NEXTVAL INTO:NEW.Id FROM DUAL;
END;
CREATE TRIGGER Auto_Id_Barco
BEFORE INSERT ON Barco FOR EACH ROW BEGIN
	SELECT Barco_Seq.NEXTVAL INTO:NEW.Id FROM DUAL;
END;
CREATE TRIGGER Auto_Id_Salida
BEFORE INSERT ON Reg_Salida FOR EACH ROW BEGIN
	SELECT Salida_Seq.NEXTVAL INTO:NEW.Id FROM DUAL;
END;

INSERT ALL--Patron
INTO Patron VALUES (1,'Hernan Quintillo','QUIENTO123KJF41','Calle Niños Heroes #12',1)
INTO Patron VALUES (1,'Paola Figeroa','COOKLASKEM22939','Hungaros #1',1)
INTO Patron VALUES (1,'Raul Morilla','COOKLASKEM22939','Guerrero #44',0)
INTO Patron VALUES (1,'Brenda Cruz','QUIENTO123KJF41','Calle Hermosillo #5',0)
INTO Patron VALUES (1,'Jimena Morilla','COOKLASKEM22939','Guerrero #44',1)
SELECT * FROM DUAL;

INSERT ALL--Barco
INTO Barco VALUES (1,'Queen Anne´s Revenge','SOLO12991','A1_203',87000,1)
INTO Barco VALUES (1,'USS Constitution','V0OA12991','A2_101',65000,2)
INTO Barco VALUES (1,'Shadow of Intent','LIUA129847','A1_180',79000,5)
INTO Barco VALUES (1,'Foward unto Dawn','KIAOJ12342','A3_403',92000,2)
INTO Barco VALUES (1,'USS Enterprise','TOAK10293','A2_604',66000,1)
SELECT * FROM DUAL;

INSERT ALL--Salida
INTO Reg_Salida VALUES (1,TIMESTAMP '2019-01-30 09:40:10.00','Tangamandapio',3,3)
INTO Reg_Salida VALUES (1,TIMESTAMP '2019-04-05 16:55:40.00','Cancun',2,4)
INTO Reg_Salida VALUES (1,TIMESTAMP '2019-06-06 09:40:10.00','Playa Ventura',1,1)
INTO Reg_Salida VALUES (1,TIMESTAMP '2019-06-28 22:10:22.00','California usa',2,4)
INTO Reg_Salida VALUES (1,TIMESTAMP '2019-08-01 03:59:33.00','Tangamandapio',3,3)
SELECT * FROM DUAL;

SELECT * FROM REG_SALIDA;

-- MOSTRAR FORMATO COMPLETO 
SELECT Id,Destino,TO_CHAR(Fecha,'dd-mm-yy hh24:mi:ss') FROM REG_SALIDA;

----------------------------------------------------------------------------------------------------------------------------
----------------- BD AVIACION
----------------------------------------------------------------------------------------------------------------------------
GRANT CREATE SESSION TO DB_AVIONES_TB;--DAR DE ALTA SESION USUARIO*
commit;

--FUERTES--

CREATE TABLE BASES(
ID NUMBER PRIMARY KEY,
TIPO NVARCHAR2(20));

CREATE TABLE VUELO(
ID_VUELO NUMBER PRIMARY KEY,
ORIGEN NVARCHAR2(30),
DESTINO NVARCHAR2(30),
HORARIOVIAJE DATE);

CREATE TABLE LISTAS_CLIENTES(
ID_CLIENTE NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(30),
TELEFONO NVARCHAR2(10),
DIRECCION NVARCHAR2(30));

--DEBILES--

CREATE TABLE AVIONES(
ID_AVION NUMBER PRIMARY KEY,
MODELO NVARCHAR2(20),
ID_BASE NUMBER,
CONSTRAINT FK_IDBASE_AVIONES FOREIGN KEY (ID_BASE) REFERENCES BASES (ID_BASE),
CONSTRAINT CHECK_BASE_AVIONES CHECK (ID_BASE IN (1)));

CREATE TABLE PILOTOS(
ID_PILOTO NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(30),
HORASVIAJE NUMBER, ID_BASE NUMBER,
CONSTRAINT FK_IDBASE_PILOTOS FOREIGN KEY (ID_BASE) REFERENCES BASES (ID_BASE),
CONSTRAINT CHECK_BASE_PILOTOS CHECK (ID_BASE IN (2)));

CREATE TABLE VUELO_AVION_PILOTO(
ID_VAP NUMBER PRIMARY KEY,
ID_VUELO NUMBER,
ID_AVION NUMBER,
ID_PILOTO NUMBER,
CONSTRAINT FK_IDVUELO_VAP FOREIGN KEY (ID_VUELO) REFERENCES VUELO (ID_VUELO),
CONSTRAINT FK_IDAVION_VAP FOREIGN KEY (ID_AVION) REFERENCES AVIONES (ID_AVION),
CONSTRAINT FK_IDPILOTO_VAP FOREIGN KEY (ID_PILOTO) REFERENCES PILOTOS (ID_PILOTO));

CREATE TABLE TRIPULACION(
ID_TRIPULACION NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(30), ID_BASE NUMBER,
CONSTRAINT FK_IDBASE_TRIPULACION FOREIGN KEY (ID_BASE) REFERENCES BASES (ID_BASE),
CONSTRAINT CHECK_BASE_TRIPULACION CHECK (ID_BASE IN (2)));

CREATE TABLE VUELO_TRIPULACION(
ID_VT NUMBER PRIMARY KEY,
ID_VUELO NUMBER, ID_TRIPULACION NUMBER,
CONSTRAINT FK_IDVUELO_VT FOREIGN KEY (ID_VUELO) REFERENCES VUELO (ID_VUELO),
CONSTRAINT FK_IDTRIPULACION_VT FOREIGN KEY (ID_TRIPULACION) REFERENCES TRIPULACION (ID_TRIPULACION)); 

CREATE TABLE BOLETOS(
ID_BOLETO NUMBER PRIMARY KEY,
ID_VUELO NUMBER,
ID_CLIENTE NUMBER,
COSTO NUMBER (6,2),
CONSTRAINT FK_IDVUELO_BOLETOS FOREIGN KEY (ID_VUELO) REFERENCES VUELO (ID_VUELO),
CONSTRAINT FK_IDCLIENTE_BOLETOS FOREIGN KEY (ID_CLIENTE) REFERENCES LISTAS_CLIENTES (ID_CLIENTE));

CREATE SEQUENCE BASES_SEQ;
CREATE SEQUENCE VUELO_SEQ;
CREATE SEQUENCE LISTAS_CLIENTES_SEQ;
CREATE SEQUENCE AVIONES_SEQ;
CREATE SEQUENCE PILOTOS_SEQ;
CREATE SEQUENCE VAP_SEQ;
CREATE SEQUENCE TRIPULACION_SEQ;
CREATE SEQUENCE VT_SEQ;
CREATE SEQUENCE BOLETOS_SEQ;


CREATE TRIGGER INSERT_BASES 
BEFORE INSERT ON BASES FOR EACH ROW BEGIN 
	SELECT BASES_SEQ.NEXTVAL INTO:NEW.ID_BASE FROM DUAL; 
END;

CREATE TRIGGER INSERT_VUELO 
BEFORE INSERT ON VUELO FOR EACH ROW BEGIN 
	SELECT VUELO_SEQ.NEXTVAL INTO:NEW.ID_VUELO FROM DUAL; 
END;

CREATE TRIGGER INSERT_LISTAS_CLIENTES 
BEFORE INSERT ON LISTAS_CLIENTES FOR EACH ROW BEGIN 
	SELECT LISTAS_CLIENTES_SEQ.NEXTVAL INTO:NEW.ID_CLIENTE FROM DUAL; 
END;

CREATE TRIGGER INSERT_AVIONES 
BEFORE INSERT ON AVIONES FOR EACH ROW BEGIN 
	SELECT AVIONES_SEQ.NEXTVAL INTO:NEW.ID_AVION FROM DUAL; 
END; 

CREATE TRIGGER INSERT_PILOTOS 
BEFORE INSERT ON PILOTOS FOR EACH ROW BEGIN
	SELECT PILOTOS_SEQ.NEXTVAL INTO:NEW.ID_PILOTO FROM DUAL;
END;

CREATE TRIGGER INSERT_INSERT_VAP 
BEFORE INSERT ON VUELO_AVION_PILOTO FOR EACH ROW BEGIN 
	SELECT VAP_SEQ.NEXTVAL INTO:NEW.ID_VAP FROM DUAL; 
END;

CREATE TRIGGER INSERT_TRIPULACION 
BEFORE INSERT ON TRIPULACION FOR EACH ROW BEGIN 
SELECT TRIPULACION_SEQ.NEXTVAL INTO:NEW.ID_TRIPULACION FROM DUAL;
END;

CREATE TRIGGER INSERT_VT
BEFORE INSERT ON VUELO_TRIPULACION FOR EACH ROW BEGIN
SELECT VT_SEQ.NEXTVAL INTO:NEW.ID_VT FROM DUAL;
END;

CREATE TRIGGER INSERT_BOLETOS 
BEFORE INSERT ON BOLETOS FOR EACH ROW BEGIN 
SELECT BOLETOS_SEQ.NEXTVAL INTO:NEW.ID_BOLETO FROM DUAL; 
END; 

INSERT INTO BASES (TIPO) VALUES ('MANTENIMIENTO');
INSERT INTO BASES (TIPO) VALUES ('DESCANSO');

INSERT ALL
INTO VUELO (ORIGEN,DESTINO,HORARIOVIAJE) VALUES ('MEXICO','JAPON',TIMESTAMP '2023-01-20 01:30:00')
INTO VUELO (ORIGEN,DESTINO,HORARIOVIAJE) VALUES ('CDMX','MEDELLIN',TIMESTAMP '2023-01-21 02:30:00')
INTO VUELO (ORIGEN,DESTINO,HORARIOVIAJE) VALUES ('CDMX','COSTA RICA',TIMESTAMP '2023-01-22 04:30:00')
INTO VUELO (ORIGEN,DESTINO,HORARIOVIAJE) VALUES ('MONTERREY','TIJUANA',TIMESTAMP '2023-01-23 05:30:00')
INTO VUELO (ORIGEN,DESTINO,HORARIOVIAJE) VALUES ('PUEBLA','CANCUN',TIMESTAMP '2023-01-24 06:30:00')
SELECT * FROM DUAL;

INSERT ALL
INTO LISTAS_CLIENTES (NOMBRE, DIRECCION, TELEFONO) VALUES ('AYLIN','XALAPA','2282330908')
INTO LISTAS_CLIENTES (NOMBRE, DIRECCION, TELEFONO) VALUES ('ALEX','XALAPA','2281072635')
INTO LISTAS_CLIENTES (NOMBRE, DIRECCION, TELEFONO) VALUES ('ALEJANDRO','CDMX','3023079497')
INTO LISTAS_CLIENTES (NOMBRE, DIRECCION, TELEFONO) VALUES ('EMMANUEL','CDMX','1563034510')
INTO LISTAS_CLIENTES (NOMBRE, DIRECCION, TELEFONO) VALUES ('EDUARDO','MORELIA','4438443145')
SELECT * FROM DUAL;

INSERT ALL
INTO AVIONES (MODELO,ID_BASE) VALUES ('BOEING',1)
INTO AVIONES (MODELO,ID_BASE) VALUES ('AIRBUS 300',1)
INTO AVIONES (MODELO,ID_BASE) VALUES ('JET1',1)
INTO AVIONES (MODELO,ID_BASE) VALUES ('VOLVO',1)
INTO AVIONES (MODELO,ID_BASE) VALUES ('Embracer E-Jet',1)
SELECT * FROM DUAL; 

INSERT ALL
INTO PILOTOS (NOMBRE,HORASVIAJE,ID_BASE) VALUES ('HUGO',300,2)
INTO PILOTOS (NOMBRE,HORASVIAJE,ID_BASE) VALUES ('PACO',600,2)
INTO PILOTOS (NOMBRE,HORASVIAJE,ID_BASE) VALUES ('LUIS',400,2)
INTO PILOTOS (NOMBRE,HORASVIAJE,ID_BASE) VALUES ('PEDRO',850,2)
INTO PILOTOS (NOMBRE,HORASVIAJE,ID_BASE) VALUES ('JAYRO',330,2)
SELECT * FROM DUAL; 

INSERT ALL
INTO VUELO_AVION_PILOTO (ID_VUELO,ID_AVION,ID_PILOTO) VALUES (1,3,2)
INTO VUELO_AVION_PILOTO (ID_VUELO,ID_AVION,ID_PILOTO) VALUES (2,4,1)
INTO VUELO_AVION_PILOTO (ID_VUELO,ID_AVION,ID_PILOTO) VALUES (3,1,4)
INTO VUELO_AVION_PILOTO (ID_VUELO,ID_AVION,ID_PILOTO) VALUES (3,1,4)
INTO VUELO_AVION_PILOTO (ID_VUELO,ID_AVION,ID_PILOTO) VALUES (4,2,5)
INTO VUELO_AVION_PILOTO (ID_VUELO,ID_AVION,ID_PILOTO) VALUES (5,5,3)
SELECT * FROM DUAL;

INSERT ALL
INTO TRIPULACION (NOMBRE, ID_BASE)VALUES ('ABDIEL',2)
INTO TRIPULACION (NOMBRE, ID_BASE)VALUES ('MARCOS',2)
INTO TRIPULACION (NOMBRE, ID_BASE)VALUES ('TAVO',2)
INTO TRIPULACION (NOMBRE, ID_BASE)VALUES ('AARON',2)
INTO TRIPULACION (NOMBRE, ID_BASE)VALUES ('CESAR',2)
SELECT * FROM DUAL; 

INSERT ALL
INTO VUELO_TRIPULACION (ID_VUELO,ID_TRIPULACION) VALUES (1,2)
INTO VUELO_TRIPULACION (ID_VUELO,ID_TRIPULACION) VALUES (2,3)
INTO VUELO_TRIPULACION (ID_VUELO,ID_TRIPULACION) VALUES (3,4)
INTO VUELO_TRIPULACION (ID_VUELO,ID_TRIPULACION) VALUES (4,5)
INTO VUELO_TRIPULACION (ID_VUELO,ID_TRIPULACION) VALUES (5,1)
SELECT * FROM DUAL;

INSERT ALL
INTO BOLETOS (ID_VUELO,ID_CLIENTE,COSTO) VALUES (1,3,9999.99)
INTO BOLETOS (ID_VUELO,ID_CLIENTE,COSTO) VALUES (2,4,8999.99)
INTO BOLETOS (ID_VUELO,ID_CLIENTE,COSTO) VALUES (3,5,7599.99)
INTO BOLETOS (ID_VUELO,ID_CLIENTE,COSTO) VALUES (4,1,4999.50)
INTO BOLETOS (ID_VUELO,ID_CLIENTE,COSTO) VALUES (5,2,5500)
SELECT * FROM DUAL;


--MOSTRAR TODO DE UNA TABLA
SELECT * FROM PILOTOS;

-- RELACIONANDO DATOS CON UNA CONDICION
SELECT HORASVIAJE,NOMBRE FROM PILOTOS WHERE HORASVIAJE>400;

-- RELACIONANDO DATOS CONCATENANDOLOS CON 'AND'
SELECT HORASVIAJE,NOMBRE,ID_BASE FROM PILOTOS WHERE HORASVIAJE>300 AND ID_BASE=3;

--UTILIZAMOS BETWEEN PARA BUSCAR RANGOS DE UN VALOR
SELECT * FROM PILOTOS WHERE HORASVIAJE BETWEEN 400 AND 900;
;
--BUSCAR VALORES SIMILARES                                 
SELECT * FROM PILOTOS WHERE NOMBRE LIKE 'P%';
SELECT * FROM PILOTOS WHERE NOMBRE LIKE '%O';

--FUNCIONES DE AGREGACI6N 
SELECT MAX(HORASVIAJE) FROM PILOTOS; 
SELECT MIN(HORASVIAJE) FROM PILOTOS; 
--BUSCAR Al PILOTO CON MAS HORAS DE VIAJE 
SELECT * FROM PILOTOS WHERE HORASVIAJE = (SELECT MAX(HORASVIAJE) FROM PILOTOS);

--ESTABLECER COLUMNA CON VALORES NULL
UPDATE PILOTOS SET HORASVIAJE=NULL; --ACTUALIZAR VALORES A NULL
SELECT * FROM PILOTOS; --MOSTRAR SI SE ACUTALIZO
ROLLBACK; --PODEMOS REGRESAR AL ESTADO DEL ULTIMO COMMIT CON ROLLBACK

--REALIZAR CONTEO DE FILAS CON CONDICION
SELECT COUNT (ID_PILOTO) FROM PILOTOS WHERE HORASVIAJE<400;

--OBTENER EL PROMEDIO DE LOS VALORES DE UNA COLUMNA
SELECT AVG (HORASVIAJE) FROM PILOTOS;

--OBTENER SUMA TOTAL DE VALORES DE COLUMNA
SELECT SUM (HORASVIAJE) FROM PILOTOS;

--FUNCIONES GROUP BY MOSTRAR CUANTOS ALUMNOS HAY POR CADA GENERO 
SELECT COUNT (ID ALUMNO), SEXO FROM ALUMNO GROUP BY SEXO; 

-- ORDENARLOS CON EL COMANDO DESC PARA PONER EN ORDEN DESCENDENTE 
SELECT * FROM ALUMNO ORDER BY NOMBRE DESC; 
-- ORDENARLOS CON EL COMANDO ASC PARAIPONER EN ORDEN ASCENDENTE
SELECT * FROM ALUMNO ORDER BY NOMBRE ASC; 

SELECT ID_TRIPULACION,NOMBRE,(SELECT BASES.TIPO FROM BASES WHERE ID_BASE=TRIPULACION.ID_BASE)  
FROM TRIPULACION WHERE ID_TRIPULACION IN -- Buscar los datos de la tripulacion
(SELECT ID_TRIPULACION FROM VUELO_TRIPULACION WHERE ID_VUELO IN -- Identificar al tripulante que estuvo en el vuelo
(SELECT ID_VUELO FROM BOLETOS WHERE ID_CLIENTE IN -- Identificar el vuelo del cliente
(SELECT ID_CLIENTE FROM LISTAS_CLIENTES WHERE NOMBRE='AYLIN'))); -- Identificamos al cliente


SELECT * FROM PILOTOS
RIGHT JOIN BASES
ON PILOTOS.ID_BASE=BASES.ID_BASE;

SELECT * FROM BASES
left JOIN PILOTOS 
ON PILOTOS.ID_BASE=BASES.ID_BASE ORDER BY BASES.ID_BASE asc;

--Identificar las tablas con alias 
SELECT * FROM LISTAS_CLIENTES C --Identificandola con un alias C 
INNER JOIN BOLETOS B --Identificando con un alias B 
ON C.ID_CLIENTE = B.ID_CLIENTE;

SELECT A.ID_TRIPULACION,A.NOMBRE,B.TIPO  FROM TRIPULACION A
INNER JOIN BASES B
ON A.ID_BASE = B.ID_BASE
INNER JOIN VUELO_TRIPULACION C
ON A.ID_TRIPULACION = C.ID_TRIPULACION 
INNER JOIN BOLETOS D
ON C.ID_VUELO =D.ID_VUELO
INNER JOIN LISTAS_CLIENTES E
ON D.ID_CLIENTE = E.ID_CLIENTE WHERE E.NOMBRE='AYLIN';

SELECT A.ID_AVION ,A.MODELO, C.DESTINO FROM AVIONES A
INNER JOIN VUELO_AVION_PILOTO B
ON A.ID_AVION = B.ID_AVION 
INNER JOIN VUELO C
ON B.ID_VUELO = C.ID_VUELO
INNER JOIN PILOTOS D
ON B.ID_PILOTO = D.ID_PILOTO WHERE D.HORASVIAJE=(SELECT MAX(HORASVIAJE) FROM PILOTOS);








