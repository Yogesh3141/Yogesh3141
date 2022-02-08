import java.io.*;
import java.util.Scanner;

class CharInc_Decryption {
    public static void main(String args[]) throws Exception {
        File f1 = new File("C://Users/Skumar Birla/Desktop/test1.txt");
        if (f1.exists()) {
            int flag;
            char temp;
            Scanner sc = new Scanner(new FileReader(f1));
            String data = "", str = sc.nextLine();
            sc.close();// scanner close
            FileWriter w1 = new FileWriter("C://Users/Skumar Birla/Desktop/test1.txt");
            for (int i = 0; i < str.length(); i++) {
                temp = str.charAt(i);
                flag = temp;
                if (flag == 97) { // a interchange with z
                    flag = 122;
                    temp = (char) flag;
                    data = data + temp;
                } else if (flag == 65) { // A interchange with Z
                    flag = 90;
                    temp = (char) flag;
                    data = data + temp;
                } else if ((flag >= 65 && flag < 90) || (flag >= 97 && flag < 122)) {
                    flag = flag - 1;
                    temp = (char) flag;
                    data = data + temp;
                } else {
                    data = data + temp;
                }
            }
            w1.write(data);
            w1.close(); // closing Writer
        } else {
            System.out.println("please check file Directory, file not Exist");
            System.out.println(f1.getAbsolutePath());
        }
    }
}