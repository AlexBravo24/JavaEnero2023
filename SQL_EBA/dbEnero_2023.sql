-- con dos guines podemos poner un comentario

/*podemos poner comentarios de multiples lines 
SQL- Lenguaje de consulta entructurado (Structured Query Language)
es un lenguaje para actualizar, obtener y calcular información en 
bases de datos relacionales.
*/

-- Base de daos - Conjunto organizados entre si, almacenados
-- en tablas 

/* La estructura de las tablas seria de la sigueinte manera 
llave Primaria -- id - todda tabla debe llvar su llave primaria
-Llasve foranea -- pueden llevar llave fonarena, la cual es
una llave primaria que provine de otra tabla
-Tipo de Datos (caracteres o numericos, tipo fecha)

NUMBER - Datos númericos
NVARCHAR2 - permite entrada de datos de caracteres alfanumericos
y también caracteres especiales
DATE - Utilizada para manejo de fecha y hora

--ALUMNO
--MATRICULA O ID
--NOMBRE
--FECHA DE NACIMIENTO
--SEXO
--GRADO
--STATUS DE ACTIVO O INACTIVO
--CURP
*/

--CREANDO TABLA DE ALUMNO
-- La sintaxis puede ir en mayusculas o minusculas
CREATE TABLE alumno( --indicamos el nombre de la tabla
    id_alumno NUMBER PRIMARY KEY NOT NULL,
    nombre NVARCHAR2 (30),
    fechanac DATE,
    sexo NVARCHAR2 (10),
    curp NVARCHAR2(18),
    grado NVARCHAR2(20),
    status NUMBER
);   

-- si quiero ver la estructura de un tabla 
-- se utiliza DESCRIBE y el nombre de la tablas
DESCRIBE alumno;

CREATE TABLE carreras(
    id_carrera NUMBER PRIMARY KEY,
    nombre NVARCHAR2 (30),
    area NVARCHAR2 (30),
    num_semestres NUMBER,
    num_materias NUMBER,
    creditos NUMBER
);

DESCRIBE carreras;

CREATE TABLE carreras_alumnos (
 id_ca NUMBER PRiMARY KEY,
 id_carrera NUMBER,
 id_alumno NUMBER
 );

-- Entidades fuertes 
-- Son aquellas que tienen sus datos completos y no dependen 
--de otra entidad o tabla para existir,

-- Entidades debíles
-- son aquellas que reciben una llave foranea y esto las hace deoendeentes
-- de otras tablas para existir

-- Agregando restricciónes a una tabla
-- las resticciones deben de llevar un nombre y se identifican por el 
-- comando 'CONSTRAINT'

-- En la tabla alumno vamos a agregar una restriccion en el sexo
-- para que solo podamos introducir 'MASCULINO' o 'FEMENINO'

ALTER TABLE alumno ADD CONSTRAINT check_sexo CHECK 
(sexo IN ('MASCULINO' , 'FEMENINO'));

-- para borrar una restriccion
ALTER TABLE alumno DROP CONSTRAINT check_sexo;
DESCRIBE alumno;

-- CREANDO UNA RESTRICCION EN LA TABLA CARRERAS 
-- Para no reperit nombres
ALTER TABLE carreras ADD CONSTRAINT unq_nombre_carrera UNIQUE (nombre);

-- CREANDO UNA LLAVE FORANEA
-- Una llave foranea tambien es una restricicion, porque
-- vamos a especificar de donde proviene dicha llave

ALTER TABLE carreras_alumnos ADD CONSTRAINT fk_id_alumno 
FOREIGN KEY (id_alumno) -- quien recibe (en que columna)
REFERENCES alumno (id_alumno); -- quien da (de que tabla y que columna)

ALTER TABLE carreras_alumnos ADD CONSTRAINT fk_id_carreras 
FOREIGN KEY (id_carrera) -- quien recibe (en que columna)
REFERENCES carreras (id_carrera); -- quien da (de que tabla y que columna)

DESCRIBE alumno;

INSERT INTO alumno VALUES(1, 'AYLIN' , '19/04/95', 'FEMENINO', 'AALI4855448LJP','8 SEMESTRE',1 );
INSERT INTO alumno VALUES(2, 'ALEX' , '08/05/98', 'MASCULINO', 'AALX4884864648LJP','5 SEMESTRE',1 );
INSERT INTO alumno VALUES(3, 'ALEXG' , '25/04/97', 'MASCULINO', 'AAXG4884864648LJP','5 SEMESTRE',1 );
INSERT INTO alumno VALUES(4, 'ABDIEL' , '30/12/97', 'MASCULINO', 'AALX4884864648LJP','5 SEMESTRE',1 );
INSERT INTO alumno VALUES(5, 'MARCOS' , '19/05/96', 'MASCULINO', 'AAXG4884864648LJP','5 SEMESTRE',1 );
INSERT INTO alumno VALUES(6, 'TAVO' , '13/06/98', 'MASCULINO', 'AALX4884864648LJP','5 SEMESTRE',1 );
INSERT INTO alumno VALUES(7, 'EMMANUEL' , '14/06/93', 'MASCULINO', 'AAXG4884864648LJP','5 SEMESTRE',1 );
INSERT INTO alumno VALUES(8, 'EDUARDO' , '1/11/95', 'MASCULINO', 'AALX4884864648LJP','5 SEMESTRE',1 );
INSERT INTO alumno VALUES(9, 'AARON' , '19/10/95', 'MASCULINO', 'AAXG4884864648LJP','5 SEMESTRE',1 );
INSERT INTO alumno VALUES(10, 'CESAR' , '14/02/97', 'MASCULINO', 'AAXG4884864648LJP','5 SEMESTRE',1 );

-- Para eliminar un registro de la tabla alumno filtrado por nombre
DELETE FROM alumno WHERE nombre = 'ACESAR';

-- Para visualizar los datos en la consola 
SELECT * FROM alumno;

INSERT INTO alumno VALUES(11, 'CESAR' ,TO_DATE( '1994-02-19','YYYY-MM-DD'), 'MASCULINO', 'AAXG4884864648LJP','5 SEMESTRE',1 );

DESCRIBE carreras;

--INSERCION DE DATOS EN LA TABLA CARREAS
INSERT INTO carreras VALUES (1,'ING EN SISTEMAS', 'EXACTAS',8,20,300);
INSERT INTO carreras VALUES (2,'MEDICINA','CIENCIAS SALUD',10,20,300);
INSERT INTO carreras VALUES (3,'DERECHO' , 'HUMANIDADES',10,20,300);
INSERT INTO carreras VALUES (4,'BUTRICION','CIENCIAS SALUD',10,20,300);
INSERT INTO carreras VALUES (5,'LIC ADMINISTRACION','ECONOMICO AD',10,20,300);

DELETE FROM carreras WHERE id_carrera = 5;
DELETE FROM carreras WHERE id_carrera = 4;
DELETE FROM carreras WHERE id_carrera = 3;
DELETE FROM carreras WHERE id_carrera = 2;

-- para que los registros se guarden en la base de datos 
COMMIT;

--INSERCION DE DATOS EN LA TABLA RELACIONAL CARRERAS_ALUMNOS

INSERT INTO carreras_alumnos VALUES (1,1,1);
INSERT INTO carreras_alumnos VALUES (2,2,2);
INSERT INTO carreras_alumnos VALUES (3,1,3);
INSERT INTO carreras_alumnos VALUES (4,5,4);
INSERT INTO carreras_alumnos VALUES (5,3,5);

-- AGREGAR UNA COLUMNA A UNA TABLA EXISTENTE
ALTER TABLE carreras ADD presupuesto_anual NUMBER(5,2); --INDICAMOS LA LONGITUD
-- EN LOS CUALES SERIAN 5 DIGITOS, DE LOS CUALES 5 SON DECIMALES
-- TENDRIAMOS VALORES DESDE -999.99 A 999.99

DESCRIBE carreras;

-- MODIFICAR EL TIPO DE DATO DE LA COLUMNA (SIEMPRE Y CUANDO NO TENGA DATOS INSERTADOS)
ALTER TABLE carreras MODIFY presupuesto_anual NVARCHAR2(10);

--RENOMBRAS UNA COLUMNA
ALTER TABLE carreras RENAME COLUMN presupuesto_anual TO presupuesto_mensual;

-- CREANDO TABLA
CREATE TABLE tutores(
    id_tutor NUMBER PRIMARY KEY,
    nombre VARCHAR2(30),
    clave_tutor VARCHAR2(4)
);
-- AGREGANDO RESTRICCION A LA CLAVE_TUTOR 
ALTER TABLE tutores ADD CONSTRAINT check_clave_tutor CHECK (clave_tutor IN('A','B','C','D'));

--INSERTANDO LOS REGISTROS 
INSERT INTO tutores VALUES (1,'JOSE LUIS', 'A');
INSERT INTO tutores VALUES (2,'RAUL', 'B');
INSERT INTO tutores VALUES (3,'AYLIN', 'C');
INSERT INTO tutores VALUES (4,'LAURA', 'D');
INSERT INTO tutores VALUES (5,'JOAQUIN', 'A');
INSERT INTO tutores VALUES (6,'DAVID', 'A');
INSERT INTO tutores VALUES (7,'MARIELA', 'B');
INSERT INTO tutores VALUES (8,'JUAN PABLO', 'C');
INSERT INTO tutores VALUES (9,'GIOVANI', 'D');
INSERT INTO tutores VALUES (10,'MARTHA', 'C');

CREATE TABLE alumnos_tutores(
    id_alumnos_tutores NUMBER PRIMARY KEY,
    id_alumno NUMBER,
    id_tutor NUMBER
);

-- RELACIONANDO LAS TABLAS 
ALTER TABLE alumnos_tutores ADD CONSTRAINT fk_id_alumno_tutor 
FOREIGN KEY (id_alumno) -- quien recibe (en que columna)
REFERENCES alumno (id_alumno); -- quien da (de que tabla y que columna)

ALTER TABLE alumnos_tutores ADD CONSTRAINT fk_id_tutor_alumno
FOREIGN KEY (id_tutor)
REFERENCES tutores (id_tutor);

--AGREGANDO REGISTROS
INSERT INTO alumnos_tutores VALUES (1,1,1);
INSERT INTO alumnos_tutores VALUES (2,5,8);
INSERT INTO alumnos_tutores VALUES (3,10,2);
INSERT INTO alumnos_tutores VALUES (4,2,3);
INSERT INTO alumnos_tutores VALUES (5,6,4);

COMMIT;

--COMO ELIMINAR UNA TABLA CON TODO Y SUS DATOS 
DROP TABLE alumnos_tutores;

-- CREANDO SECUENCIAS
-- se emplea para generar valores de numeros enteros
-- Estos pueden ser consecutivos (incremento de 1)
-- o con incremento de más valores 
-- se utiliza para generear las llaves primarias y asegurarnos 
-- que los valores no se repitan 

-- CREAMDO UNA SECUENCIA DEFINIENDO LOS VALORES
CREATE SEQUENCE alumno_seq --CREAMOS LAS SECUENCIA Y SU NOMBRE
START WITH 11 --EL VALOR EN EL QUE INICIA LA SECUENCIA
INCREMENT BY 1 -- INCREMENTA EL VALOR DE LA SECUENCIA COMO SE LE INDIQUE 
MAXVALUE 999 --INDICAMOS EL VALOR MAXIMO PARA LA SECUENCIA
MINVALUE 1 -- INDICAMOS EL VALOR MINIMO DE LA SECUENCIA 
CYCLE; -- INDICAMOS SI LA SECUENCIA UNA VEZ LLEGADO A SU MAXIMO VALOR 
-- INICIE DE NUEVO
-- SI NO INDICAMOS EL CYCLE, POR DEFAULT LA SECUENCIA CONTINUARÍA

--CREAR UNA SECUENCIA CON LOS VALORES POR DEFECTO
CREATE SEQUENCE alumnos_tutores_seq;

-- TRIGGER (DISIPARADOR) - EJECUTAR UNA ACCIÓN O SESENCADENAR UN EVENTO
CREATE TRIGGER insert_alumnos --CREAMOS EL TRIGGER Y SU NOMBRE
BEFORE INSERT ON alumno FOR EACH ROW BEGIN --DONDE SE EJECUTAL EL TRIGGER
SELECT alumno_seq.NEXTVAL INTO:NEW.id_alumno FROM DUAL; --SELECCIONA EL VALOR DE LA SECUENCIA
END; 

INSERT INTO alumno VALUES(1, 'JULIO' , '19/09/95', 'MASCULINO', 'AALI4855448LJP','8 SEMESTRE',1 );

-- CREAR EL TRIGGER PARA ALUMNOS_TUTORES 
CREATE TRIGGER insert_alumnos_tutores --CREAMOS EL TRIGGER Y SU NOMBRE
BEFORE INSERT ON alumnos_tutores FOR EACH ROW BEGIN --DONDE SE EJECUTAL EL TRIGGER
SELECT alumnos_tutores_seq.NEXTVAL INTO:NEW.id_alumnos_tutores FROM DUAL; --SELECCIONA EL VALOR DE LA SECUENCIA
END;

--FORMA DE INSERCION - INSERCION ,MASIVA
INSERT ALL 
INTO alumnos_tutores (id_alumno, id_tutor) VALUES(1,2)
INTO alumnos_tutores (id_alumno, id_tutor) VALUES(2,2)
INTO alumnos_tutores (id_alumno, id_tutor) VALUES(3,1)
INTO alumnos_tutores (id_alumno, id_tutor) VALUES(4,1)
INTO alumnos_tutores (id_alumno, id_tutor) VALUES(5,3)
SELECT * FROM DUAL;

--CREANDO OTRA INSERCION MASIVA
INSERT ALL 
INTO alumnos_tutores (id_alumno, id_tutor) VALUES(1,2)
INTO alumnos_tutores (id_alumno, id_tutor) VALUES(2,2)
INTO alumnos_tutores (id_alumno, id_tutor) VALUES(3,1)
INTO alumnos_tutores (id_alumno, id_tutor) VALUES(4,1)
INTO alumnos_tutores (id_alumno, id_tutor) VALUES(5,3)
SELECT * FROM DUAL;

commit;


