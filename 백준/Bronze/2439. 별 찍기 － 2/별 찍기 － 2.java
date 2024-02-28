import java.util.*;

public class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        
        for(int i=1;i<=a;i++)
        {
            for(int k=1;k<=a;k++)
            {
                if(k<=(a-i))
                {
                    System.out.printf(" ");
                }
                else if ((k>=(a-i))&&(k<a))
                {
                    System.out.printf("*");
                }
                
                else if(k==a)
                {
                	System.out.printf("*\n");
                }
            }
        }
    }
}