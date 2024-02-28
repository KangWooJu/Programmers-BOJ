import java.util.*;

public class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int[] Arraing_1 = new int[100];
        int[] Arraing_2 = new int[100];
        int count = 0;
        boolean index = true;
        
        while(index)
        {
            Arraing_1[count] = in.nextInt();
            Arraing_2[count] = in.nextInt();
            
            if((Arraing_1[count]==0)&&(Arraing_2[count]==0))
            {
                index = false;
                break;
            }
           count++;
        }
        
        for( int i = 0 ; i < count ; i++ )
        {
            int result = Arraing_1[i] + Arraing_2[i];
            System.out.printf("%d\n",result);
        }
    }
}