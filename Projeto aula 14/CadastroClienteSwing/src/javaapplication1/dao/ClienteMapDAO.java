package javaapplication1.dao;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;
import javaapplication1.domain.Cliente;

public class ClienteMapDAO implements IClienteDAO{

    private Map<Long, Cliente> map;

    public ClienteMapDAO(){
        map = new TreeMap<>();
    }

    @java.lang.Override
    public java.lang.Boolean cadastrar(Cliente cliente) {
        if(map.containsKey(cliente.getCpf())){
            return false;
        }
        this.map.put(cliente.getCpf(), cliente);
        return true;
    }

    @java.lang.Override
    public void alterar(Cliente cliente) {
        Cliente clienteCadastrado = map.get(cliente.getCpf());
        if (clienteCadastrado != null) {
            clienteCadastrado.setNome(cliente.getNome());
            clienteCadastrado.setTel(cliente.getTel());
            clienteCadastrado.setNumero(cliente.getNumero());
            clienteCadastrado.setEnd(cliente.getEnd());
            clienteCadastrado.setCidade(cliente.getCidade());
            clienteCadastrado.setEstado(cliente.getEstado());
        }
    }

    public Collection<Cliente> buscarTodos() {
        return map.values();
    }

    @java.lang.Override
    public Cliente consultar(java.lang.Long cpf) {
        return map.get(cpf);
    }

    @java.lang.Override
    public void excluir(java.lang.Long cpf) {
        Cliente clienteCadastrado = map.get(cpf);
        if (clienteCadastrado != null){
            map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
        }

    }
}
