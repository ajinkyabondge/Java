import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class StudentInfo {
	void getDetails() throws IOException {
		FileInputStream in = new FileInputStream("C:\\Users\\varad\\OneDrive\\Desktop\\Student.txt");
		DataInputStream dis = new DataInputStream(in);
		int cnt = in.available();
		byte arr[] = new byte[cnt];
		dis.read(arr);
		for(byte bt:arr) {
			char c = (char)bt;
			System.out.print(c);
		}
		in.close();
	}
	void SetDetails() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write:");
		String s = sc.next();
		try(FileOutputStream out = new FileOutputStream("C:\\Users\\varad\\OneDrive\\Desktop\\Student.txt",true)){
			byte[] strToBytes = s.getBytes();
			out.write(strToBytes);
		}
	}
	public static void main(String args[]) throws IOException {
		boolean b;
		File f = new File("C:\\Users\\varad\\OneDrive\\Desktop\\Student.txt");
		b = f.createNewFile();
		StudentInfo s = new StudentInfo();
		s.SetDetails();
		System.out.println("File Containts");
		s.getDetails();
		
	}
}
