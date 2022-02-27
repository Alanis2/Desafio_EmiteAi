package br.com.emiteai.shop.mapper;

import br.com.emiteai.shop.controller.produtos.dto.ProdutosRequest;
import br.com.emiteai.shop.controller.produtos.dto.ProdutosResponse;
import br.com.emiteai.shop.repository.produtos.model.Produtos;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class ProdutoMapper {
    public static final ProdutoMapper INSTANCE = Mappers.getMapper(ProdutoMapper.class);

    public abstract Produtos toPedido(ProdutosRequest produtosRequest);

    public abstract ProdutosResponse toPedidoResponse(Produtos produtos);
}
