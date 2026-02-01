import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        /*
        백준 - 1920번 : 수 찾기
         */

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
    }
}
