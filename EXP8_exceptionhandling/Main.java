class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
}
class TooLongAddition extends Exception {
    public TooLongAddition(String s) {
        super(s);
    }
}
class NegativeAnswer extends Exception{
    public NegativeAnswer(String s) {
        super(s);
    }

}
class TooLongMultiplication extends Exception{
	public TooLongMultiplication(String s){
		super(s);
	}
}
class Operation {
    public int addition(int a,int b) throws TooLongAddition{
        int add = a + b;
        if(add > 1000) {
            throw new TooLongAddition("Long addition");
        }
        return add;
    }
    public int subtraction(int a, int b) throws NegativeAnswer {
        int sub = a-b;
        if(sub < 0) {
            throw new NegativeAnswer("Negative Answer");
        }
        return sub;
    }
    public int Multiplication(int a,int b) throws TooLongMultiplication{
	int mul = a*b;
	if(mul >5000){
		throw new TooLongMultiplication("Long Multiplication");
	}
	return mul;
   }
}
class Main {
    public static void main(String[] args) {
        Operation o = new Operation();
        try {
	        System.out.println(o.addition(500,600));
        }
        catch(TooLongAddition t) {
            System.out.println(t);
        }
        try{
            System.out.println(o. Multiplication(2000,5));
        }
	catch(TooLongMultiplication t){
		System.out.println(t);
    	}
   }
}