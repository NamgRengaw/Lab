package controller;

public class Mensagens {
	
	private String saldacao = "------------Calculadora------------"
								+ "\n Bem Vindo a calculadora!";
	
	private String perguntaOp =   "Qual operador deseja escolher?"
								+ "\n Escolha somente o n�mero: "
								+ "\n 1 - Soma"
								+ "\n 2 - Subtra��o"
								+ "\n 3 - Multiplica��o"
								+ "\n 4 - Divis�o";
	
	private String perguntaN1 = "Digite o primeiro n�mero:";
	
	private String perguntaN2 = "Digite o segundo n�mero:";
	
	private String resultado = "Resposta: "; 
	
	private String div0 = "Divis�o por 0 = nulo";
	
	private String opErrado = "Op��o inv�lida!";
	
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
