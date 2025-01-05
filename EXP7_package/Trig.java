package MyMath;
import java.util.*;
public class Trig{
	public double sin(double d){
		double radian = Math.toRadians(d);
		double sinValue = Math.sin(radian);
		return sinValue;
	}
	public double cos(double d){
		double radian = Math.toRadians(d);
		double cosValue = Math.cos(radian);
		return cosValue;
	}
	public double tan(double d){
		double radian = Math.toRadians(d);
		double tanValue = Math.tan(radian);
		return tanValue;
	}
	public double cot(double d){
		double radian = Math.toRadians(d);
		double tanValue = Math.tan(radian);
		return (1/tanValue);
	}
	public double sec(double d){
		double radian = Math.toRadians(d);
		double cosValue = Math.cos(radian);
		return (1/cosValue);
	}
	public double cosec(double d){
		double radian = Math.toRadians(d);
		double sinValue = Math.sin(radian);
		return (1/sinValue);
	}
}