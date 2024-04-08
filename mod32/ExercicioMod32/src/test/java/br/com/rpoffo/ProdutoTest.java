/**
 * 
 */
package br.com.rpoffo;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.rpoffo.dao.ProdutoDao;
import br.com.rpoffo.dao.IProdutoDao;
import br.com.rpoffo.domain.Produto;

/**
 * 
 *
 */
public class ProdutoTest {

    private IProdutoDao produtoDao;

    public ProdutoTest() {
        produtoDao = new ProdutoDao();
    }

    @Test
    public void cadastrar() {
        Produto produto = new Produto();
        produto.setCodigo("A1");
        produto.setDescricao("Produto TESTE");
        produto.setNome("Produto de Teste");
        produto = produtoDao.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());
    }
}