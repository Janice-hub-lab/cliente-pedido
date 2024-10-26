package dev.wakandaacademy.cliente_pedido.cliente.application.api;

import org.springframework.web.bind.annotation.RestController;

import dev.wakandaacademy.cliente_pedido.cliente.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ClienteController implements ClienteAPI {
	private final ClienteService clienteService;

	@Override
	public ClienteResponse postCliente(ClienteRequest clienteRequest) {
		log.info("[start] ClienteController  - postCliente");
		ClienteResponse clienteCriado = clienteService.criaCliente(clienteRequest);
	    log.info("[finish] ClienteController  - postCliente");
		return clienteCriado;
	}

}
