package br.ufg.inf.model.dao;

import java.sql.Connection;
import java.util.List;

import br.ufg.inf.model.entidade.Carro;

public class CarroDao {
	
	Connection conn;
	
	public CarroDao(Connection conn) {
		this.conn = conn;
	}
	
	public List<Carro> lista(){
		return BancoProvisorio.carros;
	}
	
	public Carro procurarPorPlaca(String placa) {
		Carro carro = null;
		for(Carro c : BancoProvisorio.carros) {
			if(c.getPlaca().equals(placa)) {
				carro = c;
				break;
			}
		}
		return carro;
	}
	
	public Carro inserir(Carro carro) {
		BancoProvisorio.carros.add(carro);
		return carro;
	}

	public Carro excluir(Carro carro) {
		BancoProvisorio.carros.remove(carro);		
		return carro;
	}
	
	public Carro alterar(Carro carro) {
		for(Carro c : BancoProvisorio.carros) {
			if(c.getPlaca().equals(carro.getPlaca())) {
				BancoProvisorio.carros.remove(c);
				BancoProvisorio.carros.add(carro);
				break;
			}
		}
		return carro;
	}

}
