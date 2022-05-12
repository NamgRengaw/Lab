package command;

public class Operators extends Commom{
	
	public Operators() {
		if(this.choice == 1) {
			
			System.out.format("O resultado é: %f", this.soma(num[0], num[1]));
		
		}else if(this.choice == 2) {
			
			System.out.format("O resultado é: %f", this.subtracao(num[0], num[1]));
			
		}else if(this.choice == 3) {
			
			System.out.format("O resultado é: %f", this.multiplicacao(num[0], num[1]));
			
		}else if(choice == 4) {
			
				
				System.out.format("O resultado é: %f", this.divisao(num[0], num[1]));	
			
		}
	}

	public double soma(double num1, double num2) {
		result = num[0] + num[1];
		return result;
	}
	
	public double subtracao(double num1, double num2) {
		result = num[0] - num[1];
		return result;
	}
	
	public double multiplicacao(double num1, double num2) {
		result = num[0] * num[1];
		return result;
	}
		
	public double divisao(double num1, double num2){
		
		if(num[0] != 0 & num[1] != 0) {
			result = num[0] / num[1];
		}else {
			System.out.println("Um dos valores apresentados é igual a 0. \n Não Existe divisão por zero!");
		}
		return result;
	}
}
