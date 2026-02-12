import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        /* 백준 - 1874번 : 스택 수열
         */

        int count = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        int nextVal = 1;
        boolean flag = true;

        for(int i = 0 ; i < count ; i ++ ){

            int number = Integer.parseInt(br.readLine());


                while(nextVal <= number){
                    stack.push(nextVal);
                    nextVal++;
                    sb.append("+").append("\n");
                }

                if(stack.peek()==number){
                    stack.pop();
                    sb.append("-").append("\n");
                } else {
                    flag = false;
                    break;
                }
        }

        if(!flag){
                System.out.print("NO");
        }

        if(flag){
            System.out.print(sb);
        }
    }
}