package com.callor.list.model;

/*
 * 가. 다음 필드변수를 갖는 ScoreVO 클래스를 작성합니다.
 * 나. 학번(문자열) : num
 * 국어점수(정수) : kor,
 * 영어점수(정수) : eng,
 * 수학(정수) : math
 * 총점(정수) : sum
 * 평균(정수) : avg
 * 다. 필드변수는 모두 private로 하고 getter, setter 생성합니다.
 */
public class ScoreVO {

	private String num;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private int avg;
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	
}
