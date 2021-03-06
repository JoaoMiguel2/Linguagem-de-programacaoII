package model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private String nome;
	private String cnpj;
	private List<Funcionario> funcinarios;
	
	public Empresa(String nome, String cnpj) {
	
		this.nome = nome;
		this.cnpj = cnpj;
		
		this.funcinarios = new ArrayList<Funcionario>();
	}
	
	public void adicionaFuncionario(Funcionario pFuncionario) {
			this.funcinarios.add(pFuncionario);
		}
	
	public List<Funcionario> getFuncionaios(){
		return this.funcinarios;
	}
	
	public String getNome() {
		
		return this.nome;
	}
    public String getCnpj() {
		
		return this.cnpj;
	}
}