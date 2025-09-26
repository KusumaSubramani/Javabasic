package lamda_expression;
import java.util.ArrayList;

//demo for collections
public class LambdaCollections {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		a1.add(6);
		
		
		//for each
		//for(Integer ele:a1) {
			//System.out.println(ele);
		//}
		a1.forEach(ele->System.out.println(ele));
		

	}

}
