package dev.wakandaacademy.cliente_pedido.cliente.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.validator.constraints.br.CPF;

import dev.wakandaacademy.cliente_pedido.cliente.application.api.ClienteAlteracaoRequest;
import dev.wakandaacademy.cliente_pedido.cliente.application.api.ClienteRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idCliente", updatable = false, unique = true, nullable = false)
    private UUID idCliente;
    @NotBlank
    private String nomeCompleto;
    @NotBlank
    private String endereco;
    @NotBlank
    private String celular;
    @NotBlank
    @CPF
    @Column(unique = true)
    private String cpf;
    @NotBlank
    @Email
    @Column(unique = true)
    private String email;

    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime getDataHoraDaUltimaAlteracao;

	public Cliente(ClienteRequest clienteRequest) {
		this.nomeCompleto = clienteRequest.getNomeCompleto();
		this.endereco = clienteRequest.getEndereco();
		this.celular = clienteRequest.getCelular();
		this.cpf = clienteRequest.getCpf();
		this.email = clienteRequest.getEmail();
		this.dataHoraDoCadastro = LocalDateTime.now();
	}

	public void altera(ClienteAlteracaoRequest clienteRequest) {
		this.nomeCompleto = clienteRequest.getNomeCompleto();
		this.endereco = clienteRequest.getEndereco();
		this.celular = clienteRequest.getCelular();
		this.getDataHoraDaUltimaAlteracao = LocalDateTime.now();
		
	}	
    
}

