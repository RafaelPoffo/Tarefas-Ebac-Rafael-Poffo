package br.com.rpoffo.dao;

import java.util.List;

import br.com.rpoffo.domain.Produto;
import br.com.rpoffo.domain.Venda;

public interface IVendaDao {

    Venda cadastrar(Venda venda);

    List<Venda> buscarTodos();

    void excluir(Venda venda);
}
