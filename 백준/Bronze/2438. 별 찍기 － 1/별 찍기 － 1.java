import java.util.*;

public class Main{
    public static void main(String args[])
{
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        
        for(int i=1;i<=a;i++)
        {
            for(int k=0;k<i;k++)
            {
                System.out.printf("*");
                if((k+1)==i)
                {
                    System.out.printf("\n");
                }
            }
        }
    }
}