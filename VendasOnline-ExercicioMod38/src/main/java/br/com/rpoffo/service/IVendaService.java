/**
 * 
 */
package br.com.rpoffo.service;

import br.com.rpoffo.dao.generic.IGenericDAO;
import br.com.rpoffo.domain.Venda;
import br.com.rpoffo.exceptions.DAOException;
import br.com.rpoffo.exceptions.TipoChaveNaoEncontradaException;

/**
 * 
 *
 */
public interface IVendaService extends IGenericDAO<Venda, Long>{

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

	public Venda consultarComCollection(Long id);

}
