package zyc.develop.Q22;

public class Person {
	
	private static Person person = new Person();
	private Person(){}
	public static Person getInstance(){
		return person;
	}

}
