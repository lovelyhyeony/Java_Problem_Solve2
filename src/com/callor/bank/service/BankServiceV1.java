package com.callor.bank.service;

import com.callor.bank.model.BankVO;

/*
 * 가. bankList() method 를 만들고 BankEx_02에서 만든 배열을 매개변수로 전달받아 리스트를
 * Console에 출력하는 코드를 작성합니다.
 * 나. 리스트를 출력할 때 잔액을 다음과 같이 계산하여 출력합니다.
 */
public class BankServiceV1 {


	public void bankList(BankVO[] banks) {
		
		System.out.println("==============================================");
		System.out.println("입출금 거래 내역서");
		System.out.println("==============================================");
		System.out.println("계좌번호\t날짜\t입금\t출금\t잔액");
		System.out.println("----------------------------------------------");
		
		int valance = 0;
		for(BankVO bVO : banks) {
			
			valance += bVO.getInput();
			valance -= bVO.getOutput();
			
			bVO.setValance(valance);
			
			System.out.printf("%s\t%s\t%d\t%d\t%d\n",
					bVO.getNum(),
					bVO.getDate(),
					bVO.getInput(),
					bVO.getOutput(),
					valance);
		}
		System.out.println("==============================================");
	}
}
