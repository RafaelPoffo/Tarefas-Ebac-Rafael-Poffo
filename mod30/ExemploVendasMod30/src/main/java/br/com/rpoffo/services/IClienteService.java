/**
 * 
 */
package br.com.rpoffo.services;

import br.com.rpoffo.domain.Cliente;
import br.com.rpoffo.exceptions.DAOException;
import br.com.rpoffo.exceptions.TipoChaveNaoEncontradaException;
import br.com.rpoffo.services.generic.IGenericService;

/**
 * 
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
