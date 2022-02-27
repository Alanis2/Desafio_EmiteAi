package br.com.emiteai.shop.repository.ordemTransporte.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "ordem_transporte")

public class OrdemTransporte {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ordem_transporte_seq")
    @SequenceGenerator(name = "ordem_transporte_seq", sequenceName = "ordem_transporte_sequence",allocationSize = 1,initialValue = 1)
    private Long id;
    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao = LocalDateTime.now();

}
