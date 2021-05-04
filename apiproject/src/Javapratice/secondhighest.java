package Javapratice;

public class secondhighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= 	{10,34,78,89,56,99,345,67};
		int largest = 0;
		int second = 0;
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				second=largest;
				largest=arr[i];
				
			}
			else if(arr[i]>second)
			{
				second=arr[i];
			}
		}
		
		System.out.println("Secondlargest is "+second);
		System.out.println("Largest is "+largest);
		
	}

}
