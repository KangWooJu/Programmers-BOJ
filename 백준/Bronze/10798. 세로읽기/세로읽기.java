import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[][] Arraing = new char[5][15];

        for (int first = 0; first < 5; first++) {
            String inner = in.next();
            for (int second = 0; second < inner.length(); second++) {
                Arraing[first][second] = inner.charAt(second);
            }
        }

      
        for (int third = 0; third < 15; third++) {
            for (int forth = 0; forth < 5; forth++) {
            	if((Arraing[forth][third]=='\0')||(Arraing[forth][third]==' '))
            	{
            		continue;
            	}
            	else
            	{
                System.out.print(Arraing[forth][third]);
            	}
            }
        }
    }
}



