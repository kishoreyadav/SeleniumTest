//*encapsulation

class Student {
	private String name;
	private int id;

	public void setName(String name) {
		this.name= name;
	}
	 public String getName()
	 {
		 return name;
	 }
	public void setID(int id)
	{
		this.id=id;
	}
	public int getID()
	{
		return id;
	}
}

public class This {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setName("Kishore");
		s1.setID(518851);
		System.out.println("Sudent name is : " + s1.getName() + " and Student Id id : "+s1.getID());
		Student s2 = new Student();
		s2.setName("Yadav");
		s2.setID(5188);
		System.out.println("Sudent name is : " + s2.getName() + " and Student Id id : "+s2.getID());
	}
}
