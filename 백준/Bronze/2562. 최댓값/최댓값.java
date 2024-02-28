import java.util.*;

public class Main
{
	public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int[] Arraing = new int[9];
        
        
        for( int i = 0 ; i < 9 ; i ++ )
        {
            Arraing[i] = in.nextInt();
        }
        
        int max = Arraing[0];
        int count = 0;
        
        for (int s = 0; s < 9;s++)
        {
            if( max < Arraing[s])
            {
                max = Arraing[s];
                count = s;
            }
        }
        
        
        System.out.print(max);
        System.out.printf("\n");
        System.out.printf("%d",count+1);
	}
}

