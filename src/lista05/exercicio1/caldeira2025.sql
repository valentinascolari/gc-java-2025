
CREATE TABLE programacao_java.integrantes (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cargo VARCHAR(100)
);

CREATE TABLE programacao_java.filmes_favoritos (
    id SERIAL PRIMARY KEY,
    nome_integrante VARCHAR(100) NOT NULL,
    titulo_filme VARCHAR(255) NOT NULL,
    genero VARCHAR(100)
);


INSERT INTO programacao_java.filmes_favoritos (nome_integrante, titulo_filme, genero) VALUES
('Joao', 'Alien', 'Terror'),
('Maria', 'O Chamado', 'Terror'),
('Pedro', 'Avatar', 'Ficção Científica');

SELECT * FROM programacao_java.filmes_favoritos;

SELECT titulo_filme FROM programacao_java.filmes_favoritos
WHERE titulo_filme LIKE 'A%' OR titulo_filme LIKE 'D%';

SELECT titulo_filme FROM programacao_java.filmes_favoritos
WHERE genero = 'Terror';

SELECT titulo_filme FROM programacao_java.filmes_favoritos
WHERE titulo_filme LIKE '%e';
