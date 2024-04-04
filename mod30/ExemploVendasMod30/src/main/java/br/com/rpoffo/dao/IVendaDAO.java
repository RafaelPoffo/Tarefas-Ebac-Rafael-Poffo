/**
 * 
 */
package br.com.rpoffo.dao;

import br.com.rpoffo.dao.generic.IGenericDAO;
import br.com.rpoffo.domain.Venda;
import br.com.rpoffo.exceptions.DAOException;
import br.com.rpoffo.exceptions.TipoChaveNaoEncontradaException;

/**
 * 
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
