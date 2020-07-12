package com.callor.list.service;

import java.util.List;

import com.callor.list.model.ScoreVO;

/*
 * 가. ScoreVO를 담는 scoreList 리스트 객체를 필드변수로 선언합니다.
 * 
 * 다. makeSum() method를 만들고 다음을 수행합니다.
 * - 매개변수로 scoreList를 선언합니다.
 * - 매개변수로 전달받은 scoreList를 필드변수 scoreList 에 할당합니다.
 * - 학생의 총점을 계산하여 scoreList에 반영합니다.
 * 라. makeAvg() method를 만들고 다음을 수행합니다
 * - scoerList 에서 과목점수, 총점 등을 참조하여 학생별 평균을 계산하고 scoreList에 반영합니다.
 * 마. scoreList() method를 만들고 성적일람표를 출력합니다
 */
public class ScoreServiceV2 {

	private List<ScoreVO> scoreList;
	
	// 총점
	public void makeSum(List<ScoreVO> scoreList) {
		this.scoreList = scoreList;
		
		int intSum = 0;
		for(ScoreVO sVO : scoreList) {
			
			intSum = sVO.getKor();
			intSum += sVO.getEng();
			intSum += sVO.getMath();
			
			sVO.setSum(intSum);
		}
	}

	// 평균
	public void makeAvg() {
		int intAvg = 0;
		int subNum = 3;
		for(ScoreVO sVO : scoreList) {
			
			intAvg =sVO.getSum() / subNum;
			
			sVO.setAvg(intAvg);
		}
	}
	
	// 성적리스트
	public void scoreList() {
		System.out.println("===============================================================");
		System.out.println("성적 일람표");
		System.out.println("===============================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------------------------------");
		for(ScoreVO sVO : scoreList) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%5.1f\n",
					sVO.getNum(),sVO.getKor(),sVO.getEng(),
					sVO.getMath(),sVO.getSum(),(float)(sVO.getAvg()));
		}
		System.out.println("===============================================================");
	}
}
