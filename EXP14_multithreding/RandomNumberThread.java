import java.util.*;

public class RandomNumberThread extends Thread {
	private int ranInt;
	public void run() {
			Random r = new Random();
			ranInt = r.nextInt(1000);
		}
	int getNo() {
		return ranInt;
	}
	public static void main(String args[]) {
		RandomNumberThread r=new RandomNumberThread();
		r.start();
		SquareThread s = new SquareThread(r);
		s.start();
		CubeThread c = new CubeThread(r);
		c.start();
		System.out.println("Numbers Are:");
		System.out.println(r.ranInt);
		System.out.println(s.Squ);
		System.out.println(c.cube);
	}
}
class SquareThread extends Thread{
	RandomNumberThread a = new RandomNumberThread();
	SquareThread(RandomNumberThread r){
		a = r;
	}
	int Squ;
	public void run() {
		int temp = a.getNo();
		Squ = (temp * temp);
	}
}
class CubeThread extends Thread{
	RandomNumberThread a = new RandomNumberThread();
	CubeThread(RandomNumberThread r){
		a = r;
	}
	int cube;
	public void run() {
		 cube = (a.getNo() * a.getNo() * a.getNo());
	}
}
