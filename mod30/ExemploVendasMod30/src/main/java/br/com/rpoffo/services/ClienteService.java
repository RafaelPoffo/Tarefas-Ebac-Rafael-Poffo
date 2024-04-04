/**
 * 
 */
package br.com.rpoffo.services;

import br.com.rpoffo.dao.IClienteDAO;
import br.com.rpoffo.domain.Cliente;
import br.com.rpoffo.exceptions.DAOException;
import br.com.rpoffo.exceptions.MaisDeUmRegistroException;
import br.com.rpoffo.exceptions.TableException;
import br.com.rpoffo.exceptions.TipoChaveNaoEncontradaException;
import br.com.rpoffo.services.generic.GenericService;

/**
 * 
 *
 */
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	
	//private IClienteDAO clienteDAO;
	
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
		//this.clienteDAO = clienteDAO;
	}

//	@Override
//	public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
//		return clienteDAO.cadastrar(cliente);
//	}

	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

//	@Override
//	public void excluir(Long cpf) {
//		clienteDAO.excluir(cpf);
//	}
//
//	@Override
//	public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException{
//		clienteDAO.alterar(cliente);
//	}

}
