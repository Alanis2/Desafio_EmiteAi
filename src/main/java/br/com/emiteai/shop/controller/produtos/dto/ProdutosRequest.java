package br.com.emiteai.shop.controller.produtos.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ProdutosRequest {
    private String nomeProduto;
    private Double valorProduto;
}
