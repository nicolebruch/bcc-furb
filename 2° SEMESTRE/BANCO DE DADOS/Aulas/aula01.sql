-- criando a tabela departamento
CREATE TABLE departamento
(cd_departamento INTEGER,
nm_departamento VARCHAR(30),
vl_orcamento DECIMAL(8,2),
PRIMARY KEY (cd_departamento) -- aqui estamos definindo o campo que será PK 
); -- para executar a instrução selecione totalmente o comando e pressione CTRL+F9

-- criando a tabela funcionario
CREATE TABLE funcionario
(cd_funcionario INTEGER,
cd_departamento INTEGER REFERENCES departamento(cd_departamento), -- aqui indica o FK
nm_funcionario VARCHAR(50),
PRIMARY KEY (cd_funcionario)
); -- idem, para executar selecione o comando e pressione CTRL+F9

-- selecionando dados de departamento
SELECT * FROM departamento;

-- selecionando dados de funcionario
SELECT * FROM funcionario;