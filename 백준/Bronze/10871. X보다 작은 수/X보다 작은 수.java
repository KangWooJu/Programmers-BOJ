import java.util.*;

public class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        
        int[] Arraing = new int[a];
        for( int i = 0 ; i < a ; i++ )
        {
            Arraing[i] = in.nextInt();
        }
        
        for ( int k = 0 ; k < a ; k++ )
        {
            if(Arraing[k] < b )
            System.out.printf("%d ",Arraing[k]);
        }
    }
}