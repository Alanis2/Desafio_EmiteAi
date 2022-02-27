package br.com.emiteai.shop.service.pedidos;

import br.com.emiteai.shop.controller.pedidos.dto.PedidosRequest;
import br.com.emiteai.shop.controller.pedidos.dto.PedidosResponse;
import br.com.emiteai.shop.mapper.PedidoMapper;
import br.com.emiteai.shop.repository.pedidos.PedidosRepository;
import br.com.emiteai.shop.repository.pedidos.model.Pedidos;
import br.com.emiteai.shop.repository.produtos.ProdutosRepository;
import br.com.emiteai.shop.repository.produtos.model.Produtos;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PedidosService {

    private final PedidosRepository pedidosRepository;
    private final ProdutosRepository produtosRepository;

    public PedidosResponse save(PedidosRequest pedidosRequest){
        Pedidos pedido = new Pedidos();

        if (pedidosRequest.getIdProdutos().size() < 1){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Para realizar a requisição, precisa ter no mínimo um produto ");
        }

        List<Produtos> produtos = produtosRepository.findAllById(pedidosRequest.getIdProdutos());

        Double valorTotal = produtos.stream().map(Produtos::getValor).reduce(Double::sum).orElse(0.0);

        valorTotal = valorTotal + (valorTotal * 0.1);

        pedido.setProdutos(produtos);
        pedido.setValor(valorTotal);

        pedido = pedidosRepository.save(pedido);

        return PedidoMapper.INSTANCE.toPedidoResponse(pedido);
    }

    public List<PedidosResponse> buscar(){
        List<Pedidos> pedidos = pedidosRepository.findAll();
        List<PedidosResponse> pedidosBuscar = pedidos.stream().map(PedidoMapper.INSTANCE::toPedidoResponse).collect(Collectors.toList());
        return pedidosBuscar;
    }
}
