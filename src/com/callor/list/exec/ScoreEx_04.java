package com.callor.list.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.list.model.ScoreVO;
import com.callor.list.service.ScoreServiceV3;

/*
 * 가. scoreList 이름으로 ScoreVO 형 리스트를 선언하고 ArrayList로 초기화 합니다.
 * 나. ScoreServiceV3 클래스를 객체(인스턴스)로 생성합니다.
 * 다, makeScore() method를 호출하여 성적 데이터를 생성합니다.
 * 라. makeSum() method를 호출하여 총점을 계산합니다
 * 마. makeAvg() method를 호출하여 평균을 계산합니다.
 * 사. scoreList() method를 호출하여 성적일람표를 출력합니다
 */
public class ScoreEx_04 {

	public static void main(String[] args) {
		
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		ScoreServiceV3 sV3 = new ScoreServiceV3();
		
		sV3.makeScore();
		sV3.makeSum();
		sV3.makeAvg();
		sV3.scoreList();
	}
}
