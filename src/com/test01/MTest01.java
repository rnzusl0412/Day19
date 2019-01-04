package com.test01;

import java.util.*;

public class MTest01 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Vector v = new Vector();
		v.add("abc");
		v.add("222");
		v.add("doc");
		v.add(null);
		v.add(null);
		
		System.out.println(v);
		System.out.println(v.get(1));
		
		v.remove(2);
		System.out.println(v);
		
		v.set(0, "ABC");
		System.out.println(v);
		
		System.out.println("°¹¼ö : " + v.size());
		System.out.println("¿ë·® : " + v.capacity());
	}
}
