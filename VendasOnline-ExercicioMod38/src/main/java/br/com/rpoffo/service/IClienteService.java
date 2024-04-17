/**
 * 
 */
package br.com.rpoffo.service;

import java.util.List;

import br.com.rpoffo.domain.Cliente;
import br.com.rpoffo.exceptions.DAOException;
import br.com.rpoffo.services.generic.IGenericService;

/**
 * 
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
