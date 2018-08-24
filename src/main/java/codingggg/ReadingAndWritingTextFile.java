package codingggg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadingAndWritingTextFile {

	public static void main(String[] args) throws FileNotFoundException {
		 try {
	            FileWriter writer = new FileWriter("MyFile.txt", true);
	            writer.write("Hello World");
	            writer.write("\r\n");   // write new line
	            writer.write("Good Bye!");
	            writer.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	 
		/*File file =  new File("MyFile.txt");
		Scanner sc = new Scanner(file);

		while (sc.hasNextLine())
			System.out.println(sc.nextLine());
         sc.close();*/

	/*	//Read file
		String fileName = "MyFile.txt";
		String line =null;
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			try {
				while((line = br.readLine())!= null) {
					System.out.println(line);
				}
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//Write file
		String str = "MyFile.txt";
		FileWriter fw;
		try {
			fw = new FileWriter(str);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Amazon Indis Private Limited");
			bw.newLine();
			bw.write("TestLeaf Solutions Private Limited");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		
	}
}
