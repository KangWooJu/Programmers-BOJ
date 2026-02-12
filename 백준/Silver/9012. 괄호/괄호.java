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

        /* 백준 - 9012번 : 괄호
         */

        int number = Integer.parseInt(br.readLine());

        for(int i=0;i<number;i++){

            Stack<Character> stack = new Stack<>();
            boolean flag = true;


            String s = br.readLine();
            for(char c:s.toCharArray()){
                switch (c) {
                    case '(' : {
                        stack.push('(');
                        break;
                    }

                    case ')' : {
                        // 스택이 비워져 있는 경우
                        if(stack.isEmpty()){
                            flag = false;
                            break;
                        } else {
                            stack.pop();
                            break;
                        }
                    }

                }
            }

            if(!stack.isEmpty()){
                flag = false;
            }
            
            if(flag){
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
        }

        System.out.print(sb);
    }
}