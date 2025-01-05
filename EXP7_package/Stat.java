package MyMath;
public class Stat{
	public int getCount(int arr[]){
		int cnt=0;
		for(int i=0;i<arr.length;i++){
			cnt++;
		}
		return cnt;
	}
	public int getSum(int arr[]){
		int Sum=0;
		for(int i=0;i<arr.length;i++){
			Sum = Sum+arr[i];
		}
		return Sum;
	}
	public int getMax(int a,int b){
		if(a>b){
			return a;
		}
		else if(b>a){
			return b;
		}
		return 0;
	}
	public int getMin(int a,int b){
		if(a>b){
			return b;
		}
		else if(b>a){
			return a;
		}
		return 0;
	}
	public int avg(int arr[]){
		int Sum=0;
		int len = arr.length;
		for(int i=0;i<arr.length;i++){
			Sum = Sum+arr[i];
		}
		return (Sum/len);
	}
}