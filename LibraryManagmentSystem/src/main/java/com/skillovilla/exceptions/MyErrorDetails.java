package com.skillovilla.exceptions;

import java.time.LocalDateTime;

public class MyErrorDetails {

	private LocalDateTime timeStamp;
	
	private String msg;
	
	private String description;
	
	public MyErrorDetails() {
		// TODO Auto-generated constructor stub
	}

	public MyErrorDetails(LocalDateTime timeStamp, String msg, String description) {
		super();
		this.timeStamp = timeStamp;
		this.msg = msg;
		this.description = description;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
