import java.io.*;
import java.util.Scanner;
class Random_Decryption {
    public static void main(String args[]) throws Exception {
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        int[] keys = {61,23,38,22,13,92,14,83,12,17,26,66,73,77,41,90,62,89,71,81,29,96,99,55,19,33};
        File f1 = new File("C://Users/Skumar Birla/Desktop/test1.txt");
        if (f1.exists()) {
            Scanner sc = new Scanner(new FileReader(f1));
            String str = sc.nextLine();
            System.out.println(str);
            sc.close();
            FileWriter w1 = new FileWriter(f1);
            for(int i=1;i<str.length();i=i+2){
                int ind=Integer.valueOf(str.substring(i-1, i+1));
                for (int j=0;j<26;j++){
                    if (keys[j]== ind)
                    {
                        w1.write(alphabet[j]);
                    }
                }           
            }
            
            w1.close();
        }
        else {
            System.out.println("please check file Directory, file not Exist");
			System.out.println(f1.getAbsolutePath());
        } 
    }
}