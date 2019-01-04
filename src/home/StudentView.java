package home;

import java.util.List;

public class StudentView {
	public static void ViewStudent(Student st) {
		System.out.printf("%10s %5d %5d %5d \n",st.getName(),st.getAge(),st.getHeight(),st.getWeight());
	}

	public static void ViewStudentList(List<Student> list) {
		for(Student st : list) {
			System.out.printf("%10s %5d %5d %5d \n",st.getName(),st.getAge(),st.getHeight(),st.getWeight());
		}
	}
}
