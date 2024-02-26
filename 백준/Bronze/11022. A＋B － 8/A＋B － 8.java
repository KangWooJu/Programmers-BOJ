import java.util.*;

public class Main{
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] intArray_1 = new int[a];
        int[] intArray_2 = new int[a];
        int[] intArray_3 = new int[a];
        
        for(int i=0;i<a;i++)
        {
            int b = in.nextInt();
            int c = in.nextInt();
            
            intArray_1[i] = b;
            intArray_2[i] = c;
            intArray_3[i] = b + c;
        }
        
        for(int k=0;k<a;k++)
        {
        	System.out.printf("Case #%d: %d + %d = %d\n",k+1,intArray_1[k],intArray_2[k],intArray_3[k]);
        }
    }
}