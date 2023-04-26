package runtime;

public class Test {
	public static void main(String[] args) {
		int a=10,b=0;
		int c;
		try {
			c=a/b;
			System.out.println(c);
		} catch (Exception e) {
			// TODO: handle exception
//			System.out.println("Not to divide by zero");
			e.printStackTrace();
//			System.out.println(e);
		}
//		System.out.println("sumti");
		
		
		//Throws runtime exception
	}
	
	

}
