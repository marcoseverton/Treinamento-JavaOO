package exercicio01;

public class Funcionario {

	String name;
	double salario;
	double imposto;
	
	public double getSalario(double porcentagem){
		if (porcentagem>0) {
			double vlAumento = porcentagem * salario/(100);
			return salario += vlAumento - (imposto); 
		} else {
			return salario -= imposto;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Funcionário: " 
				+ name 
				+ ", "
				+"Salário: "
				+ String.format("%.2f", salario)
				+ ", Imposto: "
				+ imposto;
	}
	
}