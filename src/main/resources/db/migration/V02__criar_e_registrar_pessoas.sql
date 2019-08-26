CREATE TABLE pessoa (
  codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR(50) NOT NULL,
  ativo BOOLEAN,
  logradouro VARCHAR (50),
  numero VARCHAR (50),
  complemento VARCHAR (50),
  bairro VARCHAR (50),
  cep VARCHAR (50),
  cidade VARCHAR (50),
  estado VARCHAR (50)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa (nome, ativo) VALUES ('John Doen', true);
INSERT INTO pessoa (nome, ativo) VALUES ('Mary Jane', false);
