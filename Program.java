package aplicação;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import classes.Funcionario;
import classes.VariacaoSalario;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos funcionarios deseja cadastrar?");
		int quantFuncionarios = sc.nextInt();
		Double salario = 0.0;
		List<Funcionario> listaFuncionarios = new ArrayList<>(); // Criando o objeto ArrayList
		for (int i = 0; i < quantFuncionarios; i++) {
			System.out.printf("\nFUNCIONARIO #%d\n", i + 1);
			System.out.print("ID:");
			Integer id = sc.nextInt();
			System.out.print("NOME:");
			String nome = sc.next();
			sc.nextLine();
			System.out.print("SALARIO");
			salario = sc.nextDouble();

			Funcionario cadastroFuncionario = new Funcionario(id, nome, salario);
			listaFuncionarios.add(cadastroFuncionario); // Adiciono os dados cadastrados na lista
		}

		System.out.println("\nProcure o funcionario atraves do ID");
		int procuraFuncionario = sc.nextInt();

		// Procura o funcionario através do ID
		for (Funcionario verifica : listaFuncionarios) {

			if (verifica.getId() == procuraFuncionario) {
				System.out.println("\nFuncionario selecionado:");
				System.out.println(verifica.toString());
				
				System.out.println("\nDigite 1 - AUMENTAR SALARIO 2 - DIMINUIR SALARIO");
				int opcSelecionada = sc.nextInt();
				if (opcSelecionada == 1) {

					System.out.println("Informe de quantos porcentos será o incremento no salario");
					Double varSalario = sc.nextDouble();

					VariacaoSalario varSalarioFuncionario = new VariacaoSalario(varSalario);
					verifica.setSalario(varSalarioFuncionario.incrementoSalario(salario));// altero o salario atraves do
																								// metodo incremetoSalario
					System.out.println(verifica.toString());}// printa os dados do funcionario com salario atualizado
					 else {

							System.out.println("Informe de quantos porcentos será o decremento no salario");
							Double varSalario = sc.nextDouble();

							VariacaoSalario varSalarioFuncionario = new VariacaoSalario(varSalario);
							verifica.setSalario(varSalarioFuncionario.decrementoSalario(salario));
							System.out.println(verifica.toString());
						}
				}
			}
		sc.close();
	}

}
