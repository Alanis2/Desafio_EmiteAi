package br.com.emiteai.shop.controller.pedidos.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PedidosRequest {
    @Size(min=1, max=3 , message = "Um pedido deve conter entre 1 á 3 produtos")
    private List<Long> idProdutos;
}
