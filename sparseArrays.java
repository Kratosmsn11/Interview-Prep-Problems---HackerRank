import java.util.ArrayList;
import java.util.Scanner;

public class sparseArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> strings = new ArrayList<>();
        ArrayList<String> queries = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        int n = Integer.parseInt(sc.next());
        for (int i = 0; i <n; i++) {
            strings.add(sc.next());
        }

        int q = Integer.parseInt(sc.next());
        for (int i = 0; i < q; i++) {
            queries.add(sc.next());
        }

        for (int i = 0; i < q; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if(queries.get(i).equals(strings.get(j))) count ++;
            }
            result.add(count);
        }

        System.out.println(result);

    }
}