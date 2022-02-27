CREATE SEQUENCE produtos_sequence START WITH 1;

CREATE TABLE produtos(
    id integer NOT NULL primary key DEFAULT nextval('produtos_sequence') ,
    valor numeric(10, 2) NOT NULL,
    nome varchar(255)
);

ALTER SEQUENCE produtos_sequence
    OWNED BY produtos.id;

