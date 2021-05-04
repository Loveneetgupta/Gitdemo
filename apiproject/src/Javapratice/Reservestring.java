package Javapratice;

public class Reservestring {
	
	public static void main(String[] args) {
		String str = "Automation";
        StringBuilder str2 = new StringBuilder();
        str2.append(str);
        str2 = str2.reverse();     // used string builder to reverse
       System.out.println(str2);
       
       Reservestring obj=new Reservestring();
       obj.reverse();
       
        }
	
public void reverse() {
	
	String s1="mom";
	int len=s1.length();
    String reverse="";
    for(int i=len-1;i>=0;i--)
    {
    	reverse=reverse + s1.charAt(i);
    	}
	

if(reverse.equals(s1))
{
	System.out.println("Panaldrom");
	}


else {

	System.out.println("Not Panaldrom");
}
}

}

	
	

