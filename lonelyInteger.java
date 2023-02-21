import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class lonelyInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList();
        int n = sc.nextInt();

        for(int i = 0; i < n; ++i) {
            a.add(sc.nextInt());
        }

        int result = 0;
        for (int i = 0; i < a.size(); i++) {
            result ^= a.get(i);             // using bit operator xor will result in just the element that has
        }

        System.out.println(result);
    }
}