import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        int[] B = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        CountingSort countingSort = new CountingSort(B);
        int[] Bdesc = countingSort.reverseArray();

        int total = 0;
        for (int i = 0; i < n; i++) {
            total += A[i] * Bdesc[i];
        }

        System.out.println(total);
    }

    // 🔽 내부 클래스
    static class CountingSort {

        int[] array;

        public CountingSort(int[] array) {
            this.array = array;
        }

        public int[] doCountingSort() {

            int max = 0;
            for (int i : array) {
                max = Math.max(max, i);
            }

            int[] counting = new int[max + 1];
            for (int i : array) {
                counting[i]++;
            }

            for (int i = 1; i < counting.length; i++) {
                counting[i] += counting[i - 1];
            }

            int[] sorted = new int[array.length];
            for (int i = array.length - 1; i >= 0; i--) {
                int v = array[i];
                sorted[--counting[v]] = v;
            }

            return sorted;
        }

        public int[] reverseArray() {
            int[] sorted = doCountingSort();
            int[] reversed = new int[sorted.length];

            for (int i = 0; i < sorted.length; i++) {
                reversed[i] = sorted[sorted.length - 1 - i];
            }

            return reversed;
        }
    }
}
