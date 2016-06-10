import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestCheckedExp {
 public static void main(String[] args) throws FileNotFoundException {
	PrintWriter pw = new PrintWriter("abc.txt");
	System.out.println("Hello");
	System.out.println(10/0);
}
}
