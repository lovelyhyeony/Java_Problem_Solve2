package com.callor.address.exec;

import com.callor.address.model.AddressVO;

/*
 * 가. 진입점 main() method를 작성하고 다음을 수행합니다.
 * 나. AddressVO를 사용하여 객체(인스턴스) address1, address2, address3를 생성합니다.
 * 다. address1, address2, address2, 3개의 인스턴스에 이름, 주소, 전화번호, 나이 저장합니다.
 * 라. 각 인스턴스에 저장된 값을 다음과 같이 console에 출력합니다.
 */
public class AddrEx_01 {

	public static void main(String[] args) {

		AddressVO address1 = new AddressVO();
		AddressVO address2 = new AddressVO();
		AddressVO address3 = new AddressVO();

		// 이름 저장
		address1.setName("홍길동");
		address2.setName("이몽룡");
		address3.setName("성춘향");

		// 주소 저장
		address1.setAddr("광주광역시");
		address2.setAddr("인천광역시");
		address3.setAddr("서울특별시");

		// 전화번호 저장
		address1.setTel("010-111");
		address2.setTel("010-222");
		address3.setTel("010-333");

		// 나이 저장
		address1.setAge(30);
		address2.setAge(15);
		address3.setAge(20);
		
		// address1 출력
		System.out.println("====================================================");
		System.out.println("address1");
		System.out.println("====================================================");

		System.out.printf("%s : %s\n", "이름", address1.getName());
		System.out.printf("%s : %s\n", "주소", address1.getAddr());
		System.out.printf("%s : %s\n", "전화번호", address1.getTel());
		System.out.printf("%s : %d\n", "나이", address1.getAge());

		System.out.println("====================================================");

		// address2 출력
		System.out.println("====================================================");
		System.out.println("address2");
		System.out.println("====================================================");

		System.out.printf("%s : %s\n", "이름", address2.getName());
		System.out.printf("%s : %s\n", "주소", address2.getAddr());
		System.out.printf("%s : %s\n", "전화번호", address2.getTel());
		System.out.printf("%s : %d\n", "나이", address2.getAge());

		System.out.println("====================================================");

		// address1 출력
		System.out.println("====================================================");
		System.out.println("address3");
		System.out.println("====================================================");

		System.out.printf("%s : %s\n", "이름", address3.getName());
		System.out.printf("%s : %s\n", "주소", address3.getAddr());
		System.out.printf("%s : %s\n", "전화번호", address3.getTel());
		System.out.printf("%s : %d\n", "나이", address3.getAge());

		System.out.println("====================================================");

	}
}
