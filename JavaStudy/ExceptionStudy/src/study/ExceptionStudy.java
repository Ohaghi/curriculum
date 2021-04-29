package study;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionStudy {
	private static String message;

	public static void main(String[] args) {
			try {
			FileWriter fw = new FileWriter("data.txt");
			fw.write(message);
			}

			catch(IOException e){
				System.out.println("");
			}




}
}
