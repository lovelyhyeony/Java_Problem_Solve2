package com.callor.score.service;

import com.callor.score.model.ScoreVO;

/*
 * 가. ScoreVO 클래스의 scores 인스턴스 배열을 필드변수로 선언.
 * 나. ScoreEx_03에서 만든 학생 성적을 setScoreList() 메서드를 통해 scores 인스턴스 배열에 setting
 * 다. scoreSum() method를 만들고 총점을 계산하여 각 학생의 총점 필드변수에 저장합니다.
 * 라. scoreAvg() method를 만들고 평균을 계산하는 각 학생의 평균 필드변수에 저장합니다.
 * 마. scoreList() method를 만들고 성적일람표를 출력하는 코드를 작성합니다.
 * 바. 학생별 총점, 평균과 과목별 총점, 평균을 Table(표 형식)로 출력하시오
 * 사. 리스트 하단의 총점과 평균 항목에 학생별 총점의 총점과, 평균의 평균을 계산하여 출력하시오
 */
public class ScoreServiceV2 {

	ScoreVO[] scores;
	
	public void setScoreList(ScoreVO[] scores) {
		this.scores = scores;
	}
	
	// 각 학생의 총점 구하는 코드
	public void scoreSum() {
		
		int intStdSum = 0 ;
		
		for(ScoreVO sVO : scores) {
			
			intStdSum = sVO.getKor();
			intStdSum += sVO.getEng();
			intStdSum += sVO.getMath();
			intStdSum += sVO.getMusic();
			
			sVO.setSum(intStdSum);
		}
	}
	
	// 각 학생의 평균 구하는 코드
	public void scoreAvg() {
		
		int intStdAvg = 0;
		int intSub = 4;
		
		// 향상된 for문으로 만들어봄 
		for(ScoreVO sVO : scores) {
			intStdAvg = sVO.getSum() / intSub;
			
			sVO.setAvg(intStdAvg);
		}
	}
	
	public void scoreList() {

		System.out.println("====================================================");
		System.out.println("성적일람표");
		System.out.println("====================================================");
		System.out.println("이름\t국어\t영어\t수학\t음악\t총점\t평균");
		System.out.println("----------------------------------------------------");
		
		int intKorSum = 0;
		int intEngSum = 0;
		int intMathSum = 0;
		int intMusicSum = 0;
		
		int intKorAvg = 0;
		int intEngAvg = 0;
		int intMathAvg = 0;
		int intMusicAvg = 0;
		
		int intSub = 4;
		for(ScoreVO sVO : scores) {
			
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%d\n",
					sVO.getName(),
					sVO.getKor(),
					sVO.getEng(),
					sVO.getMath(),
					sVO.getMusic(),
					sVO.getSum(),
					sVO.getAvg());
			
			intKorSum += sVO.getKor();
			intEngSum += sVO.getEng();
			intMathSum += sVO.getMath();
			intMusicSum += sVO.getMusic();
			
			intKorAvg = intKorSum / scores.length ;
			intEngAvg = intEngSum / scores.length ;
			intMathAvg = intMathSum / scores.length ;
			intMusicAvg = intMusicSum / scores.length ;
			
		}
		System.out.println("----------------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d = %d\n","과목총점",intKorSum,intEngSum,intMathSum,intMusicSum,(intKorSum +intEngSum + intMathSum + intMusicSum));
		System.out.printf("%s\t%d\t%d\t%d\t%d = %d\n","과목평균",
				intKorAvg,intEngAvg,intMathAvg,intMusicAvg,(intKorAvg + intEngAvg + intMathAvg + intMusicAvg) / intSub);
		System.out.println("====================================================");
	}
	
}
