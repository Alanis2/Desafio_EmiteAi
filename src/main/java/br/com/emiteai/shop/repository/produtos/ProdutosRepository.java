package br.com.emiteai.shop.repository.produtos;

import br.com.emiteai.shop.repository.produtos.model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long> {
}
