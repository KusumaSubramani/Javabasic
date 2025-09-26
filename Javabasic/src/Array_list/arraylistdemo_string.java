package Array_list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class arraylistdemo_string {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		System.out.println("the size of the arraylist"+list);
		System.out.println("is empty or not"+list.isEmpty());
		list.add("kusuma");
		list.add("muskan");
		list.add("ramya");
		list.add("ramya");
		list.add("kavya");
		list.add("sudarshan");
		list.add("meghana");
		System.out.println("the size of the arraylist"+list);
		System.out.println("the size of the arraylist"+list.size());
		list.remove("sudarshan");
		System.out.println("the size of the arraylist"+list);
		list.add("sudarshan");
		Collections.sort(list);//sorting of elements
		System.out.println("the size of the arraylist"+list);
		Iterator<String> i=list.iterator();
		while(i.hasNext()) {
			String nm=i.next();
			System.out.println(nm);
			list.remove("ramya");
			System.out.println("the size of the arraylist"+list);}
	}

}
