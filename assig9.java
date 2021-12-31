import java.io.*;
import java.util.Scanner;

class oddeven_decryption {

    public static void main(String[] args) throws Exception {
        File f1 = new File("C://Users/Skumar Birla/Desktop/test1.txt");
        Scanner sc = new Scanner(new FileReader(f1));
        String str, key, data = "";
        char kdata;
        int temp;
        str = sc.nextLine(); // read cypher text
        key = sc.nextLine(); // read key to decrypt
        sc.close();
        if (str.length() != key.length()) {
            System.out.println("encrypted key and data combination mismatch");
        }
        for (int i = 0; i < str.length(); i++) {
            kdata = key.charAt(i); // selected key char
            temp = Integer.parseInt(String.valueOf(str.charAt(i)));// data selected char
            if (kdata == '0') { // key char is == "0"
                temp = temp + 2; // position is even increase value by 2
                data = data + temp;
            } else if (kdata == '1') { // key char is == "1"
                temp = temp - 1; // position is odd decrease value by 1
                data = data + temp;
            } else if (kdata == '2') { // key char is == "2"
                data = data + temp; // not change value }
            }
            System.out.println(data);
            FileWriter w1 = new FileWriter("C://Users/Skumar Birla/Desktop/test1.txt");
            w1.write(data);
            w1.close();
        }
    }
}
