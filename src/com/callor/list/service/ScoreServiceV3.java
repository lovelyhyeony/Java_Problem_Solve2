package com.callor.list.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.list.model.ScoreVO;

/*
 * 가. ScoreVO를 담는 scoreList 리스트 객체를 필드변수로 선언합니다.
 * 나. 생성자를 만들고 scoreList 객체를 생성(초기화) 합니다.
 * 다. makeScore() method를 만들고 다음을 수행합니다.
 * - scoreVO를 선언 초기화 합니다.
 * - 학번은 1부터 순서대로 부여합니다.
 * - Random 클래스 이용하여 51 ~ 100까지 범위의 정수를 생성하여 국어, 영어, 수학 과목 점수로 저장합니다.
 * - 작성된 scoreVO를 scoreList에 추가합니다.
 * 라. makeSum() method를 만들고 학생별 총점을 계산하여 scoreList를 수정합니다.
 * 마. makeAvg() method를 만들고 학생별 평균을 계산하여 scoreList를 수정합니다.
 * 바. scoreList() method를 만들고 성적일람표를 console에 출력합니다.
 */
public class ScoreServiceV3 {

	private List<ScoreVO> scoreList;

	// 생성자 안에 scoreList 객체를 생성
	public ScoreServiceV3() {
		scoreList = new ArrayList<ScoreVO>();
	}

	public void makeScore() {
		
		ScoreVO sVO ;
		Random rnd = new Random();

		int stdNum = 10;

		int intKor = 0;
		int intEng = 0;
		int intMath = 0;
		for (int i = 0; i < stdNum ; i++) {

			sVO = new ScoreVO();
			
			intKor = rnd.nextInt(50) + 51;
			intEng = rnd.nextInt(50) + 51;
			intMath = rnd.nextInt(50) + 51;

			sVO.setNum("" + (i + 1));
			sVO.setKor(intKor);
			sVO.setEng(intEng);
			sVO.setMath(intMath);

			scoreList.add(sVO);
		}
	}

	// 총점
	public void makeSum() {

		int intSum = 0;
		for (ScoreVO sVO : scoreList) {

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
		for (ScoreVO sVO : scoreList) {

			intAvg = sVO.getSum() / subNum;

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
		for (ScoreVO sVO : scoreList) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%5.1f\n", sVO.getNum(), sVO.getKor(), sVO.getEng(), sVO.getMath(),
					sVO.getSum(), (float) (sVO.getAvg()));
		}
		System.out.println("===============================================================");
	}
}
