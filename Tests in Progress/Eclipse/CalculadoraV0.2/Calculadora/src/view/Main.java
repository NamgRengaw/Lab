package view;

import java.util.Scanner;

import controller.Banco;
import controller.Mensagens;
import controller.Operadores;

public class Main extends Operadores{
	
	public static void main(String[] args) {
		Operadores op = new Operadores();
		Banco bc = new Banco();
		Mensagens ms = new Mensagens();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println(ms.getSaldacao());
		System.out.println(ms.getPerguntaOp());
		
		bc.setChoice(in.nextByte());
		
		if(bc.getChoice() == 1) {
			
			System.out.println(ms.getPerguntaN1());
			bc.setNum1(in.nextFloat());
			
			System.out.println(ms.getPerguntaN2());
			bc.setNum2(in.nextFloat());
			
			op.setSoma(bc.getNum1(), bc.getNum2());
			
			System.out.println(ms.getResultado() + op.getSoma());
			
		}else if(bc.getChoice() == 2){
			
			System.out.println(ms.getPerguntaN1());
			bc.setNum1(in.nextFloat());
			
			System.out.println(ms.getPerguntaN2());
			bc.setNum2(in.nextFloat());
			
			op.setSubtracao(bc.getNum1(), bc.getNum2());
			
			System.out.println(ms.getResultado() + op.getSubtraçao());
			
		}else if(bc.getChoice() == 3) {
						
			System.out.println(ms.getPerguntaN1());
			bc.setNum1(in.nextFloat());
			
			System.out.println(ms.getPerguntaN2());
			bc.setNum2(in.nextFloat());
			
			op.setMultiplicacao(bc.getNum1(), bc.getNum2());
			
			System.out.println(ms.getResultado() + op.getMultiplicacao());
			
			}else if(bc.getChoice() == 4) {
			
			
				
				System.out.println(ms.getPerguntaN1());
				bc.setNum1(in.nextFloat());
			
				System.out.println(ms.getPerguntaN2());
				bc.setNum2(in.nextFloat());
				
				if(bc.getNum1() != 0 && bc.getNum2() != 0) {
					
				op.setDivisao(bc.getNum1(), bc.getNum2());
				
				System.out.println(ms.getResultado() + op.getDivisao());
				
				}else {
				
				System.out.println(ms.getDiv0());
			
				}			
		}else {
			
			System.out.println(ms.getOpErrado());
			
			
		}
	}
}
