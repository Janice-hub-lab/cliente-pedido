package dev.wakandaacademy.cliente_pedido.entrega.infra;

import org.springframework.stereotype.Repository;

import dev.wakandaacademy.cliente_pedido.entrega.application.service.EntregaRepository;
import dev.wakandaacademy.cliente_pedido.entrega.domain.Entrega;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class EntregaInfraRepository implements EntregaRepository {
	private final EntregaSpringDataJPARepository entregaSpringDataJPARepository;

	@Override
	public Entrega salvaEntrega(Entrega entrega) {
		log.info("[start] EntregaInfraRepository - salvaEntrega");
		entregaSpringDataJPARepository.save(entrega);
		log.info("[finish] EntregaInfraRepository - salvaEntrega");
		return entrega;
	}

}
