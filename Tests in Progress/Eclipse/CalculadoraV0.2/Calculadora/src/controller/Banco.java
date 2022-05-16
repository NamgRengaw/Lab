package controller;

public class Banco extends Mensagens{
	
	private float num1;
	private float num2;
	private float result;
	private byte choice;
	
	
	
	public float getNum1() {
		return num1;
	}
	public void setNum1(float n1) {
		this.num1 = n1;
	}
	public float getNum2() {
		return num2;
	}
	public void setNum2(float n2) {
		this.num2 = n2;
	}
	public float getResult() {
		return result;
	}
	public void setResult(float r) {
		this.result = r;
	}
	public byte getChoice() {
		return choice;
	}
	public void setChoice(Byte c) {
		this.choice = c;
	}
}
