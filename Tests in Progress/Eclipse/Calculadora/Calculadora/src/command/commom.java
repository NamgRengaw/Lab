package command;

import java.util.Scanner;

public class Commom {
	
	double num[] = new double[2];
	double result;
	int choice;
	
	Scanner in = new Scanner(System.in);
	SwitchWindows sw = new SwitchWindows();
	
	public Commom(){
		
		System.out.println("============================ Calculadora =============================== \n"
				+			"!!!!!!!! Insira Apenas o n�mero respectivo a opera��o desejada !!!!!!!"
				+ "Selecione o tipo de opera��o?\n"
				+ "1 - Soma\n"
				+ "2 - Subtra��o\n"
				+ "3 - Multiplica��o\n"
				+ "4 - Divis�o\n");
				
		choice = in.nextInt();
		
		if(choice == 1) {
			sw.somar();
		}else if(choice ==2) {
			sw.subtrair();
		}else if(choice == 3) {
			sw.multiplica��o();
		}else if(choice == 4) {
			sw.dividir();
		}
		
		System.out.println("");
		
		System.out.println("Digite o primeiro numero: ");
		num[0] = in.nextDouble();	
		System.out.println("Sua escolha �: " + num[0] + "\n");
		
		System.out.println("Digite o segundo numero: ");
		num[1] = in.nextDouble();
		System.out.println("Sua escolha �: " + num[1] + "\n");
	}

}
