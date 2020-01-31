package entities_02;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		//System.out.println("Quantity in stock: ");
		//int quantity = sc.nextInt();
		Product produto = new Product(name, price);
		
		//Product produto = new Product(name, price, quantity);
		
		//System.out.println(product.name + ", "+ product.price + ", " + product.quantity);
		// UTILIZANDO A FUNÇÃO toString
		System.out.println();
		System.out.println("Product data: " + produto);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		produto.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + produto);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt(); 
		produto.removeProducts(quantity);
		
		System.out.println("Update data: " + produto);
		
	
		produto.setName("Tv");
		produto.setPrice(2.90);
		
		System.out.printf("Produto: %s, %n Valor: %.2f", produto.getName(), produto.getPrice() );
		
		sc.close();
	}

}
