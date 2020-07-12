package com.callor.address.service;

import com.callor.address.model.AddressVO;

/*
 * 가. AddressVO 배열을 매개변수로 전달받아
 * 주소록을 출력하는 addrList() 메서드를 작성합니다.
 * 나. exec 패키지에 AddrEx_03 클래스와 main() method를 작성하고
 * AddrServiceV1 클래스의 addList() method를 테스트하는 코드를 작성합니다.
 */
public class AddrServiceV1 {

	public void addrList() {
		
	}
	// AddressVO 배열 매개변수로 전달받는 addrList() method
	public void addrList(AddressVO[] addrVO) {
		
		
		System.out.println("=============================================");
		System.out.println("이름\t전화\t\t주소\t나이");
		System.out.println("---------------------------------------------");

		for (int i = 0; i < addrVO.length; i++) {
			System.out.printf("%s\t%s\t\t%s\t%d\n", addrVO[i].getName(), addrVO[i].getTel(),addrVO[i].getAddr(),addrVO[i].getAge());
		}
		
		System.out.println("=============================================");
	}
}
