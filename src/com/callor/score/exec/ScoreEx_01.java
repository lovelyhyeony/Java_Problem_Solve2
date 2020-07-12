package com.callor.score.exec;

import java.util.Random;

import com.callor.score.model.ScoreVO;

/*
 * 가, 진입점 main() method를 작성하고 다음을 수행합니다.
 * 나. ScoreVO를 사용하여 성적을 저장할 인스턴스 배열 20개를 scores 이름으로 생성하고 초기화.
 * 다. 국어, 영어, 수학 점수를 Random 클래스를 사용하여 51 ~ 100까지 중 임의의 정수를 생성하여 저장합니다.
 * 라. 이름은 배열의 위치 번호(0~19)를 문자열로 변환하여 1~20까지 일련번호로 저장합니다.
 * 마. 다음과 같이 console에 결과를 출력합니다.
 * 바. 성적일람표에 각 학생의 총점과 평균을 계산하여 출력합니다
 */
public class ScoreEx_01 {

	public static void main(String[] args) {
		
		int intStd = 20;
		int intSub = 3;
		
		// 객체생성
		ScoreVO[] scores = new ScoreVO[intStd];
		Random rnd = new Random();
		
		// 초기화
		for(int i = 0 ; i < scores.length ; i++) {
			scores[i] = new ScoreVO();
		}
		
		// 임의의 정수값을 담을 int형 변수 선언, 초기화
		int intKor = 0;
		int intEng = 0;
		int intMath = 0;
		
		// 이름에 문자열 저장
		// 임의 정수값 담은 후 배열에 각각 점수 저장
		for(int i = 0 ; i < scores.length ; i++) {
			
			intKor = rnd.nextInt(50)+51;
			intEng = rnd.nextInt(50)+51;
			intMath = rnd.nextInt(50)+51;
			
			scores[i].setName(""+(i+1));
			scores[i].setKor(intKor);
			scores[i].setEng(intEng);
			scores[i].setMath(intMath);
		}
		
		// 출력
		System.out.println("====================================================");
		System.out.println("성적일람표");
		System.out.println("====================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------------");
		
		int intSum = 0 ;
		for(int i = 0 ; i < scores.length ; i++) {
			
			intSum = scores[i].getKor();
			intSum += scores[i].getEng();
			intSum += scores[i].getMath();
			
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\n",
					scores[i].getName(),
					scores[i].getKor(),
					scores[i].getEng(),
					scores[i].getMath(),
					intSum,
					(intSum / intSub));
		}
		System.out.println("====================================================");
	}
}
