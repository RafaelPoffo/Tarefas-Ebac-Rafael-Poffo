/**
 * 
 */
package br.com.rpoffo.dao;

import java.util.List;

import br.com.rpoffo.dao.generic.IGenericDAO;
import br.com.rpoffo.domain.Produto;

/**
 * 
 *
 */
public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}
