

import java.util.Locale;
import java.util.Scanner;

/* testando entrada de dados no java*/
public class Aula1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//String teste= sc.nextLine();
		//int idade = sc.nextInt();
		//double renda = sc.nextDouble();
		//String nome = sc.next();
		//char letra = sc.next().charAt(4);// capturar a letra pelo índice
	  
	    
		/*System.out.printf("Você digitou %n Nome: %s, Idade: %d, Renda: %.2f %n este foi o %s, letra digitada: (%s), frase: %s", nome, idade, renda, teste);
		sc.close();
	    
		  String palavra1, palavra2, palavra3;
		  
		  int x = sc.nextInt();
		  sc.nextLine();
		  palavra1 = sc.nextLine();
		  palavra2 = sc.nextLine();
		  palavra3 = sc.nextLine();
		  
		  System.out.println("DADOS DIGITADOS");
		  System.out.println(x);
		  System.out.println(palavra1);
		  System.out.println(palavra2);
		  System.out.println(palavra3);
		  
		  */
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
		sc.close();
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		
		if (x > y && x > z) {
			aux = x;
		}
		
		else if (y > z) {
			aux = y;
		}else {
			aux = z;
		}
		
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher"+ value);
	}

}
