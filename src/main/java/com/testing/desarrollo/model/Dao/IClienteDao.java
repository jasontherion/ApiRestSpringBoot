package com.testing.desarrollo.model.Dao;

import org.springframework.data.repository.CrudRepository;

import com.testing.desarrollo.model.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
