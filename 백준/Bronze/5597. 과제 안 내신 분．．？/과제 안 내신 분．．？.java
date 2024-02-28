import java.util.*;

public class Main 
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        
        
        int[] Arraing = new int[30];
        int[] Wrong = new int[2];
        int index = 0;
        
        for(int a = 0 ; a < 30 ; a ++)
        {
            Arraing[a] = 0;
        }
        
        for(int b = 0 ; b < 28 ; b ++)
        {
            int input = in.nextInt();
            Arraing[input-1] = 1;
        }
        
        for( int c = 0 ; c < 30; c++ )
        {
            if( Arraing[c] == 0 )
            {
                Wrong[index] = c;
                index++;
            }
        }
        
        for(int d = 0 ; d < 2; d++)
        {
            System.out.printf("%d\n",Wrong[d]+1);
        }    
	}
}