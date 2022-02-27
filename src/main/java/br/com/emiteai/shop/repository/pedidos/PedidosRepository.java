package br.com.emiteai.shop.repository.pedidos;

import br.com.emiteai.shop.repository.pedidos.model.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidosRepository extends JpaRepository<Pedidos, Long> {
    @Query("SELECT p FROM Pedidos p WHERE p.ordemTransporte is null ")
    List<Pedidos> buscarPedidosSemOrdemTransporte();
}
