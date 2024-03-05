import java.util.*;

public class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        in.nextLine(); 
        
        String[] Arraing = new String[number];

        for (int a = 0; a < number; a++) 
        {
             Arraing[a] = in.nextLine();
        }
        
        for(int s=0;s<number;s++)
        {	
        	if (Arraing[s].length() == 1) 
        	{
            System.out.printf("%c%c",Arraing[s].charAt(0) , Arraing[s].charAt(0));
            System.out.printf("\n");
            } 
        	else 
        	{
            System.out.printf("%c%c",Arraing[s].charAt(0) , Arraing[s].charAt(Arraing[s].length() - 1));
            System.out.printf("\n");
            }
        }
    }
}