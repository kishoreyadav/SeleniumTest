import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestE {

	public static void main(String[] args) {
		try {
			readFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	
	public static void readFile() throws FileNotFoundException
	{
		File f = new File("text.txt");
	
			FileReader fr = new FileReader(f);
	}
}