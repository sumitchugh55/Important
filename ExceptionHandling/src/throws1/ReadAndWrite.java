package throws1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadAndWrite {
public static void main(String[] args) {
	sumit sc=new sumit();
	try {
		sc.read();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	try {
		sc.write();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
}
}
class sumit{
	void read() throws FileNotFoundException {
		FileInputStream fs=new FileInputStream("d:/abc.txt");
	}
	void write() throws FileNotFoundException{
		FileOutputStream fs=new FileOutputStream("d:/abc.txt");
	}
	
	
}

