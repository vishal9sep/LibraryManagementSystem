package com.skillovilla.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@Controller
public class GlobalExceptionHandler {
	
	@ExceptionHandler(UserException.class)
	public ResponseEntity<MyErrorDetails> studentException(UserException se, WebRequest req){
			
		MyErrorDetails error = new MyErrorDetails();
		
		error.setTimeStamp(LocalDateTime.now());
		error.setMsg(error.getMsg());
		error.setDescription(req.getDescription(false));
			
		return new ResponseEntity<MyErrorDetails>(error, HttpStatus.BAD_REQUEST);			
	}

}
