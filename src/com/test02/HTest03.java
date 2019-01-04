package com.test02;

import java.util.*;
import java.util.Map.Entry;

import encore.playdata.platform03.*;

public class HTest03 {

	public static void main(String[] args) {
		Map<Integer, Address> hm = new HashMap<>();
		hm.put(1, new Address("�豹��", "����", "010"));
		hm.put(2, new Address("������", "����", "4360"));
		hm.put(3, new Address("���·�", "�Ⱦ�", "4941"));
		Prn_View(hm);
	}

	public static void Prn_View(Map<Integer, Address> hm) {
		System.out.println("hm ���  \n" + hm);
		System.out.printf("\n\n");

		Set<Entry<Integer, Address>> my_set = hm.entrySet();
		System.out.println("my_set ���  \n" + my_set);
		System.out.printf("\n\n");

		Iterator<Entry<Integer, Address>> ir = my_set.iterator();
		System.out.println("ir ���  " + ir);
	
		System.out.printf("\n\n");
		System.out.println(ir.next());
		System.out.println("while(ir.hasNext) ��� \n");
		while (ir.hasNext()) {
			Entry<Integer, Address> e = ir.next();
			System.out.println(e.getKey() + " : " + e.getValue());
		}
	}
}
