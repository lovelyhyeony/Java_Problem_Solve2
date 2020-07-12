package com.callor.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.list.model.ScoreVO;
import com.callor.list.service.ScoreServiceV2;

/*
 * 가. scoreList 이름으로 ScoreVO 형 리스트를 선언하고 ArrayList로 초기화 합니다.
 * 나. 학번은 1부터 순서대로 부여하고 Random 클래스 이용하여 51 ~ 100까지 범위의 정수를 생성하여 국어, 영어, 수학 과목 점수로 저장합니다.
 * 다. ScoreServiceV2 클래스를 객체(인스턴스)로 생성합니다.
 * 라. ScoreServiceV2 클래스의 makeSum() method에 scoreList를 파라메터로 전달합니다.
 * 마. ScoreServiceV2 클래스의 makeAvg() method를 호출하고, scoreList() method를 호출하여 성적일람표를 출력합니다.
 */
public class ScoreEx_03 {

	public static void main(String[] args) {

		ScoreServiceV2 sV2 = new ScoreServiceV2();
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		Random rnd = new Random();

		int stdNum = 10;
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
		
		sV2.makeSum(scoreList);
		sV2.makeAvg();
		sV2.scoreList();
	}
}
