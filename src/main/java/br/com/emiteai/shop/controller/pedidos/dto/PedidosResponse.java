package br.com.emiteai.shop.controller.pedidos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidosResponse {
    private Long id;
    private Double valor;
    public boolean getExisteCSV(){
        return valor > 500.00;
    }
}
