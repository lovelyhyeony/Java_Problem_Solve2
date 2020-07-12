package com.callor.list.service;

import java.util.List;

import com.callor.list.model.ScoreVO;

/*
 * 가. scoreList() method를 만들고 매개변수로 scoreList 변수를 전달받아 성적일람표를 console에 출력합니다.
 */
public class ScoreServiceV1 {

	public void scoreList(List<ScoreVO> scoreList) {
		
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
