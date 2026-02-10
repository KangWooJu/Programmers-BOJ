import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {

       // Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        /* 백준 - 10828번 : 스택
         */

        Stack stack = new Stack(10000);

        int input = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < input ; i++ ){

            StringTokenizer st = new StringTokenizer(br.readLine());

            String first = st.nextToken();
            if(first.equals("push")){
                stack.doMethod("push",Integer.parseInt(st.nextToken()));
            } else {
                sb
                        .append(stack
                                .doMethod(first,0))
                        .append("\n");

            }

        }

        System.out.print(sb);

    }



    static class Stack {

        int[] stack;
        int top;

        public Stack(int size){
            stack = new int[size];
            top = 0;
        }

        public int doMethod(String input, int number){
            return switch (input) {
                case "push" -> push(number);
                case "pop" -> pop();
                case "size" -> size();
                case "empty" -> empty();
                case "top" -> top();
                default -> -1;
            };
        }

        public int push(int number){
            stack[top++] = number;
            return -1;
        }

        public int pop(){
            if (top == 0) return -1;
            return stack[--top];
        }

        public int size(){
            return top;
        }

        public int empty(){
            return top == 0 ? 1 : 0;
        }

        public int top(){
            if (top == 0) return -1;
            return stack[top - 1];
        }
    }


    /*
    static class Point implements Comparable<Point> {
        // Collections.sort(point)를 사용하면 내부의 CompareTo() 메소드를 채택하여 사용한다.

        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            /*if(this.x != o.x) return this.x - o.x;
            return this.y - o.y;


            if(this.y != o.y) return this.y- o.y;
            return this.x - o.x;
        }
    }

     */

}