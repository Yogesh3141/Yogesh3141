import java.io.*;
class Simple_Decryption {
    public static void main(String args[]) throws Exception {
        char[] alphabet = " ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        File f1 = new File("C://Users/Skumar Birla/Desktop/test1.txt");
        if (f1.exists()) {
            BufferedReader br = new BufferedReader(new FileReader(f1));
            String str, data = "",ddata="";
            while ((str=br.readLine()) != null) {
                data += str;
            }
            br.close();
            for(int i=1;i<data.length();i=i+2){
                int ind=Integer.valueOf(data.substring(i-1, i+1));
                ddata+=alphabet[ind];           
            }
            FileWriter w1 = new FileWriter("C://Users/Skumar Birla/Desktop/test1.txt");
            System.out.println(ddata);
            w1.write(ddata);
            w1.close();
        }
        else {
            System.out.println("please check file Directory, file not Exist");
			System.out.println(f1.getAbsolutePath());
        } 
    }
}
