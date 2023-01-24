CREATE DATABASE db_exercicio_farmacia;

USE db_exercicio_farmacia;

-- Crie a tabela tb_categorias e determine pelo menos 2 atributos, além da Chave Primária, relevantes para classificar os produtos.
CREATE TABLE tb_categorias (
    id_categoria BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    descricao VARCHAR(255)
);

-- Crie a tabela tb_produtos e determine 4 atributos, além da Chave Primária, relevantes aos produtos da farmácia.
-- Não esqueça de criar a Foreign Key da tabela tb_categorias na tabela tb_produtos.
CREATE TABLE tb_produtos (
	id_produto BIGINT AUTO_INCREMENT PRIMARY KEY,
    id_categoria BIGINT NOT NULL,
    nome VARCHAR(255) NOT NULL,
    preco DECIMAL(10,2) NOT NULL,
    quantidade INT NOT NULL,
    FOREIGN KEY (id_categoria) REFERENCES tb_categorias(id_categoria)
);
 --  id_categoria INT NOT NULL,     nome VARCHAR(255) NOT NULL,     preco DECIMAL(10,2) NOT NULL,     quantidade INT NOT NULL,     FOREIGN KEY (id_categoria) REFERENCES tb_categorias(id_categoria) )	Error Code: 3780. Referencing column 'id_categoria' and referenced column 'id_categoria' in foreign key constraint 'tb_produtos_ibfk_1' are incompatible.	0.00077 sec

-- Insira 5 registros na tabela tb_categorias.
INSERT INTO tb_categorias (nome, descricao)
VALUES  ("COSMETICOS", "PRODUTOS DE BELEZA"),
		("REMEDIOS"	 , "MEDICAMENTOS"),
        ("PERFUMARIA", "PRODUTOS DE PERFUMARIA"),
        ("HIGIENE PESSOAL", "PRODUTO DE HIGIENE PESSOAL"),
        ("OUTROS" , "OUTROS PRODUTOS");
        
-- Insira 8 registros na tabela tb_produtos, preenchendo a Chave Estrangeira para criar a relação com a tabela tb_categorias.        
INSERT INTO tb_produtos (nome, preco, quantidade, id_categoria)
VALUES ('SHAMPOO', 20.00, 10, 1),
       ('SABONETE', 10.00, 15, 4),
       ('PERFUME', 50.00, 5, 3),
       ('REMEDIO PARA DOR DE CABECA', 15.00, 20, 2),
       ('CREME DENTAL', 5.00, 30, 4),
       ('MAQUIAGEM', 30.00, 10, 1),
       ('REMEDIO PARA GRIPE', 25.00, 15, 2),
       ('SABONETE LIQUIDO', 12.00, 20, 4);

-- Faça um SELECT que retorne todes os produtos cujo preco seja maior do que R$ 50,00.
SELECT * FROM tb_produtos
	WHERE preco > 50.00;

-- Faça um SELECT que retorne todes os produtos cujo preco esteja no intervalo R$ 5,00 e R$ 60,00.
SELECT * FROM tb_produtos
	WHERE preco > 5.00
	AND	  preco < 60.00;

-- Faça um SELECT utilizando o operador LIKE, buscando todes os produtos que possuam a letra C no atributo nome.
SELECT * FROM tb_produtos
	WHERE nome LIKE "%c%";

-- Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_produtos com os dados da tabela tb_categorias.
SELECT * FROM tb_produtos INNER JOIN tb_categorias 
	ON tb_produtos.id_categoria = tb_categorias.id_categoria;

-- Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_produtos com os dados da tabela tb_categorias, onde traga apenas os produtos que pertençam a uma categoria específica (Exemplo: Todes os produtos que pertencem a categoria cosméticos).
SELECT * FROM tb_produtos INNER JOIN tb_categorias 
	ON tb_produtos.id_categoria = tb_categorias.id_categoria
    WHERE tb_categorias.nome = "COSMETICOS";



