package com.callor.score.service;

import com.callor.score.model.ScoreVO;

/*
 * 가. exec 패키지에 ScoreEx_02 클래스와 main() method를 만들고 ScoreServiceV1 클래스를 테스트 하는 코드를 작성합니다.
 * 나. ScoreEx_01 에서 와 같은 방법으로 생성한 scores 배열을 scoreList() 메서드에 매개변수로 전달하고 성적목록을 출력하시오.
 * 다. 각 학생 점수의 총점과 평균을 계산하여 함께 출력하시오.
 * 라. 과목별 총점, 평균은 출력하지 않습니다.
 */
public class ScoreServiceV1 {

	public void scoreList(ScoreVO[] scores) {
		
		System.out.println("====================================================");
		System.out.println("성적일람표");
		System.out.println("====================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------------");
		
		int intSub = 3;
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
