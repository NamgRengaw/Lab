package controller;

public class Operadores extends Banco {

	private float soma;
	private float subtracao;
	private float divisao;
	private float multiplicacao;
	
	public float getSoma() {
		return soma;
	}
	public void setSoma(float n1, float n2) {
		this.soma = n1 + n2;
	}
	public float getSubtraçao() {
		return subtracao;
	}
	public void setSubtracao(float n1, float n2) {
		this.subtracao = n1 - n2;
	}
	public float getDivisao() {
		return divisao;
	}
	public void setDivisao(float n1, float n2) {
		this.divisao = n1 / n2;
	}
	public float getMultiplicacao() {
		return multiplicacao;
	}
	public void setMultiplicacao(float n1 , float n2) {
		this.multiplicacao = n1 * n2;
	}
	
	
	
}
