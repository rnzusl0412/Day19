package com.test01;

import java.util.HashSet;

public class MTest05 {
	public static void main(String[] args) {
		HashSet<Integer> h1 = new HashSet<>();
		h1.add(100);
		h1.add(500);
		h1.add(519);
		h1.add(500);
		h1.add(null);
		h1.add(null);
		
		System.out.println(h1);
	}
}
