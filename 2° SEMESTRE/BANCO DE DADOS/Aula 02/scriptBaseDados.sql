CREATE TABLE sala (
  idsala INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  nome VARCHAR(50)  NULL  ,
  localizacao VARCHAR(100)  NULL    ,
PRIMARY KEY(idsala));



CREATE TABLE software (
  idsoftware INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  nome VARCHAR(50)  NULL  ,
  tipo VARCHAR(30)  NULL    ,
PRIMARY KEY(idsoftware));



CREATE TABLE dispositivo (
  iddispositivo INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  sala_idsala INTEGER UNSIGNED  NOT NULL  ,
  descricao VARCHAR(100)  NULL  ,
  categoria VARCHAR(30)  NULL    ,
PRIMARY KEY(iddispositivo)  ,
INDEX dispositivo_FKIndex1(sala_idsala),
  FOREIGN KEY(sala_idsala)
    REFERENCES sala(idsala)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION);



CREATE TABLE dispositivo_software (
  dispositivo_iddispositivo INTEGER UNSIGNED  NOT NULL  ,
  software_idsoftware INTEGER UNSIGNED  NOT NULL    ,
PRIMARY KEY(dispositivo_iddispositivo, software_idsoftware)  ,
INDEX dispositivo_has_software_FKIndex1(dispositivo_iddispositivo)  ,
INDEX dispositivo_has_software_FKIndex2(software_idsoftware),
  FOREIGN KEY(dispositivo_iddispositivo)
    REFERENCES dispositivo(iddispositivo)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(software_idsoftware)
    REFERENCES software(idsoftware)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION);



CREATE TABLE manutencao (
  idmanutencao INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  dispositivo_iddispositivo INTEGER UNSIGNED  NOT NULL  ,
  data_execucao DATE  NULL  ,
  descricao VARCHAR(100)  NULL    ,
PRIMARY KEY(idmanutencao)  ,
INDEX manutencao_FKIndex1(dispositivo_iddispositivo),
  FOREIGN KEY(dispositivo_iddispositivo)
    REFERENCES dispositivo(iddispositivo)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION);




