/**
 * 
 */
package br.com.rpoffo.services;

import br.com.rpoffo.dao.IProdutoDAO;
import br.com.rpoffo.domain.Produto;
import br.com.rpoffo.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
