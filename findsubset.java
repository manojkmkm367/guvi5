import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class subset1 {

		public static void main(String argh[]) throws NumberFormatException, IOException
		{
			int i,j,count=0;
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int[] a=new int[100];
			int[] b=new int[100];
			int n1,n2;
		System.out.println("Enter the size of array 1");
			n1=Integer.parseInt(br.readLine());
			System.out.println("Enter 1st array");
			for(i = 0;i<n1;i++)
			{
				a[i]=Integer.parseInt(br.readLine());
			}
			System.out.println("Enter the size of array 2");
			n2=Integer.parseInt(br.readLine());
			System.out.println("Enter 2nd array");
			for(i = 0;i<n2;i++)
			{
				b[i]=Integer.parseInt(br.readLine());
			}
			
			
			for(i=0;i<n1;i++)
			{
				for(j=0;j<n2;j++)
				{
					
					if(a[i]==b[j])
					{
						count++;
						break;
					}
				}
			}
			
			if(count==n2)
			{
				System.out.println("a1 is subset of b1 ");
			}
			else
				System.out.println("a1 is not subset of b1 ");

}
}
