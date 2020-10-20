package com.dridichaith.other;
import com.dridichaith.access.*;
public class Other extends Access {

	public Other(String fn, String ln, String adress) {
		super(fn, ln, adress);
	}
	
	public void doSomethingOther() {
		System.out.println("Im doSomethingOther public method from Other class i can get acceced anywhere");
		System.out.println("-".repeat(49));
		//we called a protected method (from access class) from a subclass (Other class) in another package
		sayHi();
	}
}
