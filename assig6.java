import java.io.*;
import java.util.Scanner;

class Integer_encryption {

    public static void main(String[] args) throws Exception {
        File f1 = new File("C://Users/Skumar Birla/Desktop/test1.txt");
        Scanner sc = new Scanner(new FileReader(f1));
        String str, key = "", t = "1", f = "0", etext = "";
        int temp;
        str = sc.nextLine();
        sc.close();
        for (int i = 0; i < str.length(); i++) {
            temp = Integer.parseInt(String.valueOf(str.charAt(i))); 
            if (temp >= 0 && temp <= 8) {
                temp = temp + 1;
                key = key + t;
                etext = etext + temp;
            }
            else if (temp == 9) {
                key = key + f;
                etext = etext + temp;
            }
        }
        FileWriter w1 = new FileWriter("C://Users/Skumar Birla/Desktop/test1.txt", false);
        w1.write(etext + System.getProperty("line.separator"));
        w1.write(key);
        w1.close();
    }
}