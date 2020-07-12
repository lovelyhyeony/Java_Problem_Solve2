package com.callor.bank.model;

/*
 * 가. 다음 필드변수를 갖는 BankVO 클래스를 작성합니다.
 * 나 계좌번호(문자열) : num
 * 날짜(문자열) : date
 * 입금액(정수) : input
 * 출금액(정수) : ouput
 * 잔액(정수) : valance
 * 다. 필드변수는 private로 하고 getter, setter 생성하여 접근하도록 합니다.
 */
public class BankVO {

	private String num;
	private String date;
	private int input;
	private int output;
	private int valance;
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getInput() {
		return input;
	}
	public void setInput(int input) {
		this.input = input;
	}
	public int getOutput() {
		return output;
	}
	public void setOutput(int output) {
		this.output = output;
	}
	public int getValance() {
		return valance;
	}
	public void setValance(int valance) {
		this.valance = valance;
	}
	
}
