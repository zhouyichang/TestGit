package zyc.develop.Q22;

import java.security.acl.Permission;

public class SingtonTest {
	
	public static void main(String[] args) {
		
		Person p1 = Person.getInstance();
		Person p2 = Person.getInstance();
		System.out.println(p1==p2);
	}

}
