SELECT * FROM programacao_java.filmes_favoritos;

SELECT titulo_filme FROM programacao_java.filmes_favoritos
WHERE titulo_filme LIKE 'A%' OR titulo_filme LIKE 'D%';

SELECT titulo_filme FROM programacao_java.filmes_favoritos
WHERE genero = 'Terror';

SELECT titulo_filme FROM programacao_java.filmes_favoritos
WHERE titulo_filme LIKE '%e';