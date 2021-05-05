package Javapratice;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=4;
		
		int temp=0;
		
		for(int i=2;i<=number-1;i++)
		{
			if(number%2==0)
			{
				temp=temp+1;
			}
		}
		if(temp>0)
		{
			System.out.println("Number is not prime");
		}
		
		else
		{
			System.out.println("Number is  prime");
		}

		//End of the program ..
		
		
	}

}
