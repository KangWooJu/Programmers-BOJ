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

        /* 백준 - 1406번 : 에디터
         */

        // 편집기 문자열 받기
        String line = br.readLine();

        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        for(int i=0;i<line.length();i++){
            left.push(line.charAt(i));
        }
        Editor editor = new Editor(left,right);

        // 명령어 개수 입력받기
        int number = Integer.parseInt(br.readLine());

        for(int i=0;i<number;i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if(command.equals("P")){
                editor.doCommand("P",st.nextToken().charAt(0));
            } else {
                editor.doCommand(command,'r');
            }
        }

        // 왼쪽 오른쪽 병합하기
        while(!left.isEmpty()){
            right.push(left.pop());
        }

        // StringBuilder에 모으기
        while(!right.isEmpty()){
            sb.append(right.pop());
        }

        System.out.print(sb);


    }

    static class Editor{

        Stack<Character> left;
        Stack<Character> right;

        public Editor(Stack<Character> left,
                      Stack<Character> right){

            this.left = left;
            this.right = right;
        }

        public void doCommand(String command,
                              Character alphabet){

            switch (command){
                case "L":
                    if(!left.isEmpty()){
                        right.push(left.pop());
                    }
                    break;

                case "D":
                    if(!right.isEmpty()){
                        left.push(right.pop());
                    }
                    break;

                case "B":
                    if(!left.isEmpty()){
                        left.pop();
                    }
                    break;

                case "P":
                    left.push(alphabet);
                    break;
            }
        }
    }


}