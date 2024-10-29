package dev.wakandaacademy.cliente_pedido.entrega.application.api;

import java.util.List;
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

	@Override
	public List<EntregaPedidoListResponse> getEntregaDoPedidoComId(UUID idPedido) {
		log.info("[start] EntregaController - getEntregaDoPedidoComId");
		log.info("[idPedido] {}", idPedido);
		List<EntregaPedidoListResponse> entregasDoPedido = entregaService.buscaEntregasDoPedidoComID(idPedido);
		log.info("[finish] EntregaController - getEntregaDoPedidoComId");
		return entregasDoPedido;
	}

	@Override
	public EntregaPedidoDetalhadoResponse getEntregaDoPedidoComId(UUID idPedido, UUID idEntrega) {
		log.info("[start] EntregaController - getEntregaDoPedidoComId");
		log.info("[idPedido] - [idEntrega] {}", idPedido, idEntrega);
		EntregaPedidoDetalhadoResponse entrega = entregaService.buscaEntregasDoPedidoComID(idPedido, idEntrega);
		log.info("[finish] EntregaController - getEntregaDoPedidoComId");
		return entrega;
	}

}
