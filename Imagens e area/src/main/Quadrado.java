package main;

public class Quadrado {

	private double lado;
	private String nome;


	public void setLado(double lado) {
		if (lado > 0) {
			this.lado = lado;
		}
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public double calculaArea() {
		double area = lado * lado;

		return area;
	}
	
	public void desenhar() {
		for (int i = 0; i < lado; i++) {
			for (int j = 0; j < lado; j++) {
				System.out.print(". ");
			}

			System.out.println();
		}
	}
}