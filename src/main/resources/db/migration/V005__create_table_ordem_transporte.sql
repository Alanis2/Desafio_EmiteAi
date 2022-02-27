CREATE SEQUENCE ordem_transporte_sequence START WITH 1;

CREATE TABLE ordem_transporte (
        id integer primary key NOT NULL DEFAULT nextval('ordem_transporte_sequence'),
        data_criacao timestamp
);

ALTER SEQUENCE ordem_transporte_sequence
    OWNED BY ordem_transporte.id;


