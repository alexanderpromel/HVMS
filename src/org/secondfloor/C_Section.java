package org.secondfloor;

import org.firstfloor.B_Section;

public class C_Section extends B_Section{
	public void blackGuy() {
		System.out.println("Shahul");
	}
	public static void main(String[]args) {
		C_Section c = new C_Section();
		c.blackGuy();
		
		B_Section b = new B_Section();
		b.firstsStudent();
		b.firstStudent();
		b.secondStudent();
	}

}
