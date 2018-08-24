package codingggg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LowerCase {

	/*public static void main(String[] args) {

		String a="BaNaNa";

		printLowerCase(a);
	}

	public static void printLowerCase(String a){
		for(char ch: a.toCharArray()) {
			if(ch >= 'A' && ch <= 'Z')
				ch += 'a' - 'A';
			System.out.print(ch);
		}*/
	/*}

	public static void toLowerCase1(String a){

		for (int i = 0; i< a.length(); i++){

			char aChar = a.charAt(i);
			if (65 <= aChar && aChar<=90){
				aChar = (char)( (aChar + 32) ); 
			}

			System.out.print(a);
		}
	}   */

	/*public static void main(String[] args) {

        char ch;
           int temp;
           Scanner scan = new Scanner(System.in);

           System.out.print("Enter a Character in Lowercase : ");
           ch = scan.next().charAt(5);

           temp = (int) ch;
           temp = temp - 32;
           ch = (char) temp;

           System.out.print("Equivalent Character in Uppercase = " +ch);
}*/
	/*public static void main(String args[]) throws IOException
	{

		System.out.println("Enter any line ");

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String inputLine=br.readLine();
		 System.out.println("Lower Case using method  toLowerCase()  : " + inputLine.toLowerCase());
		String lcase=lCase(inputLine);  // userdefined function lCase() is called
		System.out.println("Lower Case  without using toLowerCase() :  " + lcase);

	}

	public static  String lCase(String inputLine)
	{
		StringBuilder inputLineL = new StringBuilder(inputLine);

		for(int i = 0 ; i < inputLineL.length() ; i++)
		{
			if(inputLineL.charAt(i) >= 65 && inputLineL.charAt(i) <=91)    // check for Capital  letter ...   ascii code of "A" is 65 ... "Z" is 91.
			{
				inputLineL.setCharAt(i, (char)(inputLineL.charAt(i)+32));     //   The character at the specified index is set to  to uppercase
			}
		}
		return inputLineL.toString();
	}
*/
}


