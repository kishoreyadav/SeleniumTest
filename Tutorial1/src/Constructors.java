//Constructors are basically used for initializing the variable

class Machine 
{
	private String name,status;
	private int weight;
	
	public Machine(String name,String status,int weight)
	{
		this.name=name;
		this.status=status;
		this.weight=weight; 
		System.out.println("Machine name is : " + name + " Machine status : " + status + " Machine weight " +weight );
	}
}

public class Constructors {
	public static void main(String[] args) {
       Machine m1 = new Machine("hp","on",2);
	}
}
