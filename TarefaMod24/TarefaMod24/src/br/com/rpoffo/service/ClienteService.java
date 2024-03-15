package br.com.rpoffo.service;

import br.com.rpoffo.dao.ClienteDao;
import br.com.rpoffo.dao.ClienteDaoMock;
import br.com.rpoffo.dao.IClienteDao;

public class ClienteService {
    private IClienteDao clienteDao;
    public ClienteService(IClienteDao clienteDao){
        //clienteDao = new ClienteDao();
        //clienteDao = new ClienteDaoMock();
        this.clienteDao = clienteDao;
    }
    public String salvar(){
        clienteDao.salvar();
        return "Sucesso";
    }
    public String buscar(){
        clienteDao.buscar();
        return "Sucesso";
    }
    public String excluir(){
        clienteDao.excluir();
        return "Sucesso";
    }
    public String atualizar(){
        clienteDao.atualizar();
        return "Sucesso";
    }
}
