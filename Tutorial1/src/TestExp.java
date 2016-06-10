
public class TestExp {

	public static void main(String[] args) {

		doStuff();

	}

	public static void doStuff() {
		doMoreStuff();
	}

	public static void doMoreStuff()

	{
		try {
			System.out.println(10/0);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled");
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		
	}

}
