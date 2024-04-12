/**
 * 
 */
package br.com.rpoffo.dao.jpa;

import br.com.rpoffo.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.rpoffo.domain.jpa.ProdutoJpa;

/**
 * 
 *
 */
public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
