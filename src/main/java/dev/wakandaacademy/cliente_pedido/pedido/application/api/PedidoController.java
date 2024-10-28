package dev.wakandaacademy.cliente_pedido.pedido.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import dev.wakandaacademy.cliente_pedido.pedido.application.service.PedidoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class PedidoController implements PedidoAPI {

	private final PedidoService pedidoService;

	@Override
	public PedidoResponse postPedido(UUID idCliente, @Valid PedidoRequest pedidoRequest) {
		log.info("[start] PedidoController - postPedido");
		log.info("[idCliente] {}", idCliente);
		PedidoResponse pedido = pedidoService.criaPedido(idCliente, pedidoRequest);
		log.info("[finish] PedidoController - postPedido");
		return pedido;
	}

	@Override
	public List<PedidoClienteListResponse> getPedidoDoClienteComId(UUID idCliente) {
		log.info("[start] PedidoController - getPedidoDoClienteComId");
		log.info("[idCliente] {}", idCliente);
		List<PedidoClienteListResponse> pedidosDoCliente = pedidoService.buscaPedidosDoClienteComId(idCliente);
		log.info("[finish] PedidoController - getPedidoDoClienteComId");
		return pedidosDoCliente;
	}

	@Override
	public PedidoClienteDetalhadoResponse getPedidoDoClienteComId(UUID idCliente, UUID idPedido) {
		log.info("[start] PedidoController - getPedidoDoClienteComId");
		log.info("[idCliente] {}", idCliente);
		PedidoClienteDetalhadoResponse pedido = pedidoService.buscaPedidoDoClienteComID(idCliente, idPedido);
		log.info("[finish] PedidoController - getPedidoDoClienteComId");
		return pedido;
	}

}
