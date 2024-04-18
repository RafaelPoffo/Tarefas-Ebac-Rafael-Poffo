/**
 * 
 */
package br.com.rpoffo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rpoffo.domain.Cliente;

/**
 * 
 *
 */
@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long>{

}
