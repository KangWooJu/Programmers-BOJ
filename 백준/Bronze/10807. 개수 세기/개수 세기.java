import java.util.*;

public class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int stack = 0;
        int a = in.nextInt();
        int[] Arraing = new int[a];
        
        for( int i = 0 ; i < a ; i ++ )
        {
            Arraing[i] = in.nextInt();
        }
        
        int index = in.nextInt();
        for( int k = 0 ; k < a ; k++ )
        {
            if(index==Arraing[k])
            {
                stack++;
            }
        }       
        System.out.print(stack);
    }
}