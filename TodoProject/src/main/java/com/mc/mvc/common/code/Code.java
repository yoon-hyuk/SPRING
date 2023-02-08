package com.mc.mvc.common.code;

public enum Code {
	
	STMP_FROM("ssp04041@naver.com"),
	DOMAIN("http://localhost:8081"),
	//배포시 servlet-context.xml의 resources 경로도 함께 수정
	STORAGE_PATH("C:\\Program Files\\CODE\\storage\\");
	
	
	public String desc;
	
	Code(String desc) {
		this.desc=desc;
	}
	
	@Override
	public String toString() {
		return desc;
	}
	
}
