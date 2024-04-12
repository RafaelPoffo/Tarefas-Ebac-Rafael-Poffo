/**
 * 
 */
package br.com.rpoffo.dao.jpa;

import br.com.rpoffo.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.rpoffo.domain.jpa.ClienteJpa;

/**
 * 
 *
 */
public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
