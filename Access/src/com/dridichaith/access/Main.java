package com.dridichaith.access;
import com.dridichaith.other.*;
public class Main {
	public static void main(String[] args) {
		Access a = new Access("Dridi","Chaith","Mateur");
		Other o = new Other("Boukarma","Nawfel","Sousse");
		o.doSomethingOther();
		System.out.println("-".repeat(49));
		a.doSomethingAccess();
		System.out.println("-".repeat(49));
		a.getAdress();
	}
}
