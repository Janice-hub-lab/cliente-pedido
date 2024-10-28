package dev.wakandaacademy.cliente_pedido.pedido.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import dev.wakandaacademy.cliente_pedido.cliente.application.service.ClienteService;
import dev.wakandaacademy.cliente_pedido.pedido.application.api.PedidoClienteDetalhadoResponse;
import dev.wakandaacademy.cliente_pedido.pedido.application.api.PedidoClienteListResponse;
import dev.wakandaacademy.cliente_pedido.pedido.application.api.PedidoRequest;
import dev.wakandaacademy.cliente_pedido.pedido.application.api.PedidoResponse;
import dev.wakandaacademy.cliente_pedido.pedido.domain.Pedido;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class PedidoApplicationService implements PedidoService {
	private final ClienteService clienteService;
	private final PedidoRepository pedidoRepository;

	@Override
	public PedidoResponse criaPedido(UUID idCliente, @Valid PedidoRequest pedidoRequest) {
		log.info("[start] PedidoApplicationService - criaPedido");
		clienteService.buscaClienteAtravesId(idCliente);
		Pedido pedido = pedidoRepository.salvaPedido(new Pedido(idCliente, pedidoRequest));
		log.info("[finish] PedidoApplicationService - criaPedido");
		return new PedidoResponse(pedido.getIdPedido());
	}

	@Override
	public List<PedidoClienteListResponse> buscaPedidosDoClienteComId(UUID idCliente) {
		log.info("[start] PedidoApplicationService - buscaPedidosDoClienteComId");
		clienteService.buscaClienteAtravesId(idCliente);
		List<Pedido> pedidosDoCliente = pedidoRepository.buscaPedidosDoClienteComId(idCliente);
		log.info("[finish] PedidoApplicationService - buscaPedidosDoClienteComId");
		return PedidoClienteListResponse.converte(pedidosDoCliente);
	}

	@Override
	public PedidoClienteDetalhadoResponse buscaPedidoDoClienteComID(UUID idCliente, UUID idPedido) {
		log.info("[start] PedidoApplicationService - buscaPedidoDoClienteComID");
		clienteService.buscaClienteAtravesId(idCliente);
		Pedido pedido = pedidoRepository.buscaPedidoPeloId(idPedido);
		log.info("[finish] PedidoApplicationService - buscaPedidoDoClienteComID");
		return null;
	}

}
