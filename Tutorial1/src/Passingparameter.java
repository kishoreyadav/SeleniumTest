class Computer
{
	public void Size(int size)
	{
		System.out.println("Size od the computer is  " + size);
	}
	
	public void Colour(String colour)
	{
		System.out.println("Computer colour is "+ colour);
	}
}




public class Passingparameter {

	public static void main(String[] args) {
		
		Computer c1= new Computer();
		c1.Size(40);
		c1.Colour("Black");

	}

}
