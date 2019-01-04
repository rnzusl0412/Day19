package com.test02;

import java.util.*;

public class HTest02 {
	public static void Prn(Map<Integer, String> hm) {
		System.out.println("For Loop");
		for (Integer key : hm.keySet()) {
			System.out.println(key + " => " + hm.get(key));
		}

	}

	public static void Prn01(Map<Integer, String> hm) {
		System.out.println("값만 출력");
		Set<Integer> res = hm.keySet();
		Iterator<Integer> ir = res.iterator();
		while (ir.hasNext()) {
			System.out.println(ir.next());
		}
	}

	public static void Prn02(Map<Integer, String> rm) {
		Collection<String> col = rm.values();
		Iterator<String> ir = col.iterator();
		while (ir.hasNext()) {
			System.out.println(ir.next());
		}
	}

	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<>();
		Calendar today = Calendar.getInstance();
		System.out.println(today.getTime());

		hm.put(1, "일요일");
		hm.put(2, "월요일");
		hm.put(3, "화요일");
		hm.put(4, "수요일");
		hm.put(null, "널");
		hm.put(5, "목요일");
		hm.put(6, "금요일");
		hm.put(7, "토요일");
		hm.put(8, null);

		System.out.println(hm);
		System.out.println("전체 출력");
		Prn(hm);
		System.out.println("키값만 출력");
		Prn01(hm);
		System.out.println();
		Prn02(hm);

		System.out.println("키가 1을 가지고 있는지 확인 : " + hm.containsKey(1));

		System.out.println("value 월요일이 있는지 확인 : " + hm.containsValue("월요일"));

	}
}
