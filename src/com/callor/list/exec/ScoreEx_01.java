package com.callor.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.list.model.ScoreVO;

/*
 * 가. scoreList 이름으로 ScoreVO 형 리스트를 선언하고 ArrayList로 초기화 합니다.
 * 나. 학번은 1부터 순서대로 부여하고 Random 클래스 이용하여 51 ~ 100까지 범위의 정수를 생성하여 국어, 영어, 수학 과목 점수로 저장합니다.
 * 다. 각 학생의 과목 총점을 계산하여 필드변수 sum에 저장합니다.
 * 라. 각 학생의 과목 평균을 계산하여 필드변수 avg에 저장합니다.
 * 마. 향상된 for(forEach) 구문을 사용하여 성적일람표를 출력합니다.
 */
public class ScoreEx_01 {

	public static void main(String[] args) {
		
		int stdNum = 10;
		int subNum = 3;
		
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		Random rnd = new Random();

		// 학번, 점수 할당
		int intKor = 0;
		int intEng = 0;
		int intMath = 0;
		for(int i = 0 ; i < stdNum ; i++) {
			
			ScoreVO sVO = new ScoreVO();
			
			intKor = rnd.nextInt(50)+51;
			intEng= rnd.nextInt(50)+51;
			intMath= rnd.nextInt(50)+51;
			
			sVO.setNum(""+(i+1));
			sVO.setKor(intKor);
			sVO.setEng(intEng);
			sVO.setMath(intMath);
			
			scoreList.add(sVO);
		}
		
		// 총점
		int intSum = 0;
		for(ScoreVO sVO : scoreList) {
			
			intSum = sVO.getKor();
			intSum += sVO.getEng();
			intSum += sVO.getMath();
			
			sVO.setSum(intSum);
		}
		
		// 평균
		int intAvg = 0;
		for(ScoreVO sVO : scoreList) {
			
			intAvg = sVO.getSum() / subNum;
			
			sVO.setAvg(intAvg);
		}
		
		// 성적 리스트 출력
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
