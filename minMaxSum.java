import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class minMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>(5);

        for (int i = 0; i < 5; i++) {
            arr.add(sc.nextInt());
        }

        Collections.sort(arr);
        long min = 0, max = 0;
        for (int i = 0; i < arr.size()-1; i++) {
            min += arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            max += arr.get(i);
        }
        System.out.println(min+" "+max);
    }
}