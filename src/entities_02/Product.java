package entities_02; 

public class Product {

	private String name;
	private double price;
	private int quantity;
	
	//construtor padrão
	public Product() {}
	
	//construtor da classe
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//sobrecarga
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
    public int getQuantity() {
    	return quantity;
    }
    
	//VERIFICAR O VALOR (R$) TOTAL CONSIDERANDO A QUANTIDADE EM ESTOQUE 
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name 
				+ ", Valor R$: " 
				+ String.format("%.2f", price)
				+ " , Quantidade: "
				+ quantity
				+ " unidades, Total: R$ "
				+ String.format("%.2f", totalValueInStock());
	}
}
