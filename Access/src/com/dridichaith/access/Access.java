package com.dridichaith.access;
import com.dridichaith.other.*;
public class Access {
	/*
	 *- Default : allows you to access data anywhere within the same package 
	 *
	 *- Private : allows you to access data only within the same class
	 *
	 *- Protected : is similar to default with the only exception that if 
	 *	are extending a class in a different package then thats fine too
	 *	as long as you are extending the original class you are fine.
	 *
	 *- Public : you can access data anywhere 
	 * 
	 */
	public String fn;
	public String ln;
	//this variable is accessible within the access class
	private String adress;
	
	public Access(String fn,String ln ,String adress) {
		this.fn = fn;
		this.ln = ln;
		this.adress = adress;
	}
	void getAdress() {
		System.out.println("Im  a private variable i can get accessed from my own class(Access class) and im : "+adress );
	}
	protected void sayHi() {
		System.out.println("Hi im protected Method(in Access class) called from a sub-class(Other class) in another package.\nmy name is "+fn+" and my last name is "+ln);
	}
	
	void doSomethingAccess() {
		Same s = new Same();
		s.Hello();
		
	}
}
