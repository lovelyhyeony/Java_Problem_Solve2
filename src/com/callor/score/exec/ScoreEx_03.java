package com.callor.score.exec;

import java.util.Random;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreServiceV2;

/*
 * 가. 진입점 main() method를 만들고 다음을 수행합니다.
 * 나. ScoreVO를 사용하여 성적을 보관할 scores 배열 10개 생성하고 초기화합니다.
 * 다. 학번은 1번부터 순서대로 저장하고
 * 라. 학생의 각 과목점수를 Random 클래스를 사용하여 51 ~ 100까지 중 임의의 점수로 생성하여 저장합니다.
 * 마. 다음에 지시하는 ScoreServiceV2 클래스를 사용하여 성적리스트를 출력합니다.
 * 바. 총점과 평균은 계산하지 않습니다.
 */
public class ScoreEx_03 {

	public static void main(String[] args) {
		
		int intStd = 10;
		
		// 객체 생성
		ScoreServiceV2 sS2 = new ScoreServiceV2();
		ScoreVO[] scores = new ScoreVO[intStd];
		Random rnd = new Random();
		
		// 초기화
		for(int i = 0 ; i < scores.length; i ++) {
			scores[i] = new ScoreVO();
		}
		
		// 임의의 정수값을 담을 int형 변수 선언, 초기화
		int intKor = 0;
		int intEng = 0;
		int intMath = 0;
		int intMusic = 0;
		
		// 이름에 문자열 저장
		// 임의 정수값 담은 후 배열에 각각 점수 저장
		for(int i = 0 ; i < scores.length ; i++) {
			
			intKor = rnd.nextInt(50)+51;
			intEng = rnd.nextInt(50)+51;
			intMath = rnd.nextInt(50)+51;
			intMusic = rnd.nextInt(50)+51;
			
			scores[i].setName(""+(i+1));
			scores[i].setKor(intKor);
			scores[i].setEng(intEng);
			scores[i].setMath(intMath);
			scores[i].setMusic(intMusic);
		}
		
		sS2.setScoreList(scores);
		sS2.scoreSum();
		sS2.scoreAvg();
		sS2.scoreList();
	}
}
