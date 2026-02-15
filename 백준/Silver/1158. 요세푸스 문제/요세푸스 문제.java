import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        /* 백준 - 1158번 : 요세푸스 문제
         */

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();

        // 초기 세팅
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        int index = 0;
        sb.append("<");

        while (!list.isEmpty()) {

            index = (index + K - 1) % list.size();
            sb.append(list.remove(index));

            if (!list.isEmpty()) {
                sb.append(", ");
            }
        }

        sb.append(">");
        System.out.print(sb);
    }
}