package br.com.emiteai.shop.controller.produtos.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ProdutosResponse {
    private String nomeProduto;
    private Long valorProduto;
}
