package com.callor.score.exec;

import java.util.Random;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreServiceV1;

public class ScoreEx_02 {

	public static void main(String[] args) {
		
		int intStd = 20;
		
		// 객체생성
		ScoreServiceV1 sSerV1 = new ScoreServiceV1();
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
		
		sSerV1.scoreList(scores);
	}
}
