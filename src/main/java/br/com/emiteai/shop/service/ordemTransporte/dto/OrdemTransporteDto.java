package br.com.emiteai.shop.service.ordemTransporte.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@Builder
public class OrdemTransporteDto {
    private Timestamp data_criacao;
}
