package HomeWork;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		List<Student> students = new LinkedList<>();
		students.add(new Student("Igor", "Petrovuch", 20, 2));
		students.add(new Student("Roman", "Stefanko", 20, 4));
		students.add(new Student("Taras", "Zabyh", 20, 2));
		students.add(new Student("Taras", "Bass", 18, 3));
		students.add(new Student("Nazar", "Danilak", 7, 4));
		students.add(new Student("Dmuro", "Nerobko", 19, 1));
		students.add(new Student("Igor", "Romanovuch", 20, 2));

		printStudents(students, 4);

		/* First variant */
		students.sort(new NameComparator());
		System.out.println("Sort by name");

		for (Student student : students) {
			System.out.println(student);
		}

		/* Second variant */
		students.sort(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {

				return o1.getAge() - o2.getAge();
			}

		});

		System.out.println("Compare by age");
		for (Student student : students) {
			System.out.println(student);
		}

		/* Third variant */
		 FullNameComparator fullComparator = new FullNameComparator();
		 Collections.sort(students, fullComparator);
		
		 System.out.println("Sort by name and surname ");
		 for (Student student : students) {
		 System.out.println(student);
		 }

		/* Fourth variant */
		NameComparator nameComparator = new NameComparator();
		LastNameComparator lastNameComparator = new LastNameComparator();
		Comparator<Student> compareNameThenLastName = nameComparator.thenComparing(lastNameComparator);

		students.sort(compareNameThenLastName);

		System.out.println("\nSort by method thenComparing() :\n");
		for (Student student : students) {
			System.out.println(student);
		}
		
		
		/* Five variant */
		Comparator<Student> compareByCourse = new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				
				return o2.getCurse()-o1.getCurse();
			}
		};
		
		Collections.sort(students,compareByCourse.reversed());
		
		System.out.println("\nSort by course :\n");
		for (Student student : students) {
			System.out.println(student);
		}
		
	}

	static void printStudents(List students, Integer course) {

		Iterator<Student> iterator = students.iterator();
		while (iterator.hasNext()) {
			Student st = (Student) iterator.next();
			if (st.getCurse() == (course)) {
				String name = st.getName();
				System.out.println(name);
			}

		}

	}
}