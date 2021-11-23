import java.io.*;
import java.util.*;

class simple_encryption {
	public static void main(String args[]) throws Exception {
		char[] alphabet = " ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		File f1 = new File("C://Users/Skumar Birla/Desktop/test1.txt");
		if (f1.exists()) {
			FileWriter w1 = new FileWriter("C://Users/Skumar Birla/Desktop/test1.txt");
			Scanner sc = new Scanner(System.in);
			System.out.println("ENTER:");
			String str = sc.nextLine();
			str = str.toUpperCase();
			System.out.print("//............Converting for Encryption..........//");
			for (int i = 0; i < str.length(); i++) {
				for (int j = 0; j <= 26; j++)
					if (str.charAt(i) == alphabet[j]) {
						String st = String.format("%02d", j); // converting into 0"s padding
						w1.write(st);
					}
			}
			System.out.println();
			sc.close();// scanner close
			w1.close(); // closing Writer
			System.out.println("Encryption Successful");
		} else {
			System.out.println("please check file Directory, file not Exist");
			System.out.println(f1.getAbsolutePath());
		}
	}
}
