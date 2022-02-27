alter table pedidos
add column id_ordem_transporte integer;

ALTER TABLE pedidos
    ADD CONSTRAINT fk_ordem_transporte
        FOREIGN KEY (id_ordem_transporte)
            REFERENCES ordem_transporte(id);


