package Task1;

public class Human {

	@MyAnnotation("Name is good")
	private String name;
	@MyAnnotation("Age is young")
	private int age;
	@MyAnnotation("Mass is normal")
	private int mass;

	public Human(String name, int age, int mass) {
		super();
		this.name = name;
		this.age = age;
		this.mass = mass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMass() {
		return mass;
	}

	public void setMass(int mass) {
		this.mass = mass;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", mass=" + mass + "]";
	}

}
