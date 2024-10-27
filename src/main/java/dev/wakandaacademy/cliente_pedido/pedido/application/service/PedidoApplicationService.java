package dev.wakandaacademy.cliente_pedido.pedido.application.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import dev.wakandaacademy.cliente_pedido.pedido.application.api.PedidoRequest;
import dev.wakandaacademy.cliente_pedido.pedido.application.api.PedidoResponse;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class PedidoApplicationService implements PedidoService {

	@Override
	public PedidoResponse criaPedido(UUID idCliente, @Valid PedidoRequest pedidoRequest) {
		log.info("[start] PedidoApplicationService - criaPedido");
		//clienteService.buscaClienteAtravesId(idCliente);
		//Pedido pedido = pedidoRepository.salvaPedido(new Pedido(idCliente, pedidoRequest));
		log.info("[finish] PedidoApplicationService - criaPedido");
		return null;
	}

}
