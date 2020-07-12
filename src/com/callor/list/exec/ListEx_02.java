package com.callor.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * 가. intList 이름으로 Integer 형 리스트 선언하고 ArrayList로 초기화 합니다.
 * 나. Random 클래스 이용하여 100개의 임의의 숫자 생성하여 리스트에 추가합니다.
 * 다. intList에서 정수 55인 항목을 찾아서 그 위치를 console에 “모두” 출력합니다.
 * 라. intList에서 정수 30이 “최초로 나타나는 위치”를 console에 출력합니다.
 */
public class ListEx_02 {

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		Random rnd = new Random();
		
		int intNum = 0 ;
		for(int i = 0 ; i < 100 ; i++) {
			intNum = rnd.nextInt(100)+1;
			
			intList.add(intNum);
		}
		
		int findNum = 0;
		// 55 찾기
		for(int i = 0 ; i < 100 ; i++) {
			findNum = intList.get(i);
			if(findNum == 55) {
				System.out.println(findNum + "의 위치 " + i);
			}
		}
	}
}
