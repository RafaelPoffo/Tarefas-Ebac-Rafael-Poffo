/**
 * 
 */
package br.com.rpoffo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.Instant;
import java.util.List;

import org.junit.After;
import org.junit.Test;

import br.com.rpoffo.dao.ProdutoDao;
import br.com.rpoffo.dao.IProdutoDao;
import br.com.rpoffo.dao.IVendaDao;
import br.com.rpoffo.dao.VendaDao;
import br.com.rpoffo.domain.Produto;
import br.com.rpoffo.domain.Venda;

/**
 * 
 */
public class VendaTest {

    private IVendaDao vendaDao;

    private IProdutoDao produtoDao;

    public VendaTest() {
        vendaDao = new VendaDao();
        produtoDao = new ProdutoDao();
    }

    @After
    public void end() {
        List<Venda> list = vendaDao.buscarTodos();
        list.forEach(venda -> vendaDao.excluir(venda));

        List<Produto> listProdutos = produtoDao.buscarTodos();
        listProdutos.forEach(produto -> produtoDao.excluir(produto));
    }

    @Test
    public void cadastrar() {
        Produto produto = criarProduto("A1");
        Venda venda = new Venda();
        venda.setCodigo("A1");
        venda.setDataVenda(Instant.now());
        venda.setStatus("ATIVA");
        venda.setValor(2000d);
        venda.setProduto(produto);
        venda = vendaDao.cadastrar(venda);

        assertNotNull(venda);
        assertNotNull(venda.getId());
    }

    @Test
    public void pesquisarPorProduto() {
        Produto produto = criarProduto("A1");
        Venda venda = new Venda();
        venda.setCodigo("A1");
        venda.setDataVenda(Instant.now());
        venda.setStatus("ATIVA");
        venda.setValor(2000d);
        venda.setProduto(produto);
        venda = vendaDao.cadastrar(venda);

        assertNotNull(venda);
        assertNotNull(venda.getId());

        Venda vendaBD = vendaDao.buscarPorProduto(produto);
        assertNotNull(vendaBD);
        assertEquals(venda.getId(), vendaBD.getId());
    }

    @Test
    public void pesquisarPorCodigoProduto() {
        Produto produto = criarProduto("A1");
        Venda venda = new Venda();
        venda.setCodigo("A1");
        venda.setDataVenda(Instant.now());
        venda.setStatus("ATIVA");
        venda.setValor(2000d);
        venda.setProduto(produto);
        venda = vendaDao.cadastrar(venda);

        assertNotNull(venda);
        assertNotNull(venda.getId());

        Venda vendaBD = vendaDao.buscarPorCodigoProduto(produto.getCodigo());
        assertNotNull(vendaBD);
        assertEquals(venda.getId(), vendaBD.getId());
    }

    @Test
    public void pesquisarPorCodigoProdutoCriteria() {
        Produto produto = criarProduto("A1");
        Venda venda = new Venda();
        venda.setCodigo("A1");
        venda.setDataVenda(Instant.now());
        venda.setStatus("ATIVA");
        venda.setValor(2000d);
        venda.setProduto(produto);
        venda = vendaDao.cadastrar(venda);

        assertNotNull(venda);
        assertNotNull(venda.getId());

        Venda vendaBD = vendaDao.buscarPorCodigoProdutoCriteria(produto.getCodigo());
        assertNotNull(vendaBD);
        assertEquals(venda.getId(), vendaBD.getId());
    }

    @Test
    public void pesquisarPorProdutoCriteria() {
        Produto produto = criarProduto("A1");
        Venda venda = new Venda();
        venda.setCodigo("A1");
        venda.setDataVenda(Instant.now());
        venda.setStatus("ATIVA");
        venda.setValor(2000d);
        venda.setProduto(produto);
        venda = vendaDao.cadastrar(venda);

        assertNotNull(venda);
        assertNotNull(venda.getId());

        Venda vendaBD = vendaDao.buscarPorProdutoCriteria(produto);
        assertNotNull(vendaBD);
        assertEquals(venda.getId(), vendaBD.getId());
    }

    private Produto criarProduto(String codigo) {
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setDescricao("Produto TESTE");
        produto.setNome("Produto de Teste");
        return produtoDao.cadastrar(produto);
    }
}