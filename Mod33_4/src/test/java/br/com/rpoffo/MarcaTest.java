package br.com.rpoffo;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.rpoffo.dao.CarroDao;
import br.com.rpoffo.dao.ICarroDao;
import br.com.rpoffo.dao.IMarcaDao;
import br.com.rpoffo.dao.MarcaDao;
import br.com.rpoffo.domain.Carro;
import br.com.rpoffo.domain.Marca;

public class MarcaTest {
    
    private IMarcaDao marcaDao;
    
    private ICarroDao carroDao;
    
    public MarcaTest() {
        marcaDao = new MarcaDao();
        carroDao = new CarroDao();
    }
    
    @Test
    public void cadastrar() {
        Marca marca = new Marca();
        marca.setNome("Ford");
        marca = marcaDao.cadastrar(marca);
        
        assertNotNull(marca);
        assertNotNull(marca.getId());
        
        Carro carro = new Carro();
        carro.setModelo("Fiesta");
        carro.setMarca(marca);
        carro = carroDao.cadastrar(carro);
        
        assertNotNull(carro);
        assertNotNull(carro.getId());
    }
}
