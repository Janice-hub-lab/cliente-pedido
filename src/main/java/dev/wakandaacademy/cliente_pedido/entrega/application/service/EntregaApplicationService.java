package dev.wakandaacademy.cliente_pedido.entrega.application.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import dev.wakandaacademy.cliente_pedido.entrega.application.api.EntregaRequest;
import dev.wakandaacademy.cliente_pedido.entrega.application.api.EntregaResponse;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class EntregaApplicationService implements EntregaService {

	@Override
	public EntregaResponse criaEntrega(UUID idPedido, @Valid EntregaRequest entregaRequest) {
		log.info("[start] EntregaApplicationService - criaEntrega");
		
		log.info("[finish] EntregaApplicationService - criaEntrega");
		return null;
	}

}
