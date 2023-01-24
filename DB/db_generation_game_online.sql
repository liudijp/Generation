CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;
-- Crie a tabela tb_classes e determine pelo menos 2 atributos, além da Chave Primária, relevantes para classificar os personagens do Game Online.
CREATE TABLE tb_classes (
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(255) NOT NULL,
	tipo VARCHAR(255) NOT NULL
);
-- Crie a tabela tb_personagens e determine 4 atributos, além da Chave Primária, relevantes aos personagens do Game Online.
-- Não esqueça de criar a Foreign Key da tabela tb_classes na tabela tb_personagens.
CREATE TABLE tb_personagens (
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    poder_ataque INT NOT NULL,
    poder_defesa INT NOT NULL,
    id_classe BIGINT NOT NULL,
    FOREIGN KEY (id_classe) REFERENCES tb_classes(id)
);

-- Insira 5 registros na tabela tb_classes.
INSERT INTO tb_classes (id, nome, tipo) VALUES (1, 'Guerreiros', 'Físico');
INSERT INTO tb_classes (id, nome, tipo) VALUES (2, 'Mágicos', 'Mágico');
INSERT INTO tb_classes (id, nome, tipo) VALUES (3, 'Arqueiros', 'Físico');
INSERT INTO tb_classes (id, nome, tipo) VALUES (4, 'Clerigos', 'Mágico');
INSERT INTO tb_classes (id, nome, tipo) VALUES (5, 'Assassinos', 'Físico');
-- Insira 8 registros na tabela tb_personagens, preenchendo a Chave Estrangeira para criar a relação com a tabela tb_classes.
INSERT INTO tb_personagens (id, nome, poder_ataque, poder_defesa, id_classe) VALUES (1, 'Geralt', 3000, 1500, 1);
INSERT INTO tb_personagens (id, nome, poder_ataque, poder_defesa, id_classe) VALUES (2, 'Erza', 2500, 2000, 2);
INSERT INTO tb_personagens (id, nome, poder_ataque, poder_defesa, id_classe) VALUES (3, 'Link', 2000, 2500, 3);
INSERT INTO tb_personagens (id, nome, poder_ataque, poder_defesa, id_classe) VALUES (4, 'Kirito', 3500, 1000, 3);
INSERT INTO tb_personagens (id, nome, poder_ataque, poder_defesa, id_classe) VALUES (5, 'Naruto', 4000, 800, 1);
INSERT INTO tb_personagens (id, nome, poder_ataque, poder_defesa, id_classe) VALUES (6, 'Sakura', 2000, 1500, 2);
INSERT INTO tb_personagens (id, nome, poder_ataque, poder_defesa, id_classe) VALUES (7, 'Ichigo', 2500, 2000, 1);
INSERT INTO tb_personagens (id, nome, poder_ataque, poder_defesa, id_classe) VALUES (8, 'Luffy', 3000, 1000, 1);
-- Faça um SELECT que retorne todes os personagens cujo poder de ataque seja maior do que 2000.
SELECT * FROM tb_personagens
	WHERE poder_ataque > 2000;
-- Faça um SELECT que retorne todes os personagens cujo poder de defesa esteja no intervalo 1000 e 2000.
SELECT * FROM tb_personagens
	WHERE poder_defesa > 1000
	AND	poder_defesa < 2000;
-- Faça um SELECT utilizando o operador LIKE, buscando todes os personagens que possuam a letra C no atributo nome.
SELECT * FROM tb_personagens 
	WHERE nome LIKE "%c%";
-- Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_personagens com os dados da tabela tb_classes.
SELECT * FROM tb_personagens INNER JOIN tb_classes 
	ON tb_personagens.id_classe = tb_classes.id;
-- Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_personagens com os dados da tabela tb_classes, onde traga apenas os personagens que pertençam a uma classe específica (Exemplo: Todes os personagens da classe dos arqueiros).
SELECT * FROM tb_personagens
INNER JOIN tb_classes ON tb_personagens.id_classe = tb_classes.id
WHERE tb_classes.nome = 'Arqueiros';
-- Salve todas as queries para cada um dos requisitos do exercício em um único script (arquivo .SQL) e coloque no seu Github pessoal, no repositório que você criou sobre Banco de dados.
