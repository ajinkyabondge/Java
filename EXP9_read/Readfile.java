import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;
public class Readfile {
	public static void main(String args[]) throws IOException {
		String text;
		boolean b;
		String in1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Text file name in .txt format:");
		text = sc.next();
		File obj = new File("C:\\Users\\varad\\OneDrive\\Desktop\\"+text);
		b=obj.createNewFile();
		System.out.println("File Created");
		while(true) { 
			System.out.println("\nEnter choice\n1.Read File\n2.Add data to file\n3.Exit");
			int cho = sc.nextInt();
			if(cho>3) {
				break;
			}
			switch(cho) {
			case 1:
				System.out.println("Enter Text file name in .txt format:");
				text = sc.next();
				if(obj.exists())
					{Display(text);
					break;}
				else {System.out.println("File does not exists");
				break;}
				
			case 2:
				System.out.println("Enter .txt name to add in file");
				in1 = sc.next();
				if(obj.exists()) {
					String w;
					System.out.println("Write:");
					w = sc.next();
					try(FileOutputStream outputStream 
							  = new FileOutputStream("C:\\Users\\varad\\OneDrive\\Desktop\\"+in1, true)) {
							  
							  byte[] strToBytes = w.getBytes();
							  outputStream.write(strToBytes);
					}
				}
				else {
					System.out.println("Enter Text file name in .txt format:");
					text = sc.next();
					File obj1 = new File("C:\\Users\\varad\\OneDrive\\Desktop\\"+in1);
					//b=obj1.createNewFile();
					String w;
					System.out.println("file is not present creating file.....");
					System.out.println("Write:");
					w = sc.next();
					try(FileOutputStream outputStream 
							  = new FileOutputStream("C:\\Users\\varad\\OneDrive\\Desktop\\"+in1, true)) {
							  
							  byte[] strToBytes = w.getBytes();
							  outputStream.write(strToBytes);
					}
				}
			case 3:
				break;
			}
		}
		 
	}
	static void Display(String text) {
		 try{    
	            FileInputStream in=new FileInputStream("C:\\\\Users\\\\varad\\\\OneDrive\\\\Desktop\\"+text);    
	            int i=0;  
	            while((i=in.read())!=-1){    
	                System.out.print((char)i);    
	               }        
	  
	            in.close();    
	          }
		 catch(Exception e){
			 System.out.println(e);
		 } 
	}
}

