import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
     //create scanner object
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Enter the inter");
		 //String userInput=input.nextLine();
		 int userInput = input.nextInt();
		 System.out.println(userInput);
	}
}
