package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = { "john", "athira", "smith", "suchi" };
		System.out.println("the name in 3rd position is " + names[3]);

		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("john");
		list1.add("aneesh");
		list1.add("smith");
		list1.add("suchi");
		// list1.add("suchi");// list will allow mutiple values.
		//list1.add("");// list wont allow null value.

		System.out.println("the list is" + list1);
		System.out.println("the size of the list is" + list1.size());
		System.out.println("first name in list is" + list1.get(0));
		System.out.println("last name in list is" + list1.get(list1.size() - 1));

		list1.add(1, "paul"); // insertion of data is taking place.
		System.out.println("the list after updating paul is " + list1);

		list1.set(2, "mike");// this will remove an elemnt and update another elemnt in it's index.
		System.out.println("the list after adding mike is " + list1);

		list1.remove(3);// for removing element from your current updated list.
		System.out.println("the list after removing smith" + list1);

		// iterating through the list.

		for (int i = 0; i < list1.size(); i++) {
			System.out.println("elemnent name is " + list1.get(i));
		}

		for (String value : list1) {// using for each loop

			System.out.println("element value is " + value);
		}
		Iterator<String> itr = list1.iterator(); // iterator is a inbuilt class.first we r creating obj of iterator
													// class
													// and assigning it to the method"list.iterator()
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		Collections.sort(list1); // collection is a class. sort is used to make your elements in alphabetical
									// order.
		System.out.println("after sorting list is " + list1);

		Collections.sort(list1, Collections.reverseOrder());// reverse order is used to reverse the sorted elemnts
															// ie,ascending order elements.
		System.out.println("after reversing list is " + list1);
	}

}
