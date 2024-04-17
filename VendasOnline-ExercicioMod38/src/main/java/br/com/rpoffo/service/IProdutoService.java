/**
 * 
 */
package br.com.rpoffo.service;

import java.util.List;

import br.com.rpoffo.domain.Produto;
import br.com.rpoffo.services.generic.IGenericService;

/**
 * 
 *
 */
public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
