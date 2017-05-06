package com.multithreading.sleep;

public class Main {

	public static void main(String[] args) {
		Sleep t1 = new Sleep();
		Sleep t2 = new Sleep();

		t1.start();
		t2.start();

	}

}
