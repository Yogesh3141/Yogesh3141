import java.io.*;
import java.util.Scanner;

class oddeven_encryption {

    public static void main(String[] args) throws Exception {
        File f1 = new File("C://Users/Skumar Birla/Desktop/test1.txt");
        Scanner sc = new Scanner(new FileReader(f1));
        String str, key = "", odd = "1", even = "0", etext = "";
        int temp;
        str = sc.nextLine();
        sc.close();
        for (int i = 0; i < str.length(); i++) {
            temp = Integer.parseInt(String.valueOf(str.charAt(i))); 
            if ((i+1)%2==0) {               // position is even decrease value by 2
                if(temp==0 || temp==1){     // value not change for 0 and 1
                    key=key+'2';
                    etext=etext+temp;
                }
                else{
                temp = temp - 2;
                key = key + even;
                etext = etext + temp;}
            }
            else if ((i+1)%2==1) {         // position is odd increase value by 1
                if(temp==9){               // value not change for 9
                    key=key+'2';
                    etext=etext+temp;
                }
                else{
                    temp=temp+1;
                    key=key+odd;
                    etext=etext+temp;
                }
            }
        }
        FileWriter w1 = new FileWriter("C://Users/Skumar Birla/Desktop/test1.txt", false);
        w1.write(etext + System.getProperty("line.separator"));
        w1.write(key);
        w1.close();
    }
}