package dev.wakandaacademy.cliente_pedido.entrega.application.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import dev.wakandaacademy.cliente_pedido.entrega.application.api.EntregaRequest;
import dev.wakandaacademy.cliente_pedido.entrega.application.api.EntregaResponse;
import dev.wakandaacademy.cliente_pedido.entrega.domain.Entrega;
import dev.wakandaacademy.cliente_pedido.pedido.application.service.PedidoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class EntregaApplicationService implements EntregaService {
	private final PedidoService pedidoService;
	private final EntregaRepository entregaRepository;

	@Override
	public EntregaResponse criaEntrega(UUID idPedido, @Valid EntregaRequest entregaRequest) {
		log.info("[start] EntregaApplicationService - criaEntrega");
		pedidoService.buscaEntregaAtravesId(idPedido);
		Entrega entrega = entregaRepository.salvaEntrega(new Entrega(idPedido, entregaRequest));
		log.info("[finsh] EntregaApplicationService - criaEntrega");
		return new EntregaResponse(entrega.getIdEntrega());
	}

}
