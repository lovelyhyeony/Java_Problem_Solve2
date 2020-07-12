package com.callor.address.exec;

import com.callor.address.model.AddressVO;
import com.callor.address.service.AddrServiceV1;

public class AddrEx_03 {

	public static void main(String[] args) {
		
		// 객체생성
		AddrServiceV1 aService = new AddrServiceV1();
		
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
		
		aService.addrList(addrList);
	}
}
