package dev.wakandaacademy.cliente_pedido.pedido.application.api;

import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class PetController implements PedidoAPI {

	@Override
	public PedidoResponse postPedido(UUID idCliente, @Valid PedidoRequest pedidoRequest) {
		log.info("[start] PetController - postPedido");
		log.info("[idCliente] {}", idCliente);
		log.info("[finish] PetController - postPedido");
		return null;
	}

}
