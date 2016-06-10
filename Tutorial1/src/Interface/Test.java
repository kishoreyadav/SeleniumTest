package Interface;

public class Test {
	public static void main(String[] args) {

		Machine m1 = new Machine();
		m1.start();
		Person p1 = new Person("Kishore");
		p1.greet();
		Info info1 = new Machine();
		info1.showInfo();
		Info info2 = new Person("Rajesh");
		info2.showInfo();
		
	}
}
