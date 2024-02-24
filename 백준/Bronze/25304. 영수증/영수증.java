import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int total = in.nextInt();
        int count = in.nextInt();
        int[] list = new int[count];
        int calcul_result = 0;
        
        for(int a=0;a<count;a++)
        {
        	int price = in.nextInt();
        	int price_count = in.nextInt();
        	list[a] = price * price_count;
        }
        
        for(int b=0;b<count;b++)
        {
        	calcul_result += list[b];
        }
        
        if(total == calcul_result)
        {
        	System.out.printf("Yes");
        }
        else
        {
        	System.out.printf("No");
        }
       
	}
		
}
