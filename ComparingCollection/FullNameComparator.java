package HomeWork;

import java.util.Comparator;

public class FullNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		int k = o1.getName().compareToIgnoreCase(o2.getName());
		if (k == 0) {
			k = o1.getLastName().compareToIgnoreCase(o2.getLastName());
		}

		return k;
	}

}
