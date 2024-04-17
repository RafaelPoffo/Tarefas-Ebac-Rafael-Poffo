/**
 * 
 */
package br.com.rpoffo.dao;

import java.util.List;

import br.com.rpoffo.dao.generic.IGenericDAO;
import br.com.rpoffo.domain.Cliente;

/**
 * 
 *
 */
public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}
