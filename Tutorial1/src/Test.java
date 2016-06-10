class Person {
	String name;
	int age;

	void speak() {
		System.out.println("My name is " + name + " and I am " + age);
	}

	int retirementAge() {
		int retirementleft = 65 - age;
		return retirementleft;

	}
	int getAge()
	{
		return age;
		
	}
	String getName()
	{
		return name;
		
	}
}

public class Test {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "Kishore";
		p1.age = 28;
		p1.speak();
		int retirep1 = p1.retirementAge();
		System.out.println("P1 retirement remaining year is " + retirep1);
		int age=p1.getAge();
		String name=p1.getName();
		System.out.println(name);
		System.out.println(age);
		Person p2 = new Person();
		p2.name = "Rajesh";
		p2.age = 25;
		int retirep2 = p2.retirementAge();
		p2.speak();
		System.out.println("P2 retirement remaining year is " + retirep2);
	}
}
