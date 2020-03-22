package com.testing.desarrollo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testing.desarrollo.model.entity.Cliente;
import com.testing.desarrollo.model.service.IClienteService;

@RestController
@RequestMapping("/api")
public class ClienteRestController {

	@Autowired
	IClienteService clienteService;
	
    @RequestMapping("/token")
    public String getToken(){
        return JWTUtil.getJWTToken();
    }

	
	@GetMapping("/test")
	public String welcome() {
		return "Welcome to java techie";
	}

	@GetMapping("/clientes")
	public Iterable<Cliente> index() {
		return clienteService.findAll();

	}

}
