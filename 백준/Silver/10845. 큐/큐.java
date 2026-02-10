import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

       // Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Queue queue = new Queue(10000);

        int length = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < length ; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if(command.equals("push")){

                queue.doMethod("push",Integer.parseInt(st.nextToken()));

            } else {
                sb
                        .append(queue
                                .doMethod(command, 0))
                        .append("\n");
            }
        }

        System.out.print(sb);
    }

    static class Queue{

        int length;
        int[] queue;

        int front; // 맨 앞줄
        int rear; // 맨 뒷줄

        public Queue(int length){

            this.length = length;
            queue = new int[length];
            this.front = 0;
            this.rear = 0;

        }

        public int doMethod(String input, int data){
            return switch (input) {
                case "push" -> push(data);
                case "pop" -> pop();
                case "size" -> size();
                case "empty" -> empty();
                case "front" -> front();
                case "back" -> back();
                default -> -1;
            };
        }

        public int push(int data){

            queue[rear++] = data;
            return -1;
        }

        public int pop(){

            return  (front == rear) ? -1 : queue[front++];

        }

        public int size(){

            return (rear-front);

        }

        public int empty(){
            return (front==rear) ? 1 : 0;

        }

        public int front(){
            return (front == rear) ? -1 : queue[front];

        }

        public int back(){
            return (front == rear) ? -1 : queue[rear-1];
        }

    }
}