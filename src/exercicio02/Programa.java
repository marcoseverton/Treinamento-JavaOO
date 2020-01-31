package exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Estudante estudante = new Estudante();
		
		System.out.println("Informe o nome: ");
		System.out.println();
		estudante.nome = scan.next();
		System.out.println();
		System.out.println("Informe a nota no primeiro trimestre: ");
		System.out.println();
		estudante.nota01 = scan.nextDouble();
		System.out.println();
		System.out.println("Informe a nota no segundo trimestre: ");
		System.out.println();
		estudante.nota02 = scan.nextDouble();
		System.out.println();
		System.out.println("Informe a nota no terceiro trimestre: ");
		System.out.println();
		estudante.nota03 = scan.nextDouble();
		System.out.println();
		System.out.println("Aluno : "+estudante.nome);
		estudante.consultaReprovacao();
		
		scan.close();

	}

}
