package br.ufg.inf.model.dao;

import java.util.List;

import br.ufg.inf.model.entidade.Modelo;

public class ModeloDao {
	
	public List<Modelo> lista(){
		return BancoProvisorio.mdelos;
	}
	
	public Modelo procurarPorId(int id) {
		Modelo modelo = null;
		
		return modelo;
	}
	
	public Modelo inserir(Modelo modelo) {
		BancoProvisorio.mdelos.add(modelo);
		return modelo;
	}

	public Modelo excluir(Modelo modelo) {
		BancoProvisorio.mdelos.remove(modelo);		
		return modelo;
	}
	
	

}