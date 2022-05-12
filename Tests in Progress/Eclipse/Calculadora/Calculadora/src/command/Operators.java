package command;

import java.util.Scanner;

public class Operators {
	double num1;
	double num2;
	double result;
	int choice;

	
	Scanner in = new Scanner(System.in);

	public Operators() {
		
		System.out.println("============================ Calculadora =============================== \n"
				+ "Selecione o tipo de operação?\n"
				+ "1 - Soma\n"
				+ "2 - Subtração\n"
				+ "3 - Multiplicação\n"
				+ "4 - Divisão\n"
				+ "!!!! Insira Apenas o número respectivo a operação desejada !!!!");
		choice = in.nextInt();
		System.out.println("Digite o primeiro numero: ");
		num1 = in.nextDouble();
		System.out.println("Digite o segundo numero: ");
		num2 = in.nextDouble();
		
		if(this.choice == 1) {
			System.out.format("O resultado é: %f", this.soma(num1, num2));
		}else if(this.choice == 2) {
			System.out.format("O resultado é: %f", this.subtracao(num1, num2));
		}else if(this.choice == 3) {
			System.out.format("O resultado é: %f", this.multiplicacao(num1,num2));
		}else if(choice == 4) {
			if(num1 != 0 && num2 != 0) {
				System.out.format("O resultado é: %f", this.divisao(num1,num2));	
			}else {
				System.out.format("Um ou mais valores é/são igual/iguais a zero");
			}
		}
			
		
		
	}
	
	public double soma(double num1, double num2) {
		result = num1 + num2;
		return result;
	}
	
	public double subtracao(double num1, double num2) {
		result = num1 - num2;
		return result;
	}
	
	public double multiplicacao(double num1, double num2) {
		result = num1 * num2;
		return result;
	}
		
	public double divisao(double num1, double num2){
		
		if(num1 != 0 & num2 != 0) {
			result = num1 / num2;
		}else {
			System.out.println("Um dos valores apresentados é igual a 0. \n Não Existe divisão por zero!");
		}
		return result;
	}
	
	
	
	public int getChoice() {
		return choice;
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}

	public double getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public double getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}

	public Scanner getIn() {
		return in;
	}

	public void setIn(Scanner in) {
		this.in = in;
	}
	
	
	
}
