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
		vm.add(new score("�豹��", 80, 100, 70));
		vm.add(new score("�ֿ���", 100, 70, 90));
		vm.add(new score("�ڼ���", 100, 90, 90));
		vm.add(new score("�̰漱", 90, 80, 90));
		vm.add(new score("�̰漱", 90, 80, 90));
		// vm.add(null);

		System.out.println("��ü ���");
		Prn(vm);
		System.out.printf("\n\n 1. �豹���� �̸��� ���������� ���� �� ��ü ���\n");
		for (score r : vm) {
			if (r.getName().equals("�豹��")) {
				r.setName("������");
			}
		}
		Prn01(vm);
		System.out.printf("\n\n 2. �ֿ����� ���� ������ 90���� ���� �� ��ü ���\n");
		for (score r : vm) {
			if (r.getName().equals("�ֿ���")) {
				r.setKor(90);
			}
		}
		Prn02(vm);
		System.out.printf("\n\n 3. �ڼ����� ���� ������ 95���� ���� �� ��ü ���\n");
		for (score r : vm) {
			if (r.getName().equals("�ڼ���")) {
				r.setMat(95);
			}
		}
		Prn02(vm);
		System.out.printf("\n\n 4. �̰漱�� �̸��� ����ִ� ��ü�� �ε����� ������.\n");
		for (score r : vm) {
			if (r.getName().trim().equals("�̰漱")) {
				System.out.println(vm.indexOf(r) + "��°");
			}
		}
		System.out.print("\n\n");
		vm.remove(0);
		Prn(vm);
		System.out.print("\n\n");
		vm.set(1, new score("111", 90, 80, 70));
		System.out.println("====> �߰�" + vm.get(1));
		Prn(vm);
	}
}
