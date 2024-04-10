package br.com.rpoffo;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.rpoffo.dao.CarroDao;
import br.com.rpoffo.dao.ICarroDao;
import br.com.rpoffo.domain.Carro;

public class CarroTest {
    
    private ICarroDao carroDao;
    
    public CarroTest() {
        carroDao = new CarroDao();
    }
    
    @Test
    public void cadastrar() {
        Carro carro = new Carro();
        carro.setModelo("Fiesta");
        carro = carroDao.cadastrar(carro);
        
        assertNotNull(carro);
        assertNotNull(carro.getId());
    }
}
