package com.callor.address.model;

/*
 * 가. 다음 필드변수를 갖는 AddressVO 클래스를 작성합니다.
 * 나. 이름(문자열) : name
 * 	전화번호(문자열) : tel
 * 	주소(문자열) : addr
 * 	나이(정수) : age
 * 다. 필드 변수는 모두 private로 하고 getter, setter를 구현합니다.
 */
public class AddressVO {

	private String name ;
	private String tel ;
	private String addr ;
	private int age ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
