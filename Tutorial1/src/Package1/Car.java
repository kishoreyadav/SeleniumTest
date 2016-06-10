package Package1;

public class Car extends CmpEmployee{
	
	

	@Override
	public void start() {
	 System.out.println("Car is started");
	}

	@Override
	public void stop() {
		System.out.println("Car is stopped");
	}

	public void colour()
	{
		System.out.println("Colour is red");
	}
}
