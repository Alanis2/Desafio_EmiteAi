package br.com.emiteai.shop.mapper;

import br.com.emiteai.shop.controller.pedidos.dto.PedidosRequest;
import br.com.emiteai.shop.controller.pedidos.dto.PedidosResponse;
import br.com.emiteai.shop.repository.pedidos.model.Pedidos;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class PedidoMapper {
    public static final PedidoMapper INSTANCE = Mappers.getMapper(PedidoMapper.class);

    public abstract PedidosResponse toPedidoResponse(Pedidos pedidos);
}
