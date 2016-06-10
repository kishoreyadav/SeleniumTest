import java.util.Scanner;

public class Dowhile {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int val;
		
		/*System.out.println("Enter the Integer number");
		int val =scanner.nextInt();
		while(val!=5)
		{
			System.out.println("Enter the number");
			val=scanner.nextInt();
		} */
		
		do{
			System.out.println("Enter the number");
			val=scanner.nextInt();
		}
		while(val!=5);
		System.out.println("Value is equal to 5");
	}

}
