package base;

public class MyInteger {
	private int iValue;
	public int get (){
		return iValue;
	}
	public boolean isEven(){
		//divided by 2 to see is there any numbers left, if no, it is even
		if (iValue % 2 == 0)
			return true;
		else 
			return false;
	}
	public boolean isOdd(){
		//divided by 2 to see is there any number left, if yes, it is odd
		if(iValue % 2 == 1)
			return true;
		else 
			return false ;
	}
	public boolean isPrime(){
		//divided the value by 2, if it is neither even or odd, it is prime
		if(iValue % 2 == 0 || iValue % 2 == 1)
			return false;			
		else
			return true;
		
	}
	// Static 
	public static boolean isEven(int NewiValue){
		//divided by 2 to see is there any numbers left, if no, it is even
		if (NewiValue % 2 == 0)
			return true;
		else 
			return false;
	}
	public static boolean isOdd(int NewiValue){
		//divided by 2 to see is there any number left, if yes, it is odd
		if(NewiValue % 2 == 1)
			return true;
		else 
			return false ;
	}
	public static boolean isPrime(int NewiValue){
		//divided the value by 2, if it is neither even or odd, it is prime
		if(NewiValue % 2 == 0 || NewiValue % 2 == 1)
			return false;			
		else
			return true;
		
	}
	// static MyInteger
	public static boolean isEven(MyInteger NNewiValue){
		//divided by 2 to see is there any numbers left, if no, it is even
		if (NNewiValue % 2 == 0)
			return true;
		else 
			return false;
	}
	public static boolean isOdd(MyInteger NNewiValue){
		//divided by 2 to see is there any number left, if yes, it is odd
		if(NNewiValue % 2 == 1)
			return true;
		else 
			return false ;
	}
	public static boolean isPrime(MyInteger NNewiValue){
		//divided the value by 2, if it is neither even or odd, it is prime
		if(NNewiValue % 2 == 0 || NNewiValue % 2 == 1)
			return false;			
		else
			return true;	
	}
	public boolean equals(int NNNewiValue){
		if (NNNewiValue == iValue)
			return true;
		else
			return false;	
}
	public boolean equals(MyInteger NNNNewiValue){
		return NNNNewiValue.equals(iValue);
		
	}
}