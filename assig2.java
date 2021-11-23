import java.io.*;
class readfile{

public static void main(String[] args)throws Exception
	{
	File f1 = new File("/home/admin1/readsk.txt");
	BufferedReader br = new BufferedReader(new FileReader(f1));
	String str;
	while ((str=br.readLine()) != null) 	
		{
			System.out.print(str);
		}
	br.close();			
	}
}

