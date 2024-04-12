/**
 * 
 */
package br.com.rpoffo.dao.jpa;

import br.com.rpoffo.dao.generic.jpa.IGenericJapDAO;
import br.com.rpoffo.domain.jpa.Persistente;

/**
 * 
 *
 */
public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
