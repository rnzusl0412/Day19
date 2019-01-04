package com.test01;

import java.util.*;
import MyScore.score;;

public class MTest04 {

	public static void Prn(List<score> v) {
		System.out.println("Case 1 : for(each) ");
		for (score sm : v) {
			System.out.println(sm);
		}
	}

	public static void Prn01(List<score> v) {
		System.out.println("Case 2 : for ");
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
	}

	public static void Prn02(List<score> v) {
		System.out.println("Case 3 : iterator ");
		Iterator<score> v1 = v.iterator();
		while (v1.hasNext()) {
			System.out.println(v1.next());
		}
	}

	public static void Prn03(List<score> v) {
		System.out.println("Case 4 : index ");

	}

	public static void main(String[] args) {
		List<score> vm = new ArrayList<>();
		vm.add(new score("김국현", 80, 100, 70));
		vm.add(new score("최영준", 100, 70, 90));
		vm.add(new score("박성아", 100, 90, 90));
		vm.add(new score("이경선", 90, 80, 90));
		vm.add(new score("이경선", 90, 80, 90));
		// vm.add(null);

		System.out.println("전체 출력");
		Prn(vm);
		System.out.printf("\n\n 1. 김국현의 이름을 국현김으로 변경 후 전체 출력\n");
		for (score r : vm) {
			if (r.getName().equals("김국현")) {
				r.setName("국현김");
			}
		}
		Prn01(vm);
		System.out.printf("\n\n 2. 최영준의 국어 점수를 90으로 변경 후 전체 출력\n");
		for (score r : vm) {
			if (r.getName().equals("최영준")) {
				r.setKor(90);
			}
		}
		Prn02(vm);
		System.out.printf("\n\n 3. 박성아의 수학 점수를 95으로 변경 후 전체 출력\n");
		for (score r : vm) {
			if (r.getName().equals("박성아")) {
				r.setMat(95);
			}
		}
		Prn02(vm);
		System.out.printf("\n\n 4. 이경선의 이름이 들어있는 객체의 인덱스를 구하자.\n");
		for (score r : vm) {
			if (r.getName().trim().equals("이경선")) {
				System.out.println(vm.indexOf(r) + "번째");
			}
		}
		System.out.print("\n\n");
		vm.remove(0);
		Prn(vm);
		System.out.print("\n\n");
		vm.set(1, new score("111", 90, 80, 70));
		System.out.println("====> 추가" + vm.get(1));
		Prn(vm);
	}
}
