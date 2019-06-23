package com.testing.desarrollo.model.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.testing.desarrollo.model.Dao.IClienteDao;
import com.testing.desarrollo.model.entity.Cliente;
@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteDao clienteDao;//Inyectamos CrudRepository desde IClienteDao

	@Override
	@Transactional(readOnly = true) // sobro escribe la transaccion de CrudRepository
	//para hacerlo de una forma mas explicita
	public Iterable<Cliente> findAll() {
		return clienteDao.findAll();
	}

}
