package RuntimeCustomException;

public class Voting1 {
	public static void main(String[] args) {
		int age = 17;
		try {
			if (age < 18) {
				throw new UnderAgeException("age less");
			} else {
				System.out.println("Allowed");}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("hello");

	}

}

class UnderAgeException extends RuntimeException {
	UnderAgeException() {
		super("your age is less");

	}

	UnderAgeException(String msg) {
		super(msg);
	}
}
