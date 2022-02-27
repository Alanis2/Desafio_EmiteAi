package br.com.emiteai.shop.controller.produtos;

import br.com.emiteai.shop.controller.produtos.dto.ProdutosRequest;
import br.com.emiteai.shop.controller.produtos.dto.ProdutosResponse;
import br.com.emiteai.shop.service.produto.ProdutoService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
@AllArgsConstructor
@NoArgsConstructor
public class ProdutosController {

    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<ProdutosResponse> create(@RequestBody ProdutosRequest produtosRequest){
        return ResponseEntity.status(201).body(produtoService.save(produtosRequest));
    }
}
