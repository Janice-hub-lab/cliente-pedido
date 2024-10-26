package dev.wakandaacademy.cliente_pedido.cliente.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.wakandaacademy.cliente_pedido.cliente.application.api.ClienteListResponse;
import dev.wakandaacademy.cliente_pedido.cliente.application.api.ClienteRequest;
import dev.wakandaacademy.cliente_pedido.cliente.application.api.ClienteResponse;
import dev.wakandaacademy.cliente_pedido.cliente.application.repository.ClienteRepository;
import dev.wakandaacademy.cliente_pedido.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {
	private final ClienteRepository clienteRepository;

	@Override
	public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
		log.info("[start] ClienteApplicationService - criaCliente");
		Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[finish] ClienteApplicationService - criaCliente");
		return ClienteResponse.builder()
				.idCliente(cliente.getIdCliente()).build();
	}

	@Override
	public List<ClienteListResponse> buscaTodosClientes() {
		log.info("[start] ClienteApplicationService - buscaTodosClientes");
		List<Cliente> clientes = clienteRepository.buscaTodosClientes();
		log.info("[finish] ClienteApplicationService - buscaTodosClientes");
		return ClienteListResponse.converte(clientes);
	}

}
