import java.util.*;

public class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        
        b -= 45;
        if (b<0)
        {
            b += 60;
            a -=1;
            if (a < 0)
            {
                a = 23;
            }
        }
        System.out.printf("%d %d",a,b);
    }
}