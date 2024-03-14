package br.com.rpoffo;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import java.util.List;

public class testTest {

    @Test
    public void testFiltrarGeneroFeminino() {
        ListaPessoas listaPessoas = new ListaPessoas();
        List<Pessoa> mulheres = listaPessoas.filtrarGeneroFeminino();

        for (Pessoa pessoa : mulheres) {
            assertTrue("O gênero da pessoa não é feminino", pessoa.getGenero().equalsIgnoreCase("Feminino"));
        }   
    }
}