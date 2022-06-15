-- DROP DATABASE ProyectoEquipo1g1;
CREATE DATABASE ProyectoEquipo1g1;
GO

USE ProyectoEquipo1g1;
GO

-- PRIMERO CREAMOS LAS TABLAS QUE NO TIENEN FK:

CREATE TABLE clientes(
    id int primary key NOT NULL auto_increment,
    nombre varchar(128) NOT NULL,
    telefono varchar(128) NOT NULL,
    correo varchar(128) NOT NULL
);

CREATE TABLE empleados(
    id int primary key NOT NULL auto_increment,
    nombre varchar(64) NOT NULL,
    apellido varchar(64) NOT NULL
);

CREATE TABLE servicios(
    id int primary key NOT NULL auto_increment,
    nombre_servicio varchar(128) NOT NULL,
    duracion int NOT NULL
);

-- LUEGO EMPEZAMOS CON LAS TABLAS QUE TIENEN CLAVES FORANEAS

-- CREANDO TABLA calendarios
CREATE TABLE calendarios(
    id int primary key NOT NULL auto_increment,
    empleado_id int NOT NULL,
    desde timestamp,
    hasta timestamp
);
-- AGREGANDO FK
ALTER TABLE calendarios
ADD CONSTRAINT FK_empleados_id -- nombre de la relación
FOREIGN KEY (empleado_id) REFERENCES empleados(id);

-- CREANDO TABLA servicios_agendados
CREATE TABLE servicios_agendados(
    id int primary key NOT NULL auto_increment,
    calendario_id int NOT NULL,
    servicio_id int NOT NULL    
);
-- AGREGANDO FK
ALTER TABLE servicios_agendados
ADD CONSTRAINT FK_calendarios_agendados_id
FOREIGN KEY (calendario_id) REFERENCES calendarios(id);

ALTER TABLE servicios_agendados
ADD CONSTRAINT FK_servicios_agendados_id
FOREIGN KEY (servicio_id) REFERENCES servicios(id);

-- CREANDO TABLA servicios_ofrecidos
CREATE TABLE servicios_ofrecidos(
    id int primary key NOT NULL auto_increment,
    calendario_id int NOT NULL,
    servicio_id int NOT NULL    
);

-- AGREGANDO FK
ALTER TABLE servicios_ofrecidos
ADD CONSTRAINT FK_calendarios_ofrecidos_id
FOREIGN KEY (calendario_id) REFERENCES calendarios(id);

ALTER TABLE servicios_ofrecidos
ADD CONSTRAINT FK_servicios_ofrecidos_id
FOREIGN KEY (servicio_id) REFERENCES servicios(id);