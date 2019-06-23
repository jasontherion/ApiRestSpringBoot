package com.testing.desarrollo.model.service;



import com.testing.desarrollo.model.entity.Cliente;

public interface IClienteService { //Aqui llamamos los metodos del
//CrudRepository que utilizare
	
	public Iterable<Cliente> findAll();
}
