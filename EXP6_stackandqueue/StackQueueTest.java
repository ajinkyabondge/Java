 import java.util.Scanner;
  interface Stack{
	 public int arr[] = new int[10];
	 public int top = -1;
	 int d = 0;
	 abstract void push(int d);
	 int pop();
	 boolean isFull();
	 boolean isEmpty();
	 void StackDisplay();
}
 interface Queue{
	void Enqueue(int a);
	boolean isFull();
	boolean isEmpty();
	int dequeue();
	void StackDisplay();
}
 class StackQueue implements Stack, Queue{
	int sarr[] = new int[10];
	int fr;
	int rr;
	public int qarr[] = new int[10];
	public int top;
	int d;
	StackQueue(){
		fr = -1;
		rr = 0;
		top = -1;
	}
	public void push(int a) {
		 if(!isFull()) {
			top++;
			sarr[top] = a;
			System.out.println("Data Enter Successfully!");
		 }
		 else {
			 System.out.println("Stack is Full");
		 }
	 }
	 public int pop() {
		 if(!StackisEmpty()) { 
			 d = sarr[top];
			 top--;
			 return d;
		 }
		 else {
			 return -1;
		 }
	 }
	 boolean StackisFull() {
		 if(top > 9) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
	 boolean StackisEmpty() {
		 if(top == -1) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
	 public void StackDisplay() {
		 if(!StackisEmpty()) {
			 for(int i=0;i<=top;i++) {
				 System.out.println(sarr[i]);
		 	}
		 }
		 else {
			 System.out.println("Stack is Empty");
		 }
	 }
	public void Enqueue(int a) {
			if(fr == -1) {
				fr++;
				qarr[fr] = a;
				System.out.println("Data Entered Susccesfully!");
			}
			else {
				if(!isFull()) {
					qarr[rr] = a;
					rr++;
					System.out.println("Data Entered Susccesfully!");
				}
				else {
					System.out.println("Queue is Full!");
				}
			}
		}
		public boolean isFull() {
			if(rr == 9) {
				return true;
			}
			else {
				return false;
			}
		}
		public boolean isEmpty() {
			if(fr == -1) {
				return true;
			}
			else {
				return false;
			}
		}
		public int dequeue() {
			if(isEmpty()) {
				return -1;
			}
			else {
				if(fr == rr) {
					d = qarr[fr];
					fr = -1;
					rr = 0;
					return d;
				}
				else {
					d=qarr[rr];
					rr--;
					return d;
				}
			}
		}
		public void Display() {
			if(!isEmpty()) {
				for(int i=fr;i<rr;i++) {
					System.out.println(qarr[i]);
				}
			}
			else {
				System.out.println("Queue is Empty");
			}

		}
 }

public class StackQueueTest {
		public static void main(String args[]) {
			StackQueue a = new StackQueue();
			int d;
			int cho,ch;
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.println("1.Stack\n2.Queue\n3.Exit\nEnter Choice:");
				cho = sc.nextInt();
				if(cho == 3){
					break;
				}
				while(true) {
				if(cho == 1) {
					System.out.println("Stack:\n1.Push\n2.Pop\n3.Display Stack Data\n4.Exit\nEnter Choice:");
					ch = sc.nextInt();
					if(ch == 4){
						break;
					}
					switch(ch) {
						case 1:
							System.out.println("Enter Data to Push:");
							d = sc.nextInt();
							a.push(d);
							break;
						case 2:
							d = a.pop();
							if(d != -1) {
								System.out.println("Data Poped:"+d);
								break;
							}
							else {
								System.out.println("Stack is Empty");
								break;
							}
						case 3:
							a.StackDisplay();
							break;
					}
				}
				else if(cho == 2){
					System.out.println("Queue:\n1.Enqueue\n2.Dequeue\n3.Display Queue Data\n4.Exit\nEnter Choice:");
					ch = sc.nextInt();
					if(ch == 4){
						break;
					}
					switch(ch) {
						case 1:
							System.out.println("Enter Data to Enqueue:");
							d = sc.nextInt();
							a.Enqueue(d);
							break;
						case 2:
							d = a.dequeue();
							if(d == -1) {
								System.out.println("Queue is Empty");
								break;
							}
							else {
								System.out.println("Dequeued Data:"+d);
								break;
							}
						case 3:
							a.Display();
							break;
					}
				}
			}
		}
		}
}
