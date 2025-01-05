import MyMath.Arithmatic;
import MyMath.Stat;
import MyMath.Trig;
class Test{
	public static void main(String args[]){
		Arithmatic a = new Arithmatic();
		System.out.println(a.add(5,10));
		Trig t = new Trig();
		System.out.println(t.sin(30));
		Stat s = new Stat();
		System.out.println(s.getMax(5,9));
	}
}