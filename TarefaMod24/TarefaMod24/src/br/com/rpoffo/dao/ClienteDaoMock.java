package br.com.rpoffo.dao;

public class ClienteDaoMock implements IClienteDao{
    @Override
    public String salvar() {
        return "Sucesso";
    }
    public String buscar() {
        return "Sucesso";
    }
    public String excluir() {
        return "Sucesso";
    }
    public String atualizar() {
        return "Sucesso";
    }
}
