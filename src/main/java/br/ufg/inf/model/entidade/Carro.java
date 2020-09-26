package br.ufg.inf.model.entidade;

import java.io.Serializable;

import br.ufg.inf.model.enumerador.TipoCarro;

//@Entity
public class Carro implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Fabricante fabricante;
	private Integer idCarro;
	private TipoCarro tipo;
	private String placa;
	private int ano;
	private String cor;
	private Modelo modelo;
	
	public Carro() {
		
	}
	
	public Carro(Fabricante fabricante, Integer idCarro, TipoCarro tipo, String placa, int ano, String cor,
			Modelo modelo) {
		super();
		this.fabricante = fabricante;
		this.idCarro = idCarro;
		this.tipo = tipo;
		this.placa = placa;
		this.ano = ano;
		this.cor = cor;
		this.modelo = modelo;
	}
	
	
	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public Integer getIdCarro() {
		return idCarro;
	}

	public void setIdCarro(Integer idCarro) {
		this.idCarro = idCarro;
	}

	public TipoCarro getTipo() {
		return tipo;
	}
	public void setTipo(TipoCarro tipo) {
		this.tipo = tipo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Modelo getModelo() {
		return modelo;
	}
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	@Override
	public String toString() {
		return "Carro [tipo=" + tipo + ", placa=" + placa + ", ano=" + ano + ", cor=" + cor + ", modelo=" + modelo
				+ "]";
	}
	
}
