package view;

import model.Empresa;
import model.Funcionario;

public class Main {

	public static void main(String[] args) {
		
		Empresa axtelecom = new Empresa("axtelecom", "987.567.532-98" );
		
		Funcionario emerson = new Funcionario("Emerson Assis", 1500, axtelecom);
		
		Funcionario joseh = new Funcionario("Joseh", 2500, axtelecom);
		
		System.out.println(emerson.getNome());
		System.out.println(emerson.getSalario());
		System.out.println(emerson.getAxtelecom());
		
		System.out.println(joseh.getNome());
		System.out.println(joseh.getSalario());
		System.out.println(joseh.getAxtelecom());
		
	    axtelecom.adicionaFuncionario(emerson);
		axtelecom.adicionaFuncionario(joseh);

		System.out.println("+++++++");
		for (Funcionario f : axtelecom.getFuncionaios()) {
			System.out.println(f.getNome());
		}
	}
}