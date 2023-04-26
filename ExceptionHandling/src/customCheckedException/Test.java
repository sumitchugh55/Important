package customCheckedException;

public class Test {
	public static void main(String[] args) {
		int age=17;
		try {
			if(age<18) {
				throw new UnderAgeException("tu vote nhi de sakta");
			}
			else
			{
				System.out.println("You can vote");
			}
		} catch (UnderAgeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}

	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}

}
class UnderAgeException extends Exception
{
	
	public UnderAgeException() {
		// TODO Auto-generated constructor stub
		super("You cannot vote age is less");
	}
	
	public UnderAgeException(String msg) {
		super(msg);
	}
}
