package home;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Student st01 = new Student("민들래",15,170,55);
		Student st02 = new Student("진달래",22,165,53);
		Student st03 = new Student("개나리",20,155,46);
		
		System.out.println("        이름     나이       신장     몸무게");
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
