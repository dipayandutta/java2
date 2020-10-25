import java.util.*;
public class ArrayListExample01 {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Grapes");
		
		System.out.println(list);
		
		ArrayList<Integer> list_int = new ArrayList<Integer>();
		list_int.add(10);
		list_int.add(20);
		
		
		int[] numbers = {-9,19,20};
		for(int num:numbers) {
			list_int.add(num);
		}
		
		System.out.print(list_int);
	}
}
