package main;

public class Triangulo {
	
	private double base;
	private double altura;
	private String nome;

	
	public void setBase(double base) {
		if (base > 0)
			this.base = base;
	}

	public void setAltura(double altura) {
		if (altura > 0)
			this.altura = altura;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public double calculaArea () {
		double area = base * altura;

		return area;
	}

	public void desenhar() {
		double baseLocal = this.base;

	
		if (this.base % 2 == 0)
			baseLocal += 1;

	
		int pulaLinha = 2;
		if (baseLocal < altura)
			pulaLinha += Math.round(altura/baseLocal);

		int meioDaBase = (int) baseLocal/2;
		int incrementoPontos = 0;

		for (int i = 0; i < altura; i++) {
			if (i%pulaLinha == 0) {
				for (int j = 0; j < baseLocal; j++) {
					if (j < meioDaBase - incrementoPontos || j > meioDaBase + incrementoPontos) {
						System.out.print("  ");
					} else {
						System.out.print(". ");
					}
				}

				if (baseLocal > altura) {
					incrementoPontos += Math.round(baseLocal/altura);
				} else {
					incrementoPontos++;
				}
			}
			
			System.out.println();
		}
	}
}