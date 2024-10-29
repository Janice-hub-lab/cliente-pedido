package dev.wakandaacademy.cliente_pedido.entrega.application.api;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/pedido/{idPedido}/entrega")
public interface EntregaAPI {

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	EntregaResponse postEntrega(@PathVariable UUID idPedido, @Valid @RequestBody EntregaRequest entregaRequest);

}
