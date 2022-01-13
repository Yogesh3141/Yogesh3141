import java.io.*;
import java.util.*;

class Random_encryption {
	public static void main(String args[]) throws Exception {
		char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        int[] keys = {61,23,38,22,13,92,14,83,12,17,26,66,73,77,41,90,62,89,71,81,29,96,99,55,19,33};
		File f1 = new File("C://Users/Skumar Birla/Desktop/test1.txt");
		if (f1.exists()) {
			
			Scanner sc = new Scanner(new FileReader(f1));
			String str = sc.nextLine();
			str = str.toUpperCase();
			sc.close();// scanner close
			System.out.print("//............Converting for Encryption..........//");
			FileWriter w1 = new FileWriter("C://Users/Skumar Birla/Desktop/test1.txt");
			for (int i = 0; i < str.length(); i++) {
				for (int j = 0; j < 26; j++)
					if (str.charAt(i) == alphabet[j]) {
						String key = Integer.toString(keys[j]); // converting into 0"s padding
						w1.write(key);
					}
			}
			System.out.println();
			
			w1.close(); // closing Writer
			System.out.println("Encryption Successful");
		} else {
			System.out.println("please check file Directory, file not Exist");
			System.out.println(f1.getAbsolutePath());
		}
	}
}
