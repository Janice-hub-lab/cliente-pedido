package dev.wakandaacademy.cliente_pedido.pedido.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/cliente/{idCliente}/pedido")
public interface PedidoAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	PedidoResponse postPedido(@PathVariable UUID idCliente, @Valid @RequestBody PedidoRequest pedidoRequest);

	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<PedidoClienteListResponse> getPedidoDoClienteComId(@PathVariable UUID idCliente);

	@GetMapping(value = "/{idPedido}")
	@ResponseStatus(code = HttpStatus.OK)
	PedidoClienteDetalhadoResponse getPedidoDoClienteComId(@PathVariable UUID idCliente, @PathVariable UUID idPedido);

	@DeleteMapping(value = "/{idPedido}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void deletePedidoDoClienteComId(@PathVariable UUID idCliente, @PathVariable UUID idPedido);

}
