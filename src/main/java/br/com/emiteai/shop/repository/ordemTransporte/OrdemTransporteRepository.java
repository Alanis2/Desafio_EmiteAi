package br.com.emiteai.shop.repository.ordemTransporte;

import br.com.emiteai.shop.repository.ordemTransporte.model.OrdemTransporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemTransporteRepository extends JpaRepository<OrdemTransporte, Long> {
}
