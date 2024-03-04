import java.util.*;

public class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int[][] Arraing = new int[9][9];
        
        for(int a = 0 ; a < 9 ; a ++ )
        {
            for ( int b = 0 ; b < 9 ; b ++ )
            {
                Arraing[a][b] = in.nextInt();
            }
        }
        
        int max = 0;
        int index_1 = 0;
        int index_2 = 0;
        for( int c = 0 ; c < 9 ; c ++ )
        {
            for ( int d = 0 ; d < 9 ; d ++ )
            {
                if ( max <= Arraing[c][d])
                {
                    max = Arraing[c][d];
                    index_1 = c;
                    index_2 = d;
                }
            }
        }     
        System.out.printf("%d\n",Arraing[index_1][index_2]);
        System.out.printf("%d %d",index_1+1,index_2+1);
    }
}