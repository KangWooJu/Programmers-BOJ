import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        /* 백준 - 1037번 : 약수
         */

        int result;
        int number = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()){
            list.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(list);

        int max = Collections.max(list);
        int min = Collections.min(list);

        if(max == min){
            result = max*max;
        } else {
            result = min * max;
        }

        System.out.println(result);
        

    }
}