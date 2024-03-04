import java.util.*;

public class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();
        int [][] Arraing_1 = new int[a][b];
        int [][] Arraing_2 = new int[a][b];
         
        for (int i = 0 ; i < a ; i ++ )
        {
            for (int s = 0 ; s < b ; s ++ )
            {
                Arraing_1[i][s] = in.nextInt();
            }
        }
        
        for (int k = 0 ; k < a ; k ++ )
        {
            for (int p = 0 ; p < b ; p ++ )
            {
                Arraing_2[k][p] = in.nextInt();
            }
        }
        
        for (int n = 0 ; n < a ; n ++ )
        {
            for (int m = 0 ; m < b ; m ++ )
            {
                if (m+1 != b)
                {
                    System.out.printf("%d ",Arraing_1[n][m]+Arraing_2[n][m]);
                }
                if (m+1 == b)
                {
                    System.out.printf("%d\n",Arraing_1[n][m]+Arraing_2[n][m]);
                }
            }
        }
    }
}