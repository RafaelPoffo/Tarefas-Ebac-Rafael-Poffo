package br.com.rpoffo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.rpoffo.dao.ClienteDAO;
import br.com.rpoffo.dao.IClienteDAO;
import br.com.rpoffo.dao.IProdutoDAO;
import br.com.rpoffo.dao.ProdutoDAO;
import br.com.rpoffo.domain.Cliente;
import br.com.rpoffo.domain.Produto;

/**
 * 
 */
public class ClienteTest {
    @Test
    public void cadastrarTest() throws Exception {
        IClienteDAO dao = new ClienteDAO();
        
        Cliente cliente = new Cliente();
        cliente.setCodigo("01");
        cliente.setNome("Rafael Poffo");
        Integer qtd = dao.cadastrar(cliente);
        assertTrue(qtd == 1);
        
        Cliente clienteBD = dao.consultar(cliente.getCodigo());
        assertNotNull(clienteBD);
        assertNotNull(clienteBD.getId());
        assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        assertEquals(cliente.getNome(), clienteBD.getNome());
        
        // Integer qtdDel = dao.excluir(clienteBD);
        // assertNotNull(qtdDel);
        
        clienteBD.setNome("Julia Prado");
        Integer qtdAtualizacao = dao.atualizar(clienteBD);
        assertTrue(qtdAtualizacao == 1);
        
        Cliente clienteAtualizado = dao.consultar(cliente.getCodigo());
        assertNotNull(clienteAtualizado);
        assertEquals("Julia Prado", clienteAtualizado.getNome());
    }@Test
    public void cadastrarProdutoTest() throws Exception {
        IProdutoDAO dao = new ProdutoDAO();
        
        Produto produto = new Produto();
        produto.setCodigo("02");
        produto.setNome("Memória RAM");
        Integer qtd = dao.cadastrar(produto);
        assertTrue(qtd == 1);
        
        Produto produtoBD = dao.consultar(produto.getCodigo());
        assertNotNull(produtoBD);
        assertNotNull(produtoBD.getId());
        assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        assertEquals(produto.getNome(), produtoBD.getNome());
        
        produtoBD.setNome("Placa de Vídeo");
        Integer qtdAtualizacao = dao.atualizar(produtoBD);
        assertTrue(qtdAtualizacao == 1);
        
        Produto produtoAtualizado = dao.consultar(produto.getCodigo());
        assertNotNull(produtoAtualizado);
        assertEquals("Placa de Vídeo", produtoAtualizado.getNome());
    }
}