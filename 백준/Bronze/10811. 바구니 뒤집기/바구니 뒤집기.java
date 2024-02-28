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
            int sf_1 = s_1 -1;
            int sf_2 = s_2 -1;
            
            for(int ss=0;ss<(s_2-s_1+1)/2;ss++)
            {
            
            	if((sf_1+ss)<(sf_2-ss))
            	{
            		charge = Arraing[sf_1+ss];
            		Arraing[sf_1+ss] = Arraing[sf_2-ss];       
            		Arraing[sf_2-ss] = charge;
            		
            	}
            
            }
        }
  
        for( int c = 0 ; c < first ; c ++ )
        {
            System.out.printf("%d ",Arraing[c]);
        }
		
		
	}


}