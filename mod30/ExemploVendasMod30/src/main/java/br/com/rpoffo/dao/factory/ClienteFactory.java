/**
 * 
 */
package br.com.rpoffo.dao.factory;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.rpoffo.domain.Cliente;

/**
 * 
 *
 */
public class ClienteFactory {

	public static Cliente convert(ResultSet rs) throws SQLException {
		Cliente cliente = new Cliente();
		cliente.setId(rs.getLong("ID_CLIENTE"));
		cliente.setNome(rs.getString(("NOME")));
		cliente.setCpf(rs.getLong(("CPF")));
		cliente.setTel(rs.getLong(("TEL")));
		cliente.setCep(rs.getLong(("CEP")));
		cliente.setEnd(rs.getString(("ENDERECO")));
		cliente.setNumero(rs.getInt(("NUMERO")));
		cliente.setCidade(rs.getString(("CIDADE")));
		cliente.setEstado(rs.getString(("ESTADO")));
		return cliente;
	}
}
