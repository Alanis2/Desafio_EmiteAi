CREATE TABLE pedidos_produtos (
    id_pedido integer NOT NULL,
    id_produto integer,
    PRIMARY KEY (id_pedido,id_produto)
);



