package main;

public class Circulo {
	
	private double raio;
	private String nome;


	public void setRaio(double raio) {
		if (raio > 0) {
			this.raio = raio;
		}
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public double calculaArea() {
	
	
		double area = Math.PI * Math.pow(raio, 2);

		return area;
	}

	public void desenhar() {
	
		double raioLocal = this.raio;


		if (raioLocal % 2 == 0)
			raioLocal = raioLocal + 1;
		


		final String VAZIO = "  ";
		final String CARACTER = ". ";
		
		double comprimento = raioLocal * 2;
		double percentualInicialEliminacao = 30.0;
		double percentualRestanteEliminacao = 100.0 - percentualInicialEliminacao;
		double percentualElimina = percentualInicialEliminacao;


		double elimina = Math.round(percentualElimina/100.0 * comprimento);
		for (int i = 0; i < raioLocal; i++) {
			for (int j = 0; j < comprimento; j++) {
				if (i % 2 == 1 || j < elimina || j >= comprimento - elimina) {
					System.out.print(VAZIO);
				} else {
					System.out.print(CARACTER);
				}
			}

			System.out.println();
			
			percentualElimina = percentualElimina - percentualRestanteEliminacao / raioLocal;
			elimina = Math.round(percentualElimina / 100.0 * comprimento);
		}
		

		elimina = 0;
		for (int i = 0; i < raioLocal + 1; i++) {
			for (int j = 0; j < comprimento; j++) {
				if (i % 2 == 0 || j < elimina || j >= comprimento - elimina) {
					System.out.print(VAZIO);
				} else {
					System.out.print(CARACTER);
				}
			}

			System.out.println();
			
			percentualElimina = percentualElimina + percentualRestanteEliminacao / raioLocal;
			elimina = Math.round(percentualElimina / 100.0 * comprimento);
		}
	}
}