package com.murat.blogproject.exception;

import java.sql.Timestamp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BlogProjectRestExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<BlogProjectErrorResponse> handleException(PostNotFoundException exc) 
	{
		BlogProjectErrorResponse res=new BlogProjectErrorResponse();
		res.setStatus(HttpStatus.NOT_FOUND.value());
		res.setMessage(exc.getMessage());
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		res.setTimeStamp(timestamp.toString());
		return new ResponseEntity<BlogProjectErrorResponse>(res, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<BlogProjectErrorResponse> handleException(Exception exc) 
	{
		BlogProjectErrorResponse res=new BlogProjectErrorResponse();
		res.setStatus(HttpStatus.BAD_REQUEST.value());
		res.setMessage(exc.getMessage());
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		res.setTimeStamp(timestamp.toString());
		return new ResponseEntity<BlogProjectErrorResponse>(res, HttpStatus.BAD_REQUEST);
	}
}
