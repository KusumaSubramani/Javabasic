package Stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

 class Intermediateo_operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>country=Arrays.asList("india","nepal","karnataka","manglore","banglore");
		List<String>up=country.stream().map(String::toUpperCase).
				collect(Collectors.toList());
		System.out.println(up);
		
		List<Integer>even=Arrays.asList(1,2,3,4,5,6,7,8,9,0);
		List<Integer>li=even.stream().filter(n->n%2==0).
				collect(Collectors.toList());
		System.out.println(li);

	}

}
