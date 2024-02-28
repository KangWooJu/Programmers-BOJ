import java.util.*;

public class Main
{
	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        
        double total = 0;
        int count = in.nextInt();
        int[] Arraing = new int[count];
        for(int i = 0 ; i < count ; i ++)
        {
            Arraing[i] = in.nextInt();
        }
        
        int max = 0;
        for(int s = 0 ; s < count ; s++)
        {
            if(max<Arraing[s])
            {
                max = Arraing[s];
            }
        }
        
        for( int k = 0 ; k < count ; k++)
        {
            total = total + Arraing[k];
        }
        total = (total*100/max)/count;
        System.out.print(total);
       
		
		
	}


}

