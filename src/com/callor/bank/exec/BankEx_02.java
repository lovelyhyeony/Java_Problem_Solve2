package com.callor.bank.exec;


import com.callor.bank.model.BankVO;
import com.callor.bank.service.BankServiceV1;

/*
 * 가. BankVO 클래스를 사용하여 인스턴스 배열 5개를 생성하고 초기화하시오
 * 나. 계좌번호는 “001”로 하고 날짜는 순서대로 2020-05-01 ~ 2020-05-05 저장합니다.
 * 다. 2020-05-01과, 2020-05-03에 입금 5,000원,
 * 2020-05-02, 05-04, 05-05에 출금 1,000원을 저장합니다.
 * 라. 다음의 BankServiceV1 클래스를 사용하여 입출금 거래 내역서를 출력합니다.
 */
public class BankEx_02 {

	public static void main(String[] args) {

		int bank = 5;

		BankServiceV1 bService = new BankServiceV1();
		// 인스턴스 배열 5개 선언 및 초기화
		BankVO[] banks = new BankVO[bank];

		// BankVO 생상자로 배열 초기화 해주기
		for (int i = 0; i < banks.length; i++) {
			banks[i] = new BankVO();
		}

		// 번호 저장
		for(BankVO bVO : banks) {
			bVO.setNum("001");
		}
		
		int i = 0;
		for(BankVO bVO : banks) {
			bVO.setDate("2020-05-0"+(i+1));
		}
		
		// 입금액 설정
		banks[0].setInput(5000);
		banks[2].setInput(5000);
		
		// 출금액 설정
		banks[1].setOutput(1000);
		banks[3].setOutput(1000);
		banks[4].setOutput(1000);
		
		bService.bankList(banks);
	}
}
