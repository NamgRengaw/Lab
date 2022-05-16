package controller;

public class Mensagens {
	
	private String saldacao = "------------Calculadora------------"
								+ "\n Bem Vindo a calculadora!";
	
	private String perguntaOp =   "Qual operador deseja escolher?"
								+ "\n Escolha somente o número: "
								+ "\n 1 - Soma"
								+ "\n 2 - Subtração"
								+ "\n 3 - Multiplicação"
								+ "\n 4 - Divisão";
	
	private String perguntaN1 = "Digite o primeiro número:";
	
	private String perguntaN2 = "Digite o segundo número:";
	
	private String resultado = "Resposta: "; 
	
	private String div0 = "Divisão por 0 = nulo";
	
	private String opErrado = "Opção inválida!";
	
	public String getSaldacao() {
		return saldacao;
	}
	public String getPerguntaOp() {
		return perguntaOp;
	}
	public String getPerguntaN1() {
		return perguntaN1;
	}
	public String getPerguntaN2() {
		return perguntaN2;
	}
	public String getResultado() {
		return resultado;
	}
	public String getDiv0() {
		return div0;
	}
	public String getOpErrado() {
		return opErrado;
	}
}
