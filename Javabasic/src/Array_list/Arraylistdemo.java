package Array_list;
import java.util.ArrayList;

public class Arraylistdemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();//raw
		System.out.println("the size of the arraylist"+list.isEmpty());
		System.out.println("the size of the arraylist"+list.size());
		list.add(1);
		list.add(1);//can add duplicate elements
		list.add(4);
		list.add(555);
		list.add(null);// can add null values
		System.out.println("the size of the arraylist"+list.isEmpty());
		System.out.println("the size of the arraylist"+list.size());
		System.out.println("the size of the arraylist"+list);
		System.out.println("the size of the arraylist"+list.contains(666));//to check weather the elements is prestent in the list or not
		list.remove(1);
		System.out.println("the size of the arraylist"+list);
		System.out.println("element the position"+list.get(0));
	}

}
