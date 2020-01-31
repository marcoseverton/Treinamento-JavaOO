package exercicio02;

public class Estudante {
	
	String nome;
	double nota01;
	double nota02;
	double nota03;
	double totalTrimestre = 100;
	
	public void	consultaReprovacao(){
		double notaTotal = this.nota01 + this.nota02 + this.nota03;
		double notaMinima= 60;
		
		if (notaTotal >= notaMinima) {
			System.out.println("Você foi aprovado!!!");
			System.out.println("A nota final obtida foi de "+ notaTotal + "Pontos");
		}else {
			double notaNecessaria = notaMinima - notaTotal;
			System.out.println("Você foi reprovado###");
			System.out.println("Você ainda precisa de "+notaNecessaria+" postos para passar");
		}
	}
}
