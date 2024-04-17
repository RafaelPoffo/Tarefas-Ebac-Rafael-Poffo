/**
 * 
 */
package br.com.rpoffo.services.generic;

import java.io.Serializable;
import java.util.Collection;

import br.com.rpoffo.domain.Persistente;
import br.com.rpoffo.exceptions.DAOException;
import br.com.rpoffo.exceptions.MaisDeUmRegistroException;
import br.com.rpoffo.exceptions.TableException;
import br.com.rpoffo.exceptions.TipoChaveNaoEncontradaException;

/**
 * 
 *
 */
public interface IGenericService <T extends Persistente, E extends Serializable> {
	
    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public void excluir(T entity) throws DAOException;

    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException;

    public Collection<T> buscarTodos() throws DAOException;

}
