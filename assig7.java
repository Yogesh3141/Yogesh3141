import java.io.*;
import java.util.Scanner;

class Integer_decryption {

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
            kdata = key.charAt(i);
            temp = Integer.parseInt(String.valueOf(str.charAt(i)));
            if (kdata == '1') {     // if key is 1 then decrease data value 1
                temp = temp - 1;
                data = data + temp;
            }
            else if(kdata=='0'){    // if key is 0 then not change data value
                data=data+temp;
            }
        }
        System.out.println(data);
        FileWriter w1 = new FileWriter("C://Users/Skumar Birla/Desktop/test1.txt");
        w1.write(data);
        w1.close();
    }
}