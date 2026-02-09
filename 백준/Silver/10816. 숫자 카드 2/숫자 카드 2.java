import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashMap<Integer,Integer> map = new HashMap<>();

        int number = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        while(st.hasMoreElements()){
            int key = Integer.parseInt(st.nextToken());
            map.put(key,map.getOrDefault(key,0)+1);
        }

        int number2 = Integer.parseInt(br.readLine());

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        while(st2.hasMoreElements()){
            sb
                    .append(map.getOrDefault(Integer.parseInt(st2.nextToken()),0))
                    .append(" ");
        }

        System.out.print(sb);

    }
}
