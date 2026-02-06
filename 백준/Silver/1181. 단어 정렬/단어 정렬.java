import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

       // Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        Set<String> inputString = new HashSet<>();

        int input = Integer.parseInt(br.readLine());
        for(int i=0;i<input;i++){
            inputString.add(br.readLine());
        }

        List<String> list = new ArrayList<>(inputString);
        list.sort( (a,b)->{
            if(a.length() == b.length()){
                return a.compareTo(b);
            } return a.length() - b.length();
                });

        for(String s : list){
            sb.append(s).append("\n");
        }

        System.out.print(sb);

    }
}
