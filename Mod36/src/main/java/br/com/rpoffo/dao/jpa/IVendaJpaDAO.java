/**
 * 
 */
package br.com.rpoffo.dao.jpa;

import br.com.rpoffo.dao.generic.jpa.IGenericJapDAO;
import br.com.rpoffo.domain.jpa.VendaJpa;
import br.com.rpoffo.exceptions.DAOException;
import br.com.rpoffo.exceptions.TipoChaveNaoEncontradaException;

/**
 * 
 *
 */
public interface IVendaJpaDAO extends IGenericJapDAO<VendaJpa, Long>{

	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public VendaJpa consultarComCollection(Long id);
}
