package org.firstfloor;

public class A_Section extends B_Section {
	public void firstStudent() {
		System.out.println("Antony");
	}
	public void secondStudent() {
		System.out.println("Hari");
		
	}
	public void thridStudent() {
		System.out.println("Prithvi");
	}
	
	public static void main(String[]args) {
		A_Section a = new A_Section();
		a.firstStudent();
		a.secondStudent();
		a.thridStudent();
	}

}
