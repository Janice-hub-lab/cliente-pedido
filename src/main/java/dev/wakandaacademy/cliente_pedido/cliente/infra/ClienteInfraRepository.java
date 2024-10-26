package dev.wakandaacademy.cliente_pedido.cliente.infra;

import org.springframework.stereotype.Repository;

import dev.wakandaacademy.cliente_pedido.cliente.application.repository.ClienteRepository;
import dev.wakandaacademy.cliente_pedido.cliente.domain.Cliente;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
public class ClienteInfraRepository implements ClienteRepository {

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[start] ClienteInfraRepository - salva");
		log.info("[finish] ClienteInfraRepository - salva");
		return cliente;
	}

}
