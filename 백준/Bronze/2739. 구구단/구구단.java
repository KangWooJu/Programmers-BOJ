import java.util.*;

public class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        
        for(int i=1;i<=9;i++)
        {
            int b = a * i;
            System.out.printf("%d * %d = %d\n",a,i,b);
        }
    }
}