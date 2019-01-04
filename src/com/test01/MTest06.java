package com.test01;

import java.util.*;
import MyScore.score;

public class MTest06 {

	public static void Prn(Set<score> sm) {
		System.out.println("Case 1 ");
		for (score s : sm) {
			System.out.println(s);
		}
	}

	public static void Prn01(Set<score> sm) {
		System.out.println("Case 2 ");
		Iterator<score> is = sm.iterator();
		while (is.hasNext()) {
			score s = is.next();
			if (s.getName().trim().equals("최영준")) {
				s.setName("영준최");
			}
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		Set<score> hs = new HashSet<>();
		hs.add(new score("김국현", 70, 100, 90));
		hs.add(new score("박성아", 90, 90, 90));
		hs.add(new score("이경선", 80, 90, 90));
		hs.add(new score("최영준", 90, 80, 100));

		System.out.println(hs);
		System.out.println();
		Prn(hs);

		System.out.printf("\n\n");
		Prn01(hs);

		System.out.printf("\n\n 박성아 님의 수학점수를 100으로 변경후 출력\n");
		for (score s : hs) {
			if (s.getName().equals("박성아")) {
				s.setMat(100);
			}
		}
		Prn01(hs);

		System.out.printf("\n\n");

		for (score s : hs) {
			if (s.getName().equals("이경선")) {
				s.setKor(85);
				System.out.println(s);
			}
		}
	}
}
