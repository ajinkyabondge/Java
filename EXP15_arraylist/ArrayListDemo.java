import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String args[]) {	
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("BookID");
		arr.add("BookName");
		arr.add("Author");
		arr.add("Publisher");
		arr.add("Quantity");
		System.out.println("ArrayList Size:");
		System.out.println(arr.size());
		System.out.println("Displaying ArrayList:");
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i)+" ");
		}
		arr.remove(0);
		System.out.println("Displaying ArrayList After removing:");
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i)+" ");
		}
		
	}
}
