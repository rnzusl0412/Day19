package home;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Student st01 = new Student("�ε鷡",15,170,55);
		Student st02 = new Student("���޷�",22,165,53);
		Student st03 = new Student("������",20,155,46);
		
		System.out.println("        �̸�     ����       ����     ������");
		System.out.println("==========================");
		StudentView sv = new StudentView();
		
		sv.ViewStudent(st01);
		
		List<Student> all = new ArrayList<>();
		all.add(st01);
		all.add(st02);
		all.add(st03);
		System.out.println("\n");
		sv.ViewStudentList(all);
	}
}
