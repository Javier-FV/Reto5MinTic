DROP SCHEMA IF EXISTS redflix_app;
CREATE SCHEMA redflix_app;
USE redflix_app;

CREATE TABLE IF NOT EXISTS peliculas (
  titulo VARCHAR(45) NOT NULL,
  resumen VARCHAR(250) NULL,
  ano INT NULL,
  nombre_director VARCHAR(15) NULL,
  apellido_director VARCHAR(15) NULL,
  PRIMARY KEY (titulo));

CREATE TABLE IF NOT EXISTS series (
  titulo VARCHAR(45) NOT NULL,
  temporadas INT NULL,
  episodios INT NULL,
  PRIMARY KEY (titulo));

CREATE TABLE IF NOT EXISTS usuarios (
  alias VARCHAR(20) NOT NULL,
  nombre VARCHAR(15) NULL,
  apellido VARCHAR(15) NULL,
  email VARCHAR(25) NULL,
  celular BIGINT(11) NULL,
  contrasena VARCHAR(45) NULL,
  PRIMARY KEY (alias));

insert into peliculas values ("Los Vengadores", "Pelicula de superheroes basada en Marvel Comics. Nick Fury director de SHIELD recluta a Tony Stark, Steve Rogers, Bruce Banner y Thor para forma un equipo y evitar que Loki, hermano de Thor, se apodere de la tierra.",1990, "Joss","Whedon");
insert into peliculas values ("Interestelar", "Pelicula de ciencia ficción, donde la humanidad lucha por sobrevivir. La pelicula cuenta una historia de un grupo de astronautas que viajan a traves de un agujero de gusano en busca de un nuevo hogar.",2014, "Christopher","Nolan");
insert into peliculas values ("El viaje de Chihiro", "Pelicula de animación japonesa. Es la historia de una niña de 12 años, quien se ve atrapada por un mundo mágico y sobrenatural, teniendo como misión buscar su libertad y la de sus padres y regresar al mundo real.",2001, "Hayo","Miyazaki");
insert into peliculas values ("Parasitos", "Pelicula de drama, suspenso y humor negro. Toca temas como las diferencias sociales y vulnerabilidad del espiritu humano.",2019, "Bong","Joon-ho");
insert into peliculas values ("Mas alla de los sueños", "Pelicula de drama, narra una historia trágica de una familia, donde el padre va en busca de sus esposa al mas allá para recuperarla.",1998, "Vincent","Ward");

insert into series values ("The walking dead", 11, 153);
insert into series values ("Viaje a las estrellas: la serie original", 3, 80);
insert into series values ("Glow", 3, 30);
insert into series values ("La casa de papel", 4, 31);
insert into series values ("Friends", 10, 236);
insert into series values ("Arrow", 8, 170);
insert into series values ("The big bang theory", 12, 279);
insert into series values ("Vikingos", 6, 79);

insert into usuarios values ("lucky", "Pedro", "Perez", "perez@correo.com", "3102564846", "perez123");
insert into usuarios values ("malopez", "Maria", "Lopez", "lopez@correo.com", "3123482563", "lopez123");
insert into usuarios values ("diva", "Ana", "Diaz", "diaz@correo.com", "3136475832", "diaz123");
insert into usuarios values ("dreamer", "Luis", "Rojas", "rojas@correo.com", "3154687246", "rojas123");
insert into usuarios values ("ninja", "Andres", "Cruz", "cruz@correo.com", "3102568974", "cruz123");
insert into usuarios values ("neon", "Nelson", "Ruiz", "ruiz@correo.com", "3125689532", "ruiz123");
insert into usuarios values ("rose", "Claudia", "Mendez", "mendez@correo.com", "3145689132", "mendez123");
insert into usuarios values ("green", "Jorge", "Rodriguez", "rodri@correo.com", "3115468322", "rodri123");