ALTER TABLE produtos
RENAME COLUMN id TO id_produto;

ALTER TABLE produtos
RENAME COLUMN nome TO nome_produto;

ALTER SCHEMA current_schema TRANSFER produtos TO ia_dados;

DELETE FROM ia_dados.produtos a
USING ia_dados.produtos b
WHERE a.ctid < b.ctid
  AND a.id_produto = b.id_produto
  AND a.nome_produto = b.nome_produto
  AND a.preco = b.preco;

UPDATE ia_dados.produtos
SET preco = 450.00
WHERE preco = 350.00;

SELECT *
FROM ia_dados.produtos
WHERE preco BETWEEN 500.00 AND 800.00;

SELECT id_produto,
       nome_produto,
       preco,
       preco * 0.9 AS preco_com_desconto
FROM ia_dados.produtos
ORDER BY preco_com_desconto DESC;


TRUNCATE TABLE ia_dados.produtos;
