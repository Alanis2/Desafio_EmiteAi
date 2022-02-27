package br.com.emiteai.shop.controller.pedidos;

import br.com.emiteai.shop.controller.pedidos.dto.PedidosRequest;
import br.com.emiteai.shop.controller.pedidos.dto.PedidosResponse;
import br.com.emiteai.shop.service.pedidos.PedidosService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/pedidos")
@RequiredArgsConstructor
public class PedidoController {

    private final PedidosService pedidoService;

    @PostMapping
    public ResponseEntity<PedidosResponse> create (@RequestBody @Valid PedidosRequest pedidosRequest){
        return ResponseEntity.status(201).body(pedidoService.save(pedidosRequest));
    }

    @GetMapping
    public ResponseEntity<List<PedidosResponse>> buscarTodos(){
        return ResponseEntity.status(201).body(pedidoService.buscar());
    }
}
