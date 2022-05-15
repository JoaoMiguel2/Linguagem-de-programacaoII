package model;

public class Funcionario {

	private String nome;
	private double salario;
	private Empresa axtelecom;
	
	public Funcionario(String pNome, double pSalario, Empresa pEmpresa) {
		
		this.nome = pNome;
		this.salario = pSalario;
		this.axtelecom = pEmpresa;
	}
	
	public String getNome() {
		
		return this.nome;
	}
	
	public double getSalario() {
		
		return this.salario;
	}

	public Empresa getAxtelecom() {
		
		return this.axtelecom;
	}
}