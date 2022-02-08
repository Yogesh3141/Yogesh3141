import java.io.*;
import java.util.Scanner;
class CharAddInc_Encryption {
    public static void main(String args[]) throws Exception {
        File f1 = new File("C://Users/Skumar Birla/Desktop/test1.txt");
        if (f1.exists()) {
            int flag;
            char temp;
            Scanner sc = new Scanner(new FileReader(f1));
            String data="",str = sc.nextLine();
            sc.close();// scanner close
            System.out.println("//............Converting for Encryption..........//");
          FileWriter w1 = new FileWriter("C://Users/Skumar Birla/Desktop/test1.txt");
            for (int i = 0; i < str.length(); i++) {
                temp=str.charAt(i);
                flag=temp;
                if(flag==122){                         // z  interchange with a
                    flag=97;
                    data=data+temp;
                    temp=(char)flag;
                    data=data+temp;
                }
                else if (flag==90){                        // Z interchange with Z                 
                    data=data+temp;
                    flag=65;
                    temp=(char)flag;
                    data=data+temp;
                }
                else if (( flag>=65 && flag <90) || (flag>=97 && flag <122)){
                    data=data+temp;
                    flag=flag+1;
                    temp=(char)flag;
                    data=data+temp;
                }
                else{
                    data=data+temp;
                    data=data+temp;
                }

                }
            w1.write(data);
            w1.close(); // closing Writer
            System.out.println("Encryption Successful");
        } else {
            System.out.println("please check file Directory, file not Exist");
            System.out.println(f1.getAbsolutePath());
        }
    }
}