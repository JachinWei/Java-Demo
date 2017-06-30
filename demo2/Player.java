package com.wyg.demo2;

public class Player {
	int number = 0;
	
	public void guess(){
		number = (int)(Math.random() * 10);
		System.out.println("I'm guessing " + number);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
