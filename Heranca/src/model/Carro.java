package model;

public class Carro extends Veiculo {

	private int numPortas;
	public Carro(String marca, String modelo, int numPortas) {
		super(marca,modelo);

	}
	public int getNumPortas() {
		return this.numPortas;
	}
	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	//@override
	public String dadosFormatados() {
		String dadosVeiculo = super.dadosFormatados();
		String dadosCarro = String.format("Transmissão: %d\n", this.numPortas);
		return dadosVeiculo + dadosCarro;
	}
}
