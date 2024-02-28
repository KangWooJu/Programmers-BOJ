import java.util.*;

public class Main
{
	public static void main(String[] args) {
        
		Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        int second = in.nextInt();
        int[] Arraing = new int[first];
        
        for(int a = 0 ; a < first ; a++)
        {
            Arraing[a] = a + 1;
        }
        
        for ( int b = 0 ; b < second ; b ++ )
        {
            int s_1 = in.nextInt();
            int s_2 = in.nextInt();
            
            int charge;
            charge = Arraing[s_1-1];
            Arraing[s_1-1] = Arraing[s_2-1];
            Arraing[s_2-1] = charge;
        }
        
        
        
        for( int c = 0 ; c < first ; c ++ )
        {
            System.out.printf("%d ",Arraing[c]);
        }
		
		
	}
}

