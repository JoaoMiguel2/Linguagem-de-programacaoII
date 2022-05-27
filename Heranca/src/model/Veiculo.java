package model;

public class Veiculo {
	
	private String marca;
	private String modelo;
	
	public Veiculo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return this.marca;
	}
	
	public String modelo() {
		return this.modelo;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return this.marca;
	}
	
	public String dadosFormatados() {
		return String.format("Marca %s\nModelo %s\n", this.marca, this.modelo);
	}
}
