package codingggg;

import java.util.Scanner;

public class PrimeNumber {
	 public static void main(String[] args) {  
	       Scanner s = new Scanner(System.in);  
	       System.out.print("Enter a number : ");  
	       int n = s.nextInt();  
	       if (isPrime(n)) {  
	           System.out.println(n + " is a prime number");  
	       } else {  
	           System.out.println(n + " is not a prime number");  
	       }  
	   }  
	  
	   public static boolean isPrime(int n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i < n; i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   }  

	 /*public static void main(String[] args) {

		int num =17;
		for (int i = 2; i < num/2; i++) {
			if (num%i!=0) {
				System.out.println(num+" is odd number");
			}else {
				System.out.println(num+" is even number");
			}
		}
	}
	static boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	static boolean isPrime(int n) {
	    for(int i=2;2*i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	public static void main(String[] args) {
		boolean prime = isPrime(18);
		System.out.println(prime);
		 int num = 20, count;

		  for (int i = 1; i <= num; i++) {
		   count = 0;
		   for (int j = 2; j <= i / 2; j++) {
		    if (i % j == 0) {
		     count++;
		     break;
		    }
		   }

		   if (count == 0) {
		    System.out.println(i);
		   }

		  }
	}*/
}