import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] Arraing = new int[a];
        
        for(int s = 0 ; s < a ; s++)
        {
        	Arraing[s] = in.nextInt();
        }
        int max = Arraing[0];
        int min = Arraing[0];
        
        for(int i = 0; i < a ; i ++ )
        {
            if(max < Arraing[i])
            {
                max = Arraing[i];
            }
        }
    
        
        for(int i = 0; i < a ; i ++ )
        {
            if(min > Arraing[i])
            {
                min = Arraing[i];
            }
        }
        
        System.out.printf("%d %d",min,max);
	}
}
