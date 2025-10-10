package Generics;

public class Generic_method {
	public<T>void displayArrayElements (T[] elements){
		for(T ele:elements) {
			System.out.println("elements is"+ele);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Generic_method obj=new Generic_method();
Integer[] intarray= {10,20,30,40};
String[] strarr={"hello","hey"};
obj.displayArrayElements(intarray);
obj.displayArrayElements(strarr);
	}

}
