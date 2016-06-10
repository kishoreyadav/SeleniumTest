//static variables can be accessed by class name and for non static variables can always be accessed through reference variable

class Employee {
	public static String name = "Kishore";
	public static int id = 518851;
	public String testResult;

}

public class Static {
public static void main(String[] args)
{
	Employee e1 = new Employee();
	e1.testResult="Pass";
	System.out.println("Employee name is "+  Employee.name  + "Employee id is "+Employee.id + "Employee Result is " +e1.testResult);
}
}