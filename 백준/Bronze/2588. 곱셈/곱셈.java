import java.util.*;

public class Main{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        
        int b1 = b/100; // 100의 자리
        int b2 = ( b - b1*100 ) / 10 ; // 10의 자리
        int b3 = ( b - ((b1*100) + (b2*10))); /// 1의 자리
        System.out.println(a*b3);
        System.out.println(a*b2);
        System.out.println(a*b1);
        System.out.println((a*b3)+(a*b2*10)+(a*b1*100));
    }
}