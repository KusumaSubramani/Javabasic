package Exception_handeling;

public class Demo {

	public static void main(String[] args) {
		int d=0;
		try {
		int a=42/d;
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception handeled" +e.getMessage());
		}
		System.out.println("will not be printed");

	}

}
