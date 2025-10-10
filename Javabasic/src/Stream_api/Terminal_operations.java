package Stream_api;
import java.util.Arrays;
import java.util.List;
import java.util.IntSummaryStatistics;

public class Terminal_operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to get count,min, max,sum, and average for the numbers
		List<Integer>prime=Arrays.asList(2,3,4,5,6,7);//getting source from arrays
		
		IntSummaryStatistics stats=prime.stream().mapToInt((x)->x).summaryStatistics();
		System.out.println("Highest prime number in list:"+ stats.getMax());
		System.out.println("lowest prime number in list:"+ stats.getMin());
		System.out.println("sum of all  prime number in list:"+ stats.getSum());
		System.out.println("average of all  prime number in list:"+ stats.getAverage());
		
		

	}

}
