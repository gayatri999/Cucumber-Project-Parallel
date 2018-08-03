package coding;

public class FindingSpecalChars {

	public static void main(String[] args) {
	
		String test = "Test @ 123";
		char[] ch = test.toCharArray();
		int letter = 0, space = 0, num = 0, specialChar = 0;
		for(int i = 0; i < test.length(); i++){
			if(Character.isLetter(ch[i])){
				letter ++ ;
			}
			else if(Character.isDigit(ch[i])){
				num ++ ;
			}
			else if(Character.isSpaceChar(ch[i])){
				space ++ ;
			}
			else{
				specialChar ++;
			}
		}
		System.out.println("Test @ 123");
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
			}


}
