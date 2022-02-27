package br.com.emiteai.shop.service.produto;

import br.com.emiteai.shop.controller.produtos.dto.ProdutosRequest;
import br.com.emiteai.shop.controller.produtos.dto.ProdutosResponse;
import br.com.emiteai.shop.mapper.ProdutoMapper;
import br.com.emiteai.shop.repository.produtos.ProdutosRepository;
import br.com.emiteai.shop.repository.produtos.model.Produtos;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    private ProdutosRepository produtosRepository;

    public ProdutosResponse save(ProdutosRequest produtosRequest){
        Produtos produtos = ProdutoMapper.INSTANCE.toPedido(produtosRequest);

        produtos = produtosRepository.save(produtos);

        return ProdutoMapper.INSTANCE.toPedidoResponse(produtos);
    }
}
