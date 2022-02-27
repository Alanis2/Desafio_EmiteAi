CREATE SEQUENCE pedidos_sequence START WITH 1;

CREATE TABLE pedidos (
    id integer primary key NOT NULL DEFAULT nextval('pedidos_sequence'),
    valorTotal NUMERIC(5,2) NOT NULL
);

ALTER SEQUENCE pedidos_sequence
OWNED BY pedidos.id;

