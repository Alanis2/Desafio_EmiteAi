package br.com.emiteai.shop.repository.produtos.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "produtos")
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produtos_seq")
    @SequenceGenerator(name = "produtos_seq", sequenceName = "produtos_sequence", initialValue = 1, allocationSize = 1)
    private Long id;
    private Double valor;
    private String nome;
}
