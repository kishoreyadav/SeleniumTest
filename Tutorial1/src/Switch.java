import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the cmd");
      String cmd = scanner.nextLine();
      switch(cmd)
      {
      case "Start" :
    	  System.out.println("System startted");
    	  break;
      case "Stop" :
    	  System.out.println("System stopped");
    	  break;
      default :
    	  System.out.println("cmd not recognozed");
      }
	}

}
