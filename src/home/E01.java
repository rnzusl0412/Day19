package home;

class Student0 {
	String name;

	Student0(String name) {
		this.name = name;
	}

	public boolean equals(Object obj) {
		Student0 s = (Student0) obj;
		return this.name == s.name;
	}
}

public class E01 {
	public static void main(String[] args) {
		Student0 s1 = new Student0("egoing");
		Student0 s2 = new Student0("egoing");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

	}
}
