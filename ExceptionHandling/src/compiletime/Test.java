package compiletime;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream("d:/abc.txt");
		Class.forName("com.mysql.jdbc.cj.Driver");
	}

}
