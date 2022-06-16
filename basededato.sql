SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE IF EXISTS `calendario`;
DROP TABLE IF EXISTS `empleado`;
DROP TABLE IF EXISTS `cliente`;
DROP TABLE IF EXISTS `citas`;
DROP TABLE IF EXISTS `servicio_ofrecido`;
DROP TABLE IF EXISTS `servicio_agendado`;
DROP TABLE IF EXISTS `service`;
SET FOREIGN_KEY_CHECKS = 1;

CREATE TABLE calendario (
    id INTEGER NOT NULL AUTO_INCREMENT,
    empleado_id INTEGER NOT NULL,
    inicio TIMESTAMP NOT NULL,
    fin TIMESTAMP NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE empleado (
    id INTEGER AUTO_INCREMENT NOT NULL,
    nombre VARCHAR(30) NOT NULL,
    apellido VARCHAR(30) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE cliente (
    id INTEGER NOT NULL,
    nombre VARCHAR(30) NOT NULL,
    telefono VARCHAR(30),
    correo VARCHAR(30),
    PRIMARY KEY (id)
);

CREATE TABLE citas (
    id INTEGER NOT NULL,
    fecha_creacion TIMESTAMP NOT NULL,
    cliente_id INTEGER,
    empleado_id INTEGER,
    nombre_cliente VARCHAR(30) NOT NULL,
    contacto_cliente VARCHAR(30) NOT NULL,
    hora_inicio TIMESTAMP NOT NULL,
    hora_termino TIMESTAMP NOT NULL,
    cancelado BOOLEAN NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE servicio_ofrecido (
    id INTEGER NOT NULL,
    citas_id INTEGER NOT NULL,
    servicio_id INTEGER NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE servicio_agendado (
    id INTEGER NOT NULL,
    citas_id INTEGER NOT NULL,
    servicio_id INTEGER NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE servicio (
    id INTEGER NOT NULL,
    nombre_servicio VARCHAR(30) NOT NULL,
    duracion INTEGER NOT NULL,
    PRIMARY KEY (id)
);
