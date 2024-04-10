package br.com.rpoffo;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.rpoffo.dao.AcessorioDao;
import br.com.rpoffo.dao.IAcessorioDao;
import br.com.rpoffo.domain.Acessorio;

public class AcessorioTest {
    
    private IAcessorioDao acessorioDao;
    
    public AcessorioTest() {
        acessorioDao = new AcessorioDao();
    }
    
    @Test
    public void cadastrar() {
        Acessorio acessorio = new Acessorio();
        acessorio.setNome("Airbag");
        acessorio = acessorioDao.cadastrar(acessorio);
        
        assertNotNull(acessorio);
        assertNotNull(acessorio.getId());
    }
}
