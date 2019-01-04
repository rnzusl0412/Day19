package com.test01;

import java.util.*;

public class MTest02 {
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<>(10,5);
		for(int i = 0; i < 5;i++) {
			v1.add(i);
		}
		v1.add((int)90.5);
		v1.add(5000);
		System.out.println(v1);
		System.out.println("°¹¼ö : " + v1.size());
		System.out.println("¿ë·® : " + v1.capacity());
	}
}
