package dev.wakandaacademy.cliente_pedido.cliente.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.validator.constraints.br.CPF;

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
    private String cpf;
    @NotBlank
    @Email
    private String email;

    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime getDataHoraDaUltimaAlteracao;
    
	public Cliente(UUID idCliente, @NotBlank String nomeCompleto, @NotBlank String endereco, @NotBlank String celular,
			@NotBlank @CPF String cpf, @NotBlank @Email String email) {
		this.nomeCompleto = nomeCompleto;
		this.endereco = endereco;
		this.celular = celular;
		this.cpf = cpf;
		this.email = email;
		this.dataHoraDoCadastro = LocalDateTime.now();
	}
	
    
}

