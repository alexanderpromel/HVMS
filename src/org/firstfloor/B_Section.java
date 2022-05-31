package org.firstfloor;

import org.groundfloor.A_Section;

public class B_Section extends A_Section {
	public void firstsStudent() {
		System.out.println("Alex");
	}
	public static void main(String[]args) {
		B_Section b = new B_Section();
		b.firstsStudent();
		
		A_Section a = new A_Section();
		a.firstStudent();
		a.secondStudent();
	}

}
