package br.ufg.inf.model.entidade;

public class Modelo {
	private String nomeModelo;
	private int modeloId;
	private Fabricante fabricante;
	public Modelo(String nomeModelo, int modeloId, Fabricante fabricante) {
		super();
		this.nomeModelo = nomeModelo;
		this.modeloId = modeloId;
		this.fabricante = fabricante;
	}
	public String getNomeModelo() {
		return nomeModelo;
	}
	public void setNomeModelo(String nomeModelo) {
		this.nomeModelo = nomeModelo;
	}
	public int getModeloId() {
		return modeloId;
	}
	public void setModeloId(int modeloId) {
		this.modeloId = modeloId;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	@Override
	public String toString() {
		return "Modelo =" + nomeModelo + ", " + fabricante ;
	}
	
}
