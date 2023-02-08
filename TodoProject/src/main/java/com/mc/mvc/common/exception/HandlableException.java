package com.mc.mvc.common.exception;

import com.mc.mvc.common.code.ErrorCode;

public class HandlableException  extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4852131138162334712L;

	
	public ErrorCode error;


	public HandlableException(ErrorCode error) {
		this.error=error;
	}

	public HandlableException(ErrorCode error,Exception e) {
		this.error=error;
		e.printStackTrace();
	}
	
	
	
}
