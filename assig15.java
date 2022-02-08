import java.io.*;
import java.util.Scanner;
class CharAddInc_Decryption {
    public static void main(String args[]) throws Exception {
        File f1 = new File("C://Users/Skumar Birla/Desktop/test1.txt");
        if (f1.exists()) {
            char temp;
            Scanner sc = new Scanner(new FileReader(f1));
            String data = "", str = sc.nextLine();
            sc.close();// scanner close
            FileWriter w1 = new FileWriter("C://Users/Skumar Birla/Desktop/test1.txt");
            for (int i = 0; i < str.length(); i=i+2) {
                temp=str.charAt(i);
                data=data+temp;
            }
            w1.write(data);
            w1.close();
        }else {
            System.out.println("please check file Directory, file not Exist");
            System.out.println(f1.getAbsolutePath());
        }
    } 
}