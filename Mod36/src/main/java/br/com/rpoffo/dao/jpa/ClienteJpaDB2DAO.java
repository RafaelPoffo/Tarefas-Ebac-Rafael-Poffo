/**
 * 
 */
package br.com.rpoffo.dao.jpa;

import br.com.rpoffo.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.rpoffo.domain.jpa.ClienteJpa;

/**
 * 
 *
 */
public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
