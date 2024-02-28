import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        
        int index = in.nextInt();
        int count = in.nextInt();
        
        int[] Arraing = new int[index];
        
        for(int a = 0; a < index; a++)
        {
            Arraing[a] = 0; // 0으로 전부 초기화 시작
        }
        
        for(int b=0;b<count;b++)
        {
            int input_1 = in.nextInt();
            int input_2 = in.nextInt();
            int input_3 = in.nextInt();
            
            for(int c = input_1 - 1 ; c <= input_2 - 1 ; c ++ )
            {
                Arraing[c] = input_3;
            }
        }
		
        for(int d = 0 ; d < index ; d ++ )
        {
            System.out.printf("%d ",Arraing[d]);
        }
	}
}

