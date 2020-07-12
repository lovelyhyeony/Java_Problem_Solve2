package com.callor.bank.exec;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.callor.bank.model.BankVO;

/*
 * 가. 진입점 main() method를 만들고 다음을 수행합니다.
 * 나. BankVO 클래스를 사용하여 인스턴스 배열 5개를 선언하고 초기화합니다.
 * 다. 배열 요소 순서대로 계좌번호에 “001” ~ “005”저장
 * 라. 날짜 : 오늘 날짜 저장
 * 마. 계좌번호 001, 003에는 각 입금 5,000원을
 * 	002, 004, 005에는 각 출금 1,000원을 저장하시오
 */
public class BankEx_01 {

	public static void main(String[] args) {

		int bank = 5;

		// 인스턴스 배열 5개 선언 및 초기화
		BankVO[] banks = new BankVO[bank];

		// BankVO 생상자로 배열 초기화 해주기
		for (int i = 0; i < banks.length; i++) {
			banks[i] = new BankVO();
		}

		// 번호 저장
		banks[0].setNum("001");
		banks[1].setNum("002");
		banks[2].setNum("003");
		banks[3].setNum("004");
		banks[4].setNum("005");
		
		// 오늘날짜 설정하기
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = dateFormat.format(date);

		for(BankVO bVO : banks) {
			bVO.setDate(String.format("%s", strDate));
		}
		
		// 입금액 설정
		banks[0].setInput(5000);
		banks[2].setInput(5000);
		
		// 출금액 설정
		banks[1].setOutput(1000);
		banks[3].setOutput(1000);
		banks[4].setOutput(1000);
		
	}
}
