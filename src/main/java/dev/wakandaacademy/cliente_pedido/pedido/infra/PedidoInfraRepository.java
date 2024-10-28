package dev.wakandaacademy.cliente_pedido.pedido.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import dev.wakandaacademy.cliente_pedido.pedido.application.service.PedidoRepository;
import dev.wakandaacademy.cliente_pedido.pedido.domain.Pedido;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class PedidoInfraRepository implements PedidoRepository {
	private final PedidoSpringDataJPARepository pedidoSpringDataJPARepository;

	@Override
	public Pedido salvaPedido(Pedido pedido) {
		log.info("[start] PedidoInfraRepository - salvaPedido");
		pedidoSpringDataJPARepository.save(pedido);
		log.info("[finish] PedidoInfraRepository - salvaPedido");
		return pedido;
	}

	@Override
	public List<Pedido> buscaPedidosDoClienteComId(UUID idCliente) {
		log.info("[start] PedidoInfraRepository - buscaPedidosDoClienteComId");
		var pedidos = pedidoSpringDataJPARepository.findByIdCliente(idCliente);
		log.info("[finish] PedidoInfraRepository - buscaPedidosDoClienteComId");
		return pedidos;
	}

}
