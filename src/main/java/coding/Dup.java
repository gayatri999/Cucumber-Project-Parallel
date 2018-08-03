package coding;

import java.util.Arrays;

public class Dup {

	public static void main(String[] args) {
		int a[]= {1,3,3,3,3,5,6,6,7,7,7};
		Arrays.sort(a);
		String repeatedNum = "";
		for (int i = 0; i < a.length -1 ; i++) {
			if(a[i] == a[i+1]){
				if (!repeatedNum.equals(a[i]+" ")) {
					repeatedNum = a[i] +" ";
					System.out.print(repeatedNum);
				}
			}
		}
	}

}
