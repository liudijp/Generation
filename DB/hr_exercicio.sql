CREATE DATABASE db_hr_exercicio;

USE db_hr_exercicio;

CREATE TABLE colaboradores (
    id INT PRIMARY KEY,
    nome VARCHAR(255),
    email VARCHAR(255),
    salario DECIMAL(10,2),
    data_admissao DATE,
    departamento VARCHAR(255)
);

INSERT INTO colaboradores (id, nome, email, salario, data_admissao, departamento)
VALUES (1, 'João Silva', 'joao.silva@email.com', 3000.00, '2022-01-01', 'Vendas'),
       (2, 'Maria Oliveira', 'maria.oliveira@email.com', 2500.00, '2022-02-01', 'Marketing'),
       (3, 'Lucas Rodrigues', 'lucas.rodrigues@email.com', 2000.00, '2022-03-01', 'Financeiro'),
       (4, 'Ana Costa', 'ana.costa@email.com', 3500.00, '2022-04-01', 'Recursos Humanos'),
       (5, 'Pedro Almeida', 'pedro.almeida@email.com', 4000.00, '2022-05-01', 'TI');
       
SELECT * FROM colaboradores WHERE salario > 2000;    
  
SELECT * FROM colaboradores WHERE salario < 2000;

UPDATE colaboradores SET salario = 1500.00 WHERE id = 2;