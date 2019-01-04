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
		System.out.println("���� ���");
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

		hm.put(1, "�Ͽ���");
		hm.put(2, "������");
		hm.put(3, "ȭ����");
		hm.put(4, "������");
		hm.put(null, "��");
		hm.put(5, "�����");
		hm.put(6, "�ݿ���");
		hm.put(7, "�����");
		hm.put(8, null);

		System.out.println(hm);
		System.out.println("��ü ���");
		Prn(hm);
		System.out.println("Ű���� ���");
		Prn01(hm);
		System.out.println();
		Prn02(hm);

		System.out.println("Ű�� 1�� ������ �ִ��� Ȯ�� : " + hm.containsKey(1));

		System.out.println("value �������� �ִ��� Ȯ�� : " + hm.containsValue("������"));

	}
}
