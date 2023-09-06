package com.example.food_map.constants;

public enum RtnCode {


	SUCCESSFUL("200", "successful!"),
	DATA_ERROR("400","data error!"),
	INSUFFICIENT_BALANCE("400","insufficient balance!"),
	ACCOUNT_EXISTED("400","account existed!"),
	ACCOUNT_NOTFOUND("404","account notfound!");
	
	private String code;
	
	private String message;
	
	
	
	private RtnCode(String code, String message) {
		this.code = code;
		this.message = message;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
