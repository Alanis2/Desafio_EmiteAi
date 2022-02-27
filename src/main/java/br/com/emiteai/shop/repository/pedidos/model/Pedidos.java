package br.com.emiteai.shop.repository.pedidos.model;

import br.com.emiteai.shop.repository.ordemTransporte.model.OrdemTransporte;
import br.com.emiteai.shop.repository.produtos.model.Produtos;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "Pedidos")
public class Pedidos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pedidos_seq")
    @SequenceGenerator(name = "pedidos_seq", sequenceName = "pedidos_sequence", initialValue = 1, allocationSize = 1)
    private Long id;
    @Column(name = "valortotal")
    private Double valor;

    @ManyToMany
    @JoinTable(
            name = "pedidos_produtos",
            joinColumns = @JoinColumn(name = "id_pedido"),
            inverseJoinColumns = @JoinColumn(name = "id_produto"))
    List<Produtos> produtos;

    @ManyToOne
    @JoinColumn(name = "id_ordem_transporte")
    private OrdemTransporte ordemTransporte;
}
