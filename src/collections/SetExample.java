package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set1 = new HashSet<String>();// set never maintains tthe order of the elements we given.
		set1.add("jake");
		set1.add("lilly");
		set1.add("naina");
		// set1.add("naina");// hashset never allows duplicating of element.
		// set1.add(null); // hashset allows to use null values

		System.out.println("the set is " + set1); // you cant do sorting of set using collections.

		TreeSet<String> set2 = new TreeSet<String>();// for a sorted set,use treeset.
		set2.add("zen");
		set2.add("jullie");
		set2.add("kate");
		// System.out.println("The sorted list is " + set2);
		System.out.println(set2);

		// coverting set in to a list
		ArrayList<String> list1 = new ArrayList<String>(set1); // here your set elements are convertd in to a list.
		System.out.println(list1);

	}

}
