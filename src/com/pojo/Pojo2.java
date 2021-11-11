package com.pojo;

public class Pojo2 {

	public static void main(String[] args) {
		Pojo1 pojo = new Pojo1();
		int a = pojo.getA();
		System.out.println(a);
		pojo.setA(20);
		int a2 = pojo.getA();
		System.out.println(a2);
	}

}
