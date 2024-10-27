package dev.wakandaacademy.cliente_pedido.cliente.application.api;

import java.util.List;
import java.util.UUID;

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

	@Override
	public List<ClienteListResponse> getTodosClientes() {
		log.info("[start] ClienteController  - getTodosClientes");
		List<ClienteListResponse> clientes = clienteService.buscaTodosClientes();
		log.info("[finish] ClienteController  - getTodosClientes");
		return clientes;
	}

	@Override
	public ClienteDetalhadoResponse getClienteAtravesId(UUID idCliente) {
		log.info("[start] ClienteController  - getClienteAtravesId");
		log.info("[idCliente] {}", idCliente);
		log.info("[finish] ClienteController  - getClienteAtravesId");
		ClienteDetalhadoResponse clienteDetalhado = clienteService.buscaClienteAtravesId(idCliente);
		return clienteDetalhado ;
	}

	@Override
	public void deletaClienteAtravesId(UUID idCliente) {
		log.info("[start] ClienteController  - deletaClienteAtravesId");
		log.info("[idCliente] {}", idCliente);
		clienteService.deletaClienteAtravesId(idCliente);
		log.info("[start] ClienteController  - deletaClienteAtravesId");
		
	}

}
