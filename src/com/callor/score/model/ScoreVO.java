package com.callor.score.model;

/*
 * 가. 다음 필드변수를 갖는 ScoreVO 클래스를 작성합니다.
 * 나. 이름(문자열) : name,
 * 국어점수(정수) : kor,
 * 영어점수(정수) : eng,
 * 수학(정수) : math
 * 다. 필드변수는 모두 private로 하고 getter, setter 생성합니다.
 */

/*
 * 가. ScoreVO 클래스의 필드변수에 음악, 총점, 평균을 다음과 같이 추가합니다.
 * 학번(문자열),
 * 국어점수, 영어점수, 수학점수(정수),
 * 음악점수(정수),
 * 총점, 평균(정수)
 * 나. 추가된 필드변수는 private로 설정하고 getter, setter를 작성하시오
 */
public class ScoreVO {

	private String name;
	private int kor;
	private int eng;
	private int math;
	
	private int music;
	
	private int sum;
	private int avg;
	
	
	public int getMusic() {
		return music;
	}
	public void setMusic(int music) {
		this.music = music;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
}
