package codingggg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Occurance {

	public static void main(String[] args) {
		String str = "Amazon IndiA";
		char ch = str.charAt(0);
	    int count =1;
		List<Character>  list = new LinkedList<Character>();
		list.get(0);
		count++;
		System.out.println(list);
		
		
		
		
		
		
		/*char c = str.charAt(0);
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j < args.length; j++) {
				
			
			if (c == str.charAt(i)) {
					count++;
			}
		}}
		System.out.println(c + " occurs " + count + " times in " + str);*/

	}
	/*char[] char_array =str.toCharArray();

		Map<Character,Integer> charCounter=new HashMap<Character,Integer>();
		for (char ch : char_array) {

			if(charCounter.containsKey(ch))
			{
				charCounter.put(ch, charCounter.get(ch)+1);
			} 
			else
			{
				charCounter.put(ch, 1);
			}
		}
		System.out.println(charCounter);*/
	/* for(Character key:charCounter.keySet())
	       {
	           System.out.println(key+""+charCounter.get(key));
	       }*/
	/*String str=new String("aabbbcddddee");
	    char[] ch=str.toCharArray();
	    HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
	    for(char ch1:ch)
	    {

	        if(hm.containsKey(ch1))
	        {
	            hm.put(ch1,hm.get(ch1)+1);
	        }
	        else
	        {
	            hm.put(ch1,1);
	        }
	    }
	    System.out.println(hm);*/
} 



