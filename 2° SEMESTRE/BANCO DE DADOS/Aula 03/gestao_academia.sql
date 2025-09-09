-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2025-09-04 22:00:38.234

-- tables
-- Table: aluno
CREATE TABLE aluno (
    id_aluno int  NOT NULL,
    nm_aluno varchar(30)  NOT NULL,
    dt_nascimento date  NOT NULL,
    ds_email varchar(50)  NOT NULL,
    nr_telefone varchar(11)  NOT NULL,
    tp_genero varchar(30)  NOT NULL,
    vl_peso double(8,2)  NOT NULL,
    vl_altura double(8,2)  NOT NULL,
    ds_escolaridade varchar(30)  NOT NULL,
    id_endereco int  NOT NULL,
    id_escolaridade int  NOT NULL,
    id_plano int  NOT NULL,
    id_profissao int  NOT NULL,
    CONSTRAINT aluno_pk PRIMARY KEY (id_aluno)
);

-- Table: endereco
CREATE TABLE endereco (
    id_endereco int  NOT NULL,
    ds_rua varchar(30)  NOT NULL,
    ds_logradouro varchar(30)  NOT NULL,
    ds_bairro varchar(11)  NOT NULL,
    ds_cidade varchar(30)  NOT NULL,
    id_municipio int  NOT NULL,
    CONSTRAINT endereco_pk PRIMARY KEY (id_endereco)
);

-- Table: grau_instrucao
CREATE TABLE grau_instrucao (
    id_escolaridade int  NOT NULL,
    ds_escolaridade varchar(11)  NOT NULL,
    CONSTRAINT grau_instrucao_pk PRIMARY KEY (id_escolaridade)
);

-- Table: instrutor
CREATE TABLE instrutor (
    id_instrutor int  NOT NULL,
    nm_instrutor varchar(30)  NOT NULL,
    ds_endereco varchar(100)  NOT NULL,
    nr_telefone varchar(11)  NOT NULL,
    ds_email varchar(50)  NOT NULL,
    id_endereco int  NOT NULL,
    CONSTRAINT instrutor_pk PRIMARY KEY (id_instrutor)
);

-- Table: instrutor_modalidade
CREATE TABLE instrutor_modalidade (
    id_instrutor int  NOT NULL,
    id_modalidade int  NOT NULL,
    CONSTRAINT instrutor_modalidade_pk PRIMARY KEY (id_instrutor,id_modalidade)
);

-- Table: matricula
CREATE TABLE matricula (
    id_matricula int  NOT NULL,
    id_turma int  NOT NULL,
    id_aluno int  NOT NULL,
    CONSTRAINT matricula_pk PRIMARY KEY (id_matricula)
);

-- Table: modalidade
CREATE TABLE modalidade (
    id_modalidade int  NOT NULL,
    tp_modalidade varchar(30)  NOT NULL,
    CONSTRAINT modalidade_pk PRIMARY KEY (id_modalidade)
);

-- Table: municipio
CREATE TABLE municipio (
    id_municipio int  NOT NULL,
    nm_municipio varchar(30)  NOT NULL,
    sg_uf char(2)  NOT NULL,
    CONSTRAINT municipio_pk PRIMARY KEY (id_municipio)
);

-- Table: plano
CREATE TABLE plano (
    id_plano int  NOT NULL,
    nm_plano varchar(30)  NOT NULL,
    ds_descricao varchar(100)  NOT NULL,
    vl_mensal double(8,2)  NOT NULL,
    vl_trimestral double(8,2)  NOT NULL,
    vl_semestral double(8,2)  NOT NULL,
    vl_anual double(8,2)  NOT NULL,
    qt_turma int  NOT NULL,
    CONSTRAINT plano_pk PRIMARY KEY (id_plano)
);

-- Table: profissao
CREATE TABLE profissao (
    id_profissao int  NOT NULL,
    nm_profissao varchar(30)  NOT NULL,
    CONSTRAINT profissao_pk PRIMARY KEY (id_profissao)
);

-- Table: registro_presenca
CREATE TABLE registro_presenca (
    id_presenca int  NOT NULL,
    hr_registro time  NOT NULL,
    id_matricula int  NOT NULL,
    CONSTRAINT registro_presenca_pk PRIMARY KEY (id_presenca)
);

-- Table: turma
CREATE TABLE turma (
    id_turma int  NOT NULL,
    id_instrutor int  NOT NULL,
    id_modalidade int  NOT NULL,
    nr_vagas int  NOT NULL,
    hr_duracao time  NOT NULL,
    CONSTRAINT turma_pk PRIMARY KEY (id_turma)
);

-- foreign keys
-- Reference: aluno_endereco (table: aluno)
ALTER TABLE aluno ADD CONSTRAINT aluno_endereco FOREIGN KEY aluno_endereco (id_endereco)
    REFERENCES endereco (id_endereco);

-- Reference: aluno_grau_instrucao (table: aluno)
ALTER TABLE aluno ADD CONSTRAINT aluno_grau_instrucao FOREIGN KEY aluno_grau_instrucao (id_escolaridade)
    REFERENCES grau_instrucao (id_escolaridade);

-- Reference: aluno_plano (table: aluno)
ALTER TABLE aluno ADD CONSTRAINT aluno_plano FOREIGN KEY aluno_plano (id_plano)
    REFERENCES plano (id_plano);

-- Reference: aluno_profissao (table: aluno)
ALTER TABLE aluno ADD CONSTRAINT aluno_profissao FOREIGN KEY aluno_profissao (id_profissao)
    REFERENCES profissao (id_profissao);

-- Reference: endereco_municipio (table: endereco)
ALTER TABLE endereco ADD CONSTRAINT endereco_municipio FOREIGN KEY endereco_municipio (id_municipio)
    REFERENCES municipio (id_municipio);

-- Reference: instrutor_endereco (table: instrutor)
ALTER TABLE instrutor ADD CONSTRAINT instrutor_endereco FOREIGN KEY instrutor_endereco (id_endereco)
    REFERENCES endereco (id_endereco);

-- Reference: instrutor_modalidade_instrutor (table: instrutor_modalidade)
ALTER TABLE instrutor_modalidade ADD CONSTRAINT instrutor_modalidade_instrutor FOREIGN KEY instrutor_modalidade_instrutor (id_instrutor)
    REFERENCES instrutor (id_instrutor);

-- Reference: instrutor_modalidade_modalidade (table: instrutor_modalidade)
ALTER TABLE instrutor_modalidade ADD CONSTRAINT instrutor_modalidade_modalidade FOREIGN KEY instrutor_modalidade_modalidade (id_modalidade)
    REFERENCES modalidade (id_modalidade);

-- Reference: matricula_aluno (table: matricula)
ALTER TABLE matricula ADD CONSTRAINT matricula_aluno FOREIGN KEY matricula_aluno (id_aluno)
    REFERENCES aluno (id_aluno);

-- Reference: matricula_turma (table: matricula)
ALTER TABLE matricula ADD CONSTRAINT matricula_turma FOREIGN KEY matricula_turma (id_turma)
    REFERENCES turma (id_turma);

-- Reference: registro_presenca_matricula (table: registro_presenca)
ALTER TABLE registro_presenca ADD CONSTRAINT registro_presenca_matricula FOREIGN KEY registro_presenca_matricula (id_matricula)
    REFERENCES matricula (id_matricula);

-- Reference: turma_instrutor_modalidade (table: turma)
ALTER TABLE turma ADD CONSTRAINT turma_instrutor_modalidade FOREIGN KEY turma_instrutor_modalidade (id_instrutor,id_modalidade)
    REFERENCES instrutor_modalidade (id_instrutor,id_modalidade);

-- End of file.