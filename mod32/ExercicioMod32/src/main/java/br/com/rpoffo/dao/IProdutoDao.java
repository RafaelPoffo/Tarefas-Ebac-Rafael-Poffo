package br.com.rpoffo.dao;

import java.util.List;

import br.com.rpoffo.domain.Produto;

public interface IProdutoDao {

    Produto cadastrar(Produto produto);

    void excluir(Produto produto);

    List<Produto> buscarTodos();
}
