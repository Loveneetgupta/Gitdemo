package Javapratice;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		int c;
		
		
		c=a;
		a=b;
		b=c; 
		
		System.out.println("a:"+a +" b:"+b);
		  
		SwapNumbers obj=new SwapNumbers();
		obj.swapwithoutthird();
	
	}

	
	public void swapwithoutthird() {
		int a=10;
		int b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a:"+a +" b:"+b);
		
	}
}
