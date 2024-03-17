/**
 * 
 */
package br.com.rpoffo.services;

import br.com.rpoffo.dao.IClienteDAO;
import br.com.rpoffo.domain.Cliente;
import br.com.rpoffo.exceptions.TipoChaveNaoEncontradaException;
import br.com.rpoffo.services.generic.GenericService;


public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

	
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
		
	}



	@Override
	public Cliente buscarPorCPF(Long cpf) {
		return this.dao.consultar(cpf);
	}

}
