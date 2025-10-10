package Stream_api;
import java.util.Arrays;

public class Streamop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] Values=new Integer[] {3,4,5,6,7,8};
		//limit returns first n elements
		System.out.println("first 2 elements");
		Arrays.stream(Values).limit(2).forEach(System.out::println);

	}

}
