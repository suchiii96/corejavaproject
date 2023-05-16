package collections;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> basket = new HashMap<String, Integer>(); // here string is the key and integer is the
																			// value.

		basket.put("item1", 1); // (key,value)
		basket.put("item2", 5);
		basket.put("item3", 2);// value can be multiples one,but key should be unique
		basket.put("item4", 2);

		System.out.println("the map is " + basket);

		basket.put("item3", 4);
		System.out.println("the map after adding item3 is " + basket); // here it is not adding a new item, just
																		// updating the value.

		basket.remove("item2");// item 2 is deleted .
		System.out.println("the map after deleting is" + basket);

		basket.put("item5", null);// we can add "value" as null
		System.out.println("the map after adding null key is" + basket);

		basket.put(null, 7);// we can also add "key" as null
		System.out.println("the map after adding null value is" + basket);

		for (String item : basket.keySet()) { // For each loop //here basket.keyset()will return all the set of
												// items1,2,etc..ie,set of keys.
			System.out.println("item name is " + item);
			System.out.println("item quantity is " + basket.get(item));// here basket.get(object key), to get the values
																		// in the basket.
		}

		for (Integer val : basket.values()) { // you can also iterate through .values() function.//to iterate values of
												// the object.
			System.out.println("the value is" + val);

		}

		String str = "clean world green world happy world"; // to find occurence of each word in this string.
		String[] arr1 = str.split(" ");
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();

		for (String word : arr1) {// for each loop// ie, iterating through each word in arr1
			if (!map1.keySet().contains(word)) {// check whaether word is in the map or not,map1.keyset() gives all the
												// words in hashmap.and if the word is not there,we will add that word.
				map1.put(word, 1);

			} else {
				map1.put(word, map1.get(word) + 1);// if the word is alredy there it will never go to for loop and go to
													// else loop and getnthe previous value of the word and increment
													// it.
			}

		}

		System.out.println("the resulting of map is" + map1);

	}

}
