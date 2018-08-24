package codingggg;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DuplicateArray {

	/*public static void main(String[] args) {
		Integer[] intArray = { 1, 1, 1, 2, 4, 2, 3, 5, 3, 6, 7, 3, 4, 5 };
		Integer[] finalArray = removeDuplicates(intArray);
		System.out.println(Arrays.asList(finalArray));
	}

	public  static Integer[] removeDuplicates(Integer[] intArray) {
		int count = 0;
		Integer[] interimArray = new Integer[intArray.length];
		for (int i = 0; i < intArray.length; i++) {
			boolean exists = false;
			for (int j = 0; j < interimArray.length; j++) {
				if (interimArray[j]!=null && interimArray[j] == intArray[i]) {
					exists = true;
				}
			}
			if (!exists) {
				interimArray[count] = intArray[i];
				count++;
			}
		}
		final Integer[] finalArray = new Integer[count];
		System.arraycopy(interimArray, 0, finalArray, 0, count);
		return finalArray;
	}*/
	public static void main(String[] args) {
		Integer[] intArray = { 1, 1, 1, 2, 4, 2, 3, 5, 3, 6, 7, 3, 4, 5 };
		
		int length = intArray.length;
		Set<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < intArray.length; i++) {
			set.add(intArray[i]);
		}
		System.out.println(set);
		/*Iterator it = set.iterator();
		while(it.hasNext()) {
		  System.out.println(it.next());
		}*/
	}
	
}









