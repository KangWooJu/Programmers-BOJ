import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		int first = 0;
		
		if(a>b)
		{
			if(a>c)
			{
				first = a;
			}
			else if(a<c)
			{
				first = c;
			}
		}
		else if (a<b)
		{
			if(b>c)
			{
				first = b;
			}
			else if(b<c)
			{
				first = c;
			}
		}
		
		if(a==b)
		{
			if(b==c) //a = b = c , 3
			{
				System.out.printf("%d",10000+a*1000);
			}
			else
			{
				System.out.printf("%d",1000+a*100);
			}
		}
		else
		{
			if(a==c) // a = c ! = b , 2
			{
				System.out.printf("%d",1000+a*100);
			}
			else
			{
				if(b==c)
				{
					System.out.printf("%d",1000+b*100);
				}
				else
				{
					System.out.printf("%d",first*100);
				}
			}
		}
	}
		
}