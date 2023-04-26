package throws1;

public class Gaurav extends RuntimeException{

	 Gaurav(String msg) {
		super();
		// TODO Auto-generated constructor stub
	}
	

}

class Test{
	public static void main(String[] args) {
		
		int age=17;
		if(age<18) {
		throw new Gaurav("you are bad");
		}
		else
			System.out.println("good");
	}
}
