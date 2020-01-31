package exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Informe o nome do funcionário: ");
		funcionario.name = scan.nextLine();
		System.out.println();
		
		System.out.println("Favor informe o valor do salário: ");
		funcionario.salario = scan.nextDouble();
		
		double salarioBruto = funcionario.salario;
		
		System.out.println("Valor do imposto de renda: ");
		funcionario.imposto = scan.nextDouble();
		System.out.println();
		System.out.println("Informe o percentual do aumento salarial: ");
		double porcentagem = scan.nextDouble();
		funcionario.getSalario(porcentagem);
	
		System.out.println("Salario bruto: " + salarioBruto +", "+ funcionario);

		scan.close();
		
	}

}
