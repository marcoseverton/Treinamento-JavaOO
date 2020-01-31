package entities;

public class Produto {

	public String name;
	public double price;
	public int quantity;
	
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
