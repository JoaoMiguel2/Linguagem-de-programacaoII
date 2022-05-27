package model;

public class Moto extends Veiculo {

	private String transmissao;
	
	public Moto(String marca, String modelo, String transmissao) {
		super(marca, modelo);
		this.transmissao = transmissao;
	}
	
	public String getTransmissao() {
		return this.transmissao;
	}
	public void setTransmissao(String transmissao) {
		this.transmissao = transmissao;
	}
	
	@Override
	public String dadosFormatados() {
		String dadosVeiculo = super.dadosFormatados();
		String dadosMoto = String.format("Transmissão: %s\n", this.transmissao);
		return dadosVeiculo + dadosMoto;
	}
}
