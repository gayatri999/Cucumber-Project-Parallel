package codingggg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TotalChars {

	/*public static void main(String[] args) {
		
		String str1 ="Test @ 123";
		 char str[] = str1.toCharArray();
		
		    int alphabets, digits, others, i;

		    alphabets = digits = others = i = 0;

		    System.out.println(str);

		    
		     * Check each character of string for alphabet, digit or special character
		     
		    while(str[i]=='0')
		    {
		        if((str[i]>='a' && str[i]<='z') || (str[i]>='A' && str[i]<='Z'))
		        {
		            alphabets++;
		        }
		        else if(str[i]>='0' && str[i]<='9')
		        {
		            digits++;
		        }
		        else
		        {
		            others++;
		        }

		        i++;
		    }

		    System.out.println("Alphabets "+ alphabets);
		    System.out.println("Digits "+ digits);
		    System.out.println("Special characters "+ others);

	}*/
	public static void main(String[] args) throws IOException {
		
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	System.out.println("enter the String");
	String s=br.readLine();
	int i,l,c1=0,c2=0,c3=0,sp=0;
	char ch;
	l=s.length();
	for(i=0;i<l;i++)
	{
	ch=s.charAt(i);
	if(Character.isLetter(ch))
	++c1;
	else if(Character.isDigit(ch))
	++c2;
	else if(ch==' ')
	++sp;
	else
	++c3;
	}
	System.out.println("no of Letter="+c1);
	System.out.println("no of Digit="+c2);
	System.out.println("no of Spaces="+sp);
	System.out.println("no of Symbol="+c3);
	}
}
