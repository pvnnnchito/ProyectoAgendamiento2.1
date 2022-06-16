-- DROP DATABASE ProyectoEquipo1g1;
CREATE DATABASE ProyectoEquipo1g1;
GO

USE ProyectoEquipo1g1;
GO

-- PRIMERO CREAMOS LAS TABLAS QUE NO TIENEN FK:

-- CREANDO TABLA clientes
CREATE TABLE clientes(
    id int primary key NOT NULL auto_increment,
    nombre varchar(128) NOT NULL,
    telefono varchar(128) NOT NULL,
    correo varchar(128) NOT NULL
);

-- CREANDO TABLA empleados
CREATE TABLE empleados(
    id int primary key NOT NULL auto_increment,
    nombre varchar(64) NOT NULL,
    apellido varchar(64) NOT NULL
);

-- CREANDO TABLA servicios
CREATE TABLE servicios(
    id int primary key NOT NULL auto_increment,
    nombre_servicio varchar(128) NOT NULL,
    duracion int NOT NULL
);

-- LUEGO EMPEZAMOS CON LAS TABLAS QUE TIENEN LLAVES FORANEAS


-- CREANDO TABLA citas
CREATE TABLE citas(
    id int PRIMARY KEY NOT NULL,
    fecha_creacion  TIMESTAMP NOT NULL,
    cliente_id  INTEGER,
    empleado_id  INTEGER,
    nombre_cliente  VARCHAR(30) NOT NULL,
    contacto_cliente  VARCHAR(30) NOT NULL,
    hora_inicio  TIMESTAMP NOT NULL,
    hora_termino  TIMESTAMP NOT NULL,
    cancelado  BOOLEAN NOT NULL
);

-- AGREGANDO FK de citas
ALTER TABLE citas
ADD CONSTRAINT FK_cliente_id
FOREIGN KEY (cliente_id) REFERENCES clientes(id);

ALTER TABLE citas
ADD CONSTRAINT FK_empleado_id
FOREIGN KEY (empleado_id) REFERENCES empleados(id);


-- CREANDO TABLA disponibilidades
CREATE TABLE disponibilidades(
    id int primary key NOT NULL auto_increment,
    empleado_id int NOT NULL,
    inicio timestamp,
    fin timestamp
);
-- AGREGANDO FK de disponibilidades
ALTER TABLE disponibilidades
ADD CONSTRAINT FK_empleados_id -- nombre de la relación
FOREIGN KEY (empleado_id) REFERENCES empleados(id);

-- CREANDO TABLA servicios_agendados
CREATE TABLE servicios_agendados(
    id int primary key NOT NULL auto_increment,
    citas_id int NOT NULL,
    servicio_id int NOT NULL
);
-- AGREGANDO FK servicios_agendados
ALTER TABLE servicios_agendados
ADD CONSTRAINT FK_citas_servicios_agendados_id
FOREIGN KEY (citas_id) REFERENCES citas(id);

ALTER TABLE servicios_agendados
ADD CONSTRAINT FK_servicio_agendado_id
FOREIGN KEY (servicio_id) REFERENCES servicios(id);

-- CREANDO TABLA servicios_ofrecidos
CREATE TABLE servicios_ofrecidos(
    id int primary key NOT NULL auto_increment,
    citas_id int NOT NULL,
    servicio_id int NOT NULL
);

-- AGREGANDO FK de servicios_ofrecidos
ALTER TABLE servicios_ofrecidos
ADD CONSTRAINT FK_citas_servicios_ofrecidos_id
FOREIGN KEY (citas_id) REFERENCES citas(id);

ALTER TABLE servicios_ofrecidos
ADD CONSTRAINT FK_servicio_ofrecido_id
FOREIGN KEY (servicio_id) REFERENCES servicios(id);

