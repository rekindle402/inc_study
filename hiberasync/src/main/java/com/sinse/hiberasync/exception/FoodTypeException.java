package com.sinse.hiberasync.exception;

public class FoodTypeException extends RuntimeException{
	public FoodTypeException(String msg) {
		super(msg);
	}
	
	public FoodTypeException(Throwable e) {
		super(e);
	}
	
	public FoodTypeException(String msg, Throwable e) {
		super(msg, e);
	}
}
