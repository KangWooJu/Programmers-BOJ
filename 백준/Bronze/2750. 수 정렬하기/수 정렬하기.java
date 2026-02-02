import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /* 카운팅 정렬 예시
         */

        /*
        int[] array = {0,1,3,0,1};

        CountingSort countingSort = new CountingSort(5,array);
        countingSort.doCountingSort();

         */


        // 2026-01-31
        /* 백준 - 1920번 : 수 찾기
         */

        /*
        // 입력받기
        int input = scanner.nextInt();
        HashSet<Integer> inputSet = new HashSet<>();

        for(int i=0; i<input; i++){
            inputSet.add(scanner.nextInt());
        }

        int input2 = scanner.nextInt();
        List<Integer> inputList = new ArrayList<>();

        for(int i=0; i<input2; i++){
            inputList.add(scanner.nextInt());
        }

        inputList
                .stream()
                .map(x -> inputSet.contains(x) ?1:0)
                .forEach(System.out::println);
        */


        /* 백준 - 2750번 : 수 정렬하기
         */

        int n = scanner.nextInt();
        int[] array = new int[n];

        for( int i=0;i<n;i++){
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        for(int i:array){
            System.out.println(i);
        }

    }
}
