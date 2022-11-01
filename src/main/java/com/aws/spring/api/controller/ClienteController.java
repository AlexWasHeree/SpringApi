package com.aws.spring.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aws.spring.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setEmail("teste@teste.com");
		cliente1.setNome("teste");
		cliente1.setTelefone("123123");
		
		Cliente cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setEmail("teste2@teste2.com");
		cliente2.setNome("teste2");
		cliente2.setTelefone("22222");
		
		return Arrays.asList(cliente1, cliente2);
	}
}
