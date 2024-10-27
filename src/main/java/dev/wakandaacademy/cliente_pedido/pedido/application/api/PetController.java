package dev.wakandaacademy.cliente_pedido.pedido.application.api;

import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import dev.wakandaacademy.cliente_pedido.pedido.application.service.PedidoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class PetController implements PedidoAPI {

	private final PedidoService pedidoService;

	@Override
	public PedidoResponse postPedido(UUID idCliente, @Valid PedidoRequest pedidoRequest) {
		log.info("[start] PetController - postPedido");
		log.info("[idCliente] {}", idCliente);
		PedidoResponse pedido = pedidoService.criaPedido(idCliente, pedidoRequest);
		log.info("[finish] PetController - postPedido");
		return pedido;
	}

}
