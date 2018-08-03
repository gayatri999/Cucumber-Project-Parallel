package coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {

	/*public static void main(String[] args)
    {
        String input = "My name is gayatri";
 
        StringBuilder input1 = new StringBuilder();
 
        // append a string into StringBuilder input1
        input1.append(input);
 
        // reverse StringBuilder input1
        input1 = input1.reverse();
 
        // print reversed String
        System.out.println(input1);
    }*/
	 public static void main(String[] args)
	    {
	        String input = "My name is gayatri";
	        char[] c = input.toCharArray();
	 
	        for (int i = c.length-1; i>=0; i--)
	            System.out.print(c[i]);
	    }
	 /*public static void main(String[] args)
	    {
	        String input = "My name is gayatri";
	        char[] temparray = input.toCharArray();
	        int left, right=0;
	        right = temparray.length-1;
	 
	        for (left=0; left < right ; left++ ,right--)
	        {
	            // Swap values of left and right
	            char temp = temparray[left];
	            temparray[left] = temparray[right];
	            temparray[right]=temp;
	        }
	 
	        for (char c : temparray)
	            System.out.print(c);
	        System.out.println();
	    }*/
	
	/* public static void main(String[] args)
	    {
	        String input = "I am in TestLeaf";
	        char[] ch = input.toCharArray();
	        List<Character> list = new ArrayList<>();
	       for (char c: ch) { 
	            list.add(c);
	           }
	        for (int i = 0; i < ch.length; i++) {
				int num = (int) input.charAt(i);
				char var = (char) (num);
				System.out.println(var);
			}
	        Collections.reverse(list);
	        System.out.println(list);
	        ListIterator li = list.listIterator();
	        while (li.hasNext())
	            System.out.print(li.next());
	    }*/
	/*public static void main(String[] args) {
		char var;
		int num;
		 String txt = "a1b2c3";
		  char[] x = txt.toCharArray();
		for (int i = 0; i < x.length; i++) {
			num = (int)txt.charAt(i);
			var = (char)(num+1);
			System.out.print(var);
		}
		
	}*/
	
}










