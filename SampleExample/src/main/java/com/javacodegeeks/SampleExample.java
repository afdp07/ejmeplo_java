package com.javacodegeeks;

import java.util.List;
import java.util.ArrayList;

public class SampleExample {
	private static List<Integer> integers = null;
	
	public static void SampleExample() {
		integers = new ArrayList<Integer> ();
	}
	
	public static void addInteger(int num) {
		integers.add(num);
	}
	
	public static int getSize() {
		return integers.size();
	}
	public static void main(String args[]){
System. out. println("Hello Java");
}
}
