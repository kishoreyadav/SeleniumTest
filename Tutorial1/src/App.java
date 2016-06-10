import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("text.txt");
		FileReader fr = new FileReader(f);

	}

}
