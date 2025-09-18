package User_defined_Exception;

public class Exec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			User.validate();
		}
		catch(Age e) 
		{
			System.out.println("caught exception"+e);
		}
	}

}
