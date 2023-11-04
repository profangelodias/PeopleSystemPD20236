package tech.angelofdiasg.app;

import tech.angelofdiasg.composicoes.Endereco;
import tech.angelofdiasg.pessoas.Cliente;
import tech.angelofdiasg.pessoas.Funcionario;

public class AppMain {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario();
		Cliente cli1 = new Cliente();
		Endereco end1 = new Endereco();
		
		
		
		cli1.cadatrar("mat01", "Programadora", "Bruna", "01/01/2000",
				end1, "0817236197236");

	}

}
