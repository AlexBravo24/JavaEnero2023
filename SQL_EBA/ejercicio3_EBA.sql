
-- ENTIDADES FUERTES
CREATE TABLE bases(
    id_base NUMBER PRIMARY KEY,
    tipo NVARCHAR2(20)
);

CREATE SEQUENCE bases_seq;
CREATE TRIGGER insert_bases
BEFORE INSERT ON bases FOR EACH ROW BEGIN
SELECT bases_seq.NEXTVAL INTO:NEW.id_base FROM DUAL;
END;

INSERT INTO bases (tipo) VALUES ('MANTENIMIENTO');
INSERT INTO bases (tipo) VALUES ('DESCANSO');

CREATE TABLE vuelo (
    id_vuelo NUMBER PRIMARY KEY,
    origen NVARCHAR2(30),
    destino NVARCHAR2(30),
   horarioviaje DATE    
);

CREATE SEQUENCE vuelo_seq;
CREATE TRIGGER insert_vuelo
BEFORE INSERT ON vuelo FOR EACH ROW BEGIN
SELECT vuelo_seq.NEXTVAL INTO:NEW.id_vuelo FROM DUAL;
END;

INSERT ALL 
INTO vuelo (origen, destino, horarioviaje) 
VALUES ('MEXICO','JAPON', TO_DATE ('20/01/2023 01:30:00', 'DD-MM-YYYY HH24:MI:SS'))
INTO vuelo (origen, destino, horarioviaje) 
VALUES ('CDMX','MEDELLIN', TO_DATE ('20/01/2023 02:30:00', 'DD-MM-YYYY HH24:MI:SS'))
INTO vuelo (origen, destino, horarioviaje) 
VALUES ('CDMX','COSTA RICA', TO_DATE ('20/01/2023 04:30:00', 'DD-MM-YYYY HH24:MI:SS'))
INTO vuelo (origen, destino, horarioviaje) 
VALUES ('MONTERREY','TIJUANA', TO_DATE ('20/01/2023 04:30:00', 'DD-MM-YYYY HH24:MI:SS'))
INTO vuelo (origen, destino, horarioviaje) 
VALUES ('PUEBLA','CANCUN', TO_DATE ('20/01/2023 04:30:00', 'DD-MM-YYYY HH24:MI:SS'))
SELECT * FROM DUAL;

CREATE TABLE listas_clientes (
    id_cliente NUMBER PRIMARY KEY,
    nombre NVARCHAR2(30),
    telefono NVARCHAR2(10),
    direccion NVARCHAR2(30)
);
INSERT ALL 
INTO listas_clientes  (nombre, telefono ,direccion) VALUES( 'JOSE RODRIGUES', '4435487956' ,' XALAPA')
INTO listas_clientes  (nombre, telefono ,direccion) VALUES( 'RAUL LOPEZ', '4435489656' , 'CDMX ')
INTO listas_clientes  (nombre, telefono ,direccion) VALUES( 'AYLIN MORALEZ', '4433587956' , ' LA PAZ')
INTO listas_clientes  (nombre, telefono ,direccion) VALUES( 'ALAN AYALA', '4435484582' , ' MORELIA')
INTO listas_clientes  (nombre, telefono ,direccion) VALUES( 'ROSA YEPEZ', '4435481239' , ' LAS PALMAS ')
SELECT * FROM DUAL;

CREATE SEQUENCE listas_clientes_seq;
CREATE TRIGGER insert_listas_clientes
BEFORE INSERT ON listas_clientes FOR EACH ROW BEGIN
SELECT listas_clientes_seq.NEXTVAL INTO:NEW.id_cliente FROM DUAL;
END;

-- ENTIDADES DEBILES 
CREATE TABLE aviones (
    id_avion NUMBER PRIMARY KEY,
    modelo NVARCHAR2(20),
    id_base NUMBER,
    CONSTRAINT fk_idbase_aviones
    FOREIGN KEY (id_base)
    REFERENCES bases(id_base),
    CONSTRAINT check_base_aviones CHECK (id_base IN (1))
);

CREATE SEQUENCE aviones_seq;
CREATE TRIGGER insert_aviones
BEFORE INSERT ON aviones FOR EACH ROW BEGIN
SELECT aviones_seq.NEXTVAL INTO:NEW.id_avion FROM DUAL;
END;

-- REGISTRO AVIONES
INSERT ALL 
INTO aviones (modelo, id_base) VALUES ('BOEING', 1)
INTO aviones (modelo, id_base) VALUES ('AIRBUS 300', 1)
INTO aviones (modelo, id_base) VALUES ('JET', 1)
INTO aviones (modelo, id_base) VALUES ('AIRBUS A330', 1)
INTO aviones (modelo, id_base) VALUES ('Embraer E-Jet', 1)
SELECT * FROM DUAL;




CREATE TABLE pilotos(
    id_piloto NUMBER PRIMARY KEY,
    nombre NVARCHAR2(30),
    horasviaje NUMBER,
    id_base NUMBER,
    CONSTRAINT fk_idbase_pilotos
    FOREIGN KEY (id_base)
    REFERENCES bases(id_base),
    CONSTRAINT check_base_pilotos CHECK (id_base IN (2))
);

CREATE SEQUENCE pilotos_seq;
CREATE TRIGGER insert_pilotos
BEFORE INSERT ON pilotos FOR EACH ROW BEGIN
SELECT pilotos_seq.NEXTVAL INTO:NEW.id_piloto FROM DUAL;
END;

--INSERTANDO PILOTOS
INSERT ALL 
INTO pilotos  (nombre, horasviaje, id_base) VALUES('ALFREDO', 1000 , 2)
INTO pilotos  (nombre, horasviaje, id_base) VALUES('TAVO', 2000 , 2)
INTO pilotos  (nombre, horasviaje, id_base) VALUES('ALEJANDRO', 1500 , 2)
INTO pilotos  (nombre, horasviaje, id_base) VALUES('CESAR', 800 , 2)
INTO pilotos  (nombre, horasviaje, id_base) VALUES('MARCOS', 500 , 2)
SELECT * FROM DUAL;

CREATE TABLE vuelo_avion_piloto(
    id_vap NUMBER PRIMARY KEY,
    id_vuelo NUMBER,
    id_avion NUMBER,
    id_piloto NUMBER,
    CONSTRAINT fk_vuelo_vap 
    FOREIGN KEY (id_vuelo) 
    REFERENCES vuelo (id_vuelo),
    CONSTRAINT fk_avion_vap 
    FOREIGN KEY (id_avion) 
    REFERENCES aviones (id_avion),
    CONSTRAINT fk_piloto_vap 
    FOREIGN KEY (id_piloto)
    REFERENCES pilotos(id_piloto)
);

CREATE SEQUENCE vap_seq;
CREATE TRIGGER insert_vap
BEFORE INSERT ON vuelo_avion_piloto FOR EACH ROW BEGIN
SELECT vap_seq.NEXTVAL INTO:NEW.id_vap FROM DUAL;
END;

-- REGISTROS VAP
INSERT ALL 
INTO vuelo_avion_piloto  (id_vuelo, id_avion, id_piloto) VALUES(1, 3, 2)
INTO vuelo_avion_piloto  (id_vuelo, id_avion, id_piloto) VALUES(2, 4, 1)
INTO vuelo_avion_piloto  (id_vuelo, id_avion, id_piloto) VALUES(3, 1, 4)
INTO vuelo_avion_piloto  (id_vuelo, id_avion, id_piloto) VALUES(4, 2, 5)
INTO vuelo_avion_piloto  (id_vuelo, id_avion, id_piloto) VALUES(5, 5, 3)
SELECT * FROM DUAL;


CREATE TABLE tripulacion(
    id_tripulacion NUMBER PRIMARY KEY,
    nombre NVARCHAR2(30),
    id_base NUMBER,
    CONSTRAINT fk_idbase_tripulacion
    FOREIGN KEY (id_base)
    REFERENCES bases(id_base),
    CONSTRAINT check_base_tripulaciom CHECK (id_base IN (2))
);

CREATE SEQUENCE tripulacion_seq;
CREATE TRIGGER insert_tripulacion
BEFORE INSERT ON tripulacion FOR EACH ROW BEGIN
SELECT tripulacion_seq.NEXTVAL INTO:NEW.id_tripulacion FROM DUAL;
END;

-- REGISTROS TRIPULACION
INSERT ALL 
INTO tripulacion  (nombre, id_base) VALUES('MARIA',  2)
INTO tripulacion  (nombre, id_base) VALUES('JOSSELIN',  2)
INTO tripulacion  (nombre, id_base) VALUES('CARLOS',  2)
INTO tripulacion  (nombre, id_base) VALUES('JEFFERSON',  2)
INTO tripulacion  (nombre, id_base) VALUES('LAURA',  2)
SELECT * FROM DUAL;


CREATE TABLE vuelo_tripulacion(
    id_vt NUMBER PRIMARY KEY,
    id_vuelo NUMBER,
    id_tripulacion NUMBER,
    CONSTRAINT fk_idvuelo_vt
    FOREIGN KEY (id_vuelo)
    REFERENCES vuelo (id_vuelo),
    CONSTRAINT fk_idtripulacion_vt
    FOREIGN KEY (id_tripulacion)
    REFERENCES tripulacion(id_tripulacion)
);

CREATE SEQUENCE vt_seq;
CREATE TRIGGER insert_vt
BEFORE INSERT ON vuelo_tripulacion FOR EACH ROW BEGIN
SELECT vt_seq.NEXTVAL INTO:NEW.id_vt FROM DUAL;
END;

-- REGISTROS VUELO TRIPULACION
INSERT ALL 
INTO vuelo_tripulacion  (id_vuelo, id_tripulacion) VALUES(1, 2)
INTO vuelo_tripulacion  (id_vuelo, id_tripulacion) VALUES(2, 3)
INTO vuelo_tripulacion  (id_vuelo, id_tripulacion) VALUES(3, 4)
INTO vuelo_tripulacion  (id_vuelo, id_tripulacion) VALUES(4, 5)
INTO vuelo_tripulacion  (id_vuelo, id_tripulacion) VALUES(5, 1)
SELECT * FROM DUAL;

CREATE TABLE boletos(
    id_boleto NUMBER PRIMARY KEY,
    id_vuelo NUMBER,
    id_cliente NUMBER,
    costo NUMBER(6,2),
    CONSTRAINT fk_idvuelo_boletos
    FOREIGN KEY (id_vuelo)
    REFERENCES vuelo(id_vuelo),
    CONSTRAINT fk_idvuelo_cliente
    FOREIGN KEY (id_cliente)
    REFERENCES listas_clientes (id_cliente)
);

CREATE SEQUENCE boletos_seq;
CREATE TRIGGER insert_boletos
BEFORE INSERT ON boletos FOR EACH ROW BEGIN
SELECT boletos_seq.NEXTVAL INTO:NEW.id_boleto FROM DUAL;
END;

-- INSERTANDO BOLETOS
INSERT ALL 
INTO boletos (id_vuelo, id_cliente, costo) VALUES (1, 3, 9999.99)
INTO boletos (id_vuelo, id_cliente, costo) VALUES (2, 4, 8999.99)
INTO boletos (id_vuelo, id_cliente, costo) VALUES (3, 5, 7599.99)
INTO boletos (id_vuelo, id_cliente, costo) VALUES (4, 1, 4999.50)
INTO boletos (id_vuelo, id_cliente, costo) VALUES (5, 2, 5500)
SELECT * FROM DUAL;

SELECT * FROM boletos;

Commit;

SELECT * FROM tripulacion;
INSERT INTO tripulacion  (nombre, id_base) VALUES('EUGENIO',  2);
-- REVERTIR LA INSERCION DE DATOS ANTES DE GUARDARLOS 
-- NOS LLEVA AL ESTADO DEL ULTIMO COMMIT
ROLLBACK;

-- ELIMINAR REGISTROS DE UNA TABLA (UN REGISTRO ESPECIFICO)
-- DEBEMOS ELEGIR UNA COLUMNA O UN DATO COINCIDENTE PARA ELIMINAR DICHA FILA

DELETE FROM tripulacion WHERE nombre='EUGENIO';
SELECT * FROM tripulacion;


--MOSTRAR COLUMNAS ESPECIFICAS DE UNA TABLA 
SELECT nombre, id_base FROM pilotos;
SELECT nombre FROM pilotos;

--LA CONSULTA DE TODOS LOS DATOS SE INDICA CON *
SELECT * FROM tripulacion;

-- RELACIONANDO DATOS CON UNA CONDICION 
SELECT horasviaje, nombre FROM pilotos WHERE horasviaje > 400;

-- RELACIONANDO DATOS CONCATENANDOLOS CON AND 
SELECT horasviaje, nombre FROM pilotos WHERE horasviaje >= 1500 AND id_base=2;

-- UTILIZAMOS BETWEEN PARA BUSCAR RANGOS DE UN VALOR
SELECT * FROM pilotos WHERE horasviaje BETWEEN 400 AND 900;

-- BUSCAR VALORES SIMILARES 
-- VALORS QUE EMPIECEN CON A
SELECT * FROM pilotos WHERE nombre LIKE 'A%';
-- QUE TERMINEN CON O
SELECT * FROM pilotos WHERE nombre LIKE '%O';

-- FUNCIONES DE AGREGACION
SELECT MAX (horasviaje) FROM pilotos;
SELECT MIN (horasviaje) FROM pilotos;

-- BUSCAR AL PILOTO CON M�S HORAS DE VIAJE
SELECT * FROM pilotos WHERE horasviaje = (SELECT MAX (horasviaje) FROM pilotos);



--ESTABLECER UNA COLUMNA CON VALORES NULOS
UPDATE pilotos SET horasviaje = NULL;


ROLLBACK;
SELECT * FROM pilotos;

-- REALIZAR UN CONTEO DE FILAS PARA DETERMINADOS DATOS
SELECT COUNT (id_piloto) FROM pilotos WHERE horasviaje < 950;

COMMIT;

--OBTENER EL PROMDEDIO DE LOS VALORS DE UNA COLIMNA (HORASVIAJE)
SELECT AVG (horasviaje) FROM pilotos;

-- SUMAORIA DE VALORES 
SELECT SUM (horasviaje) FROM pilotos;

-- FUNCIONES GRUB BY 
--MOSTRAR CUANTOS ALUMNOS HAY POR CADA GENERO
SELECT COUNT (id_alumno) , sexo FROM alumno GROUP BY sexo; 

-- ORDENARLOS CON EL COMANDO DESC PARA PONER LOS DATOS DE FORMA DECENDENTE
SELECT * FROM alumno ORDER BY nombre DESC;

-- ORDENARLOS CON EL COMANDO ASC PARA PONER LOS DATOS DE FORMA ACENDENTE
SELECT * FROM alumno ORDER BY nombre ASC;

COMMIT;

--BUSCANDO LOS DATOS DE LA TRIPULACION EN EL VUELO DONDE EL CLIENTE HAYA SIDO = 'NOMBRE'

SELECT * FROM tripulacion WHERE id_tripulacion = (
SELECT id_vt FROM vuelo_tripulacion WHERE id_vuelo = (
SELECT id_vuelo FROM boletos WHERE id_cliente = (
SELECT id_cliente FROM listas_clientes WHERE nombre = 'ALAN AYALA' )));


-- Buscar Id del avion, modelo y destino del vuelo, del piloto con mas horas de vuelo.

SELECT AVIONES.ID_AVION, AVIONES.MODELO,VUELO.DESTINO FROM PILOTOS
INNER JOIN VUELO_AVION_PILOTO
ON PILOTOS.ID_PILOTO=VUELO_AVION_PILOTO.ID_PILOTO
INNER JOIN VUELO
ON VUELO.ID_VUELO=VUELO_AVION_PILOTO.ID_VUELO
INNER JOIN AVIONES
ON AVIONES.ID_AVION=VUELO_AVION_PILOTO.ID_AVION
WHERE HORASVIAJE = (SELECT MAX(HORASVIAJE) FROM PILOTOS);



SELECT V.ORIGEN, TO_CHAR (V.HORARIO_VIAJE, 'HH24:MI:SS') AS HORA, P.NOMBRE, A.MODELO
FROM VUELO V
INNER JOIN VUELO_AVION_PILOTO VAP
ON V.ID_VUELO = VAP.ID_VUELO
INNER JOIN PILOTOS P
INNER JOIN AVIONES A 
ON A.ID_AVION = VAP.ID_AVION;_

describe listas_clientes;
