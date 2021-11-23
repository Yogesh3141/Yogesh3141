import java.io.*;
import java.util.*;
class WriteFile{
    public static void main(String agrs[])throws Exception
    {
      File file1 = new File("C://Users/Skumar Birla/Desktop/test1.txt");
      if(file1.exists())
      {
          FileWriter w1 = new FileWriter("C://Users/Skumar Birla/Desktop/test1.txt");
          Scanner sc = new Scanner(System.in);
          System.out.println("enter:");
          String str=sc.nextLine();
          sc.close();
          w1.write(str);
          w1.close();
          System.out.println("Accomplished");
      }else{
          System.out.println("File Not exist In system Please Check The Directory");
          System.out.println(file1.getAbsolutePath());
      } 

    }
}
