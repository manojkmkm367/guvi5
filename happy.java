import java.util.*;
public class happy{


	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to check");
		int a=sc.nextInt();
		int b=0,e=0,i,dd=0;  
		int c=0,d = a;
	for(i=0;d!=1 && i<20;i++)
		{
			if(d>99){ dd=d;b=dd%10; dd=dd/10; c=dd%10; dd=dd/10; e=dd%10;}
			else{b=d%10;c=d/10;}	
		d=(int) (Math.pow(b,2)+Math.pow(c,2)+Math.pow(e, 2));
		}
		
		if(d==1)
		{
			System.out.println("THE NUMBER IS A HAPPY NUMBER");				
		}
		else
		{
		System.out.println("THE NUMBER IS NOT A HAPPY NUMBER");
		}
	}
	}
