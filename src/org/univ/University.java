package org.univ;

public class University extends College{

	public int ug() {
		return 10;
	}
	
	public int pg() {
		return 20;
	}
	
	
	public static void main(String[] args) {
		
		University Uni= new University();
		System.out.println(Uni.pg());
		
	}
}
