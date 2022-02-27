package br.com.emiteai.shop.service.ordemTransporte;

import br.com.emiteai.shop.repository.ordemTransporte.OrdemTransporteRepository;
import br.com.emiteai.shop.repository.ordemTransporte.model.OrdemTransporte;
import br.com.emiteai.shop.repository.pedidos.PedidosRepository;
import br.com.emiteai.shop.repository.pedidos.model.Pedidos;
import br.com.emiteai.shop.service.ordemTransporte.dto.OrdemTransporteDto;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
@Log4j2
@AllArgsConstructor
public class OrdemTransporteService {

    private PedidosRepository pedidosRepository;
    private OrdemTransporteRepository ordemTransporteRepository;

    @Scheduled(fixedDelay = 1000 * 60 * 10)
    public void gerarOrdemDeTranporte() {
        // TODO buscar todos os pedidos sem vinculo com ordem de transporte

        List<Pedidos> pedidos = pedidosRepository.buscarPedidosSemOrdemTransporte();


        // TODO criar ordem de transporte
        OrdemTransporte ordemTransporte = new OrdemTransporte();

        // TODO salvar ordem de transporte
        ordemTransporteRepository.save(ordemTransporte);

        // TODO vincular ordem de transporte junto com os pedidos
        pedidos.forEach(pedido -> pedido.setOrdemTransporte(ordemTransporte));

        pedidosRepository.saveAll(pedidos);
        System.out.println("Rodou" + LocalDate.now());
    }
}
