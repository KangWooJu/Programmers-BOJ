import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

       // Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int input = Integer.parseInt(br.readLine());
        List<Point> points = new ArrayList<>();

        for(int i=0;i<input;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            points.add(new Point(x,y));
        }

        Collections.sort(points);
        for(int i=0;i<input;i++){

            sb
                    .append(points
                            .get(i).x)
                    .append(" ")
                    .append(points
                            .get(i).y)
                    .append("\n");
        }

        System.out.print(sb);

    }

    static class Point implements Comparable<Point> {
        int x, y;
        public Point(int x, int y) { this.x = x; this.y = y; }

        @Override
        public int compareTo(Point o) {
            if(this.x != o.x) return this.x - o.x;
            return this.y - o.y;
        }
    }
}
