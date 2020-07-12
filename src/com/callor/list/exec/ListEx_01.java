package com.callor.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * 가. intList 이름으로 Interger 형 리스트 선언합니다.
 * 나. Random 클래스 이용하여 100개의 임의의 숫자 생성하여 리스트에 추가합니다.
 * 다. 리스트에 추가된 100개의 정수를 모두 덧셈하여 Console에 출력합니다.
 * 라. 리스트에 추가된 100개의 정수 중에서 짝수 리스트를 Console에 출력합니다.
 */
public class ListEx_01 {

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		Random rnd = new Random();
		
		int intNum = 0;
		
		for(int i = 0 ; i < 100 ; i++) {
			intNum = rnd.nextInt(100)+1;
			
			intList.add(intNum);
		}
		
		int intSum = 0;
		for(int i = 0 ; i < 100 ; i++) {
			intSum += intList.get(i);
		}
		System.out.println( "덧셈 : " + intSum);
		
		int intEven = 0;
		for(int i = 0 ; i < 100 ; i++) {
			intEven = intList.get(i);
			if(intEven % 2 == 0) {
				System.out.println("짝수 : " + intEven);
			}
		}
	}
}
