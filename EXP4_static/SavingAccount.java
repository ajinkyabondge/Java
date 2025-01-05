
public class SavingAccount {
	double balance;
	SavingAccount(double b){
		balance = b;
	}
	void updateBalance(int p) {
		balance = ((balance *0.04)/12)+balance;
	}
	public static void main(String [] args) {
		SavingAccount sever1 = new SavingAccount(2000);
		SavingAccount sever2 = new SavingAccount(3000);
		
		sever1.updateBalance(4);
		sever2.updateBalance(4);
		System.out.println(sever1.balance);
		System.out.println(sever2.balance);
	}
}
