package com.callor.address.exec;

import com.callor.address.model.AddressVO;

/*
 * 가. 진입점 main() method를 작성하고 다음을 수행합니다.
 * 나. AddressVO를 사용하여 5개의 인스턴스 배열을 addrList 이름으로 선언하고 초기화하시오
 * 다. 친구 5명의 이름, 주소, 전화번호, 나이를 배열에 각각 저장합니다.
 * 라. 배열에 저장된 친구 5명의 주소록을 다음과 같이 console에 출력합니다.
 */
public class AddrEx_02 {

	public static void main(String[] args) {
		
		int intStd = 5;
		
		// AddressVO 클래스를 이용해 intStd만큼의 인스턴스 배열 선언
		AddressVO[] addrList = new AddressVO[ intStd ];
		
		// addrList배열 초기화
		for(int i = 0 ; i < addrList.length ; i++) {
			addrList[i] = new AddressVO();
		}
		
		// 이름 저장
		addrList[0].setName("홍길동");
		addrList[1].setName("이몽룡");
		addrList[2].setName("성춘향");
		addrList[3].setName("고등어");
		addrList[4].setName("가자미");
		
		// 주소 저장
		addrList[0].setAddr("서울");
		addrList[1].setAddr("광주");
		addrList[2].setAddr("대전");
		addrList[3].setAddr("대구");
		addrList[4].setAddr("부산");
		
		// 전화번호 저장
		addrList[0].setTel("010-111");
		addrList[1].setTel("010-222");
		addrList[2].setTel("010-333");
		addrList[3].setTel("010-444");
		addrList[4].setTel("010-555");
		
		// 나이저장
		addrList[0].setAge(30);
		addrList[1].setAge(20);
		addrList[2].setAge(40);
		addrList[3].setAge(10);
		addrList[4].setAge(50);
		
		// 배열에 저장된 값 Console에 출력
		System.out.println("===================================================");
		System.out.println("주소록");
		System.out.println("===================================================");
		System.out.println("이름\t전화번호\t주소\t나이\t");
		System.out.println("---------------------------------------------------");
		
		for(int i = 0 ; i < addrList.length ; i++) {
			System.out.printf("%s\t%s\t\t%s\t%d\n",addrList[i].getName(),addrList[i].getTel(),addrList[i].getAddr(),addrList[i].getAge());
		}
		System.out.println("===================================================");
	}
	
}
