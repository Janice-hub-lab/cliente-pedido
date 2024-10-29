package dev.wakandaacademy.cliente_pedido.entrega.application.api;

import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import dev.wakandaacademy.cliente_pedido.entrega.application.service.EntregaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class EntregaController implements EntregaAPI {
	
	private final EntregaService entregaService;

	@Override
	public EntregaResponse postEntrega(UUID idPedido, @Valid EntregaRequest entregaRequest) {
		log.info("[start] EntregaController - postEntrega");
		log.info("[idPedido] {}", idPedido);
		EntregaResponse entrega = entregaService.criaEntrega(idPedido, entregaRequest);
		log.info("[finish] EntregaController - postEntrega");
		return entrega;
	}

}
