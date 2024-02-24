import java.util.*;

public class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        
        b += c;
        if(b>59)
        {
            a += (b/60);
            b = b%60;
            if(a>23)
            {
                a -=24;
            }
        }
        System.out.printf("%d %d",a,b);
    }
}