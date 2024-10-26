package dev.wakandaacademy.cliente_pedido.cliente.application.api;

import java.util.List;
import java.util.UUID;

import dev.wakandaacademy.cliente_pedido.cliente.domain.Cliente;

public class ClienteListResponse {
    private UUID idCliente;
    private String nomeCompleto;
    private String cpf;
    private String celular;
    private String email;
    
    public static List<ClienteListResponse> converte(List<Cliente> clientes) {
		return null;
	}

}
