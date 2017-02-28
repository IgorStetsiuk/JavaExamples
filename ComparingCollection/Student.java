package HomeWork;

public class Student {

	private String name;
	private String lastName;
	private int age;
	private int curse;

	
	
	public Student(String name, String lastName, int age, int curse) {

		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.curse = curse;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCurse() {
		return curse;
	}

	public void setCurse(int curse) {
		this.curse = curse;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", lastName=" + lastName + ", age=" + age + ", curse=" + curse + "]";
	}

	


}
