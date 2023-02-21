import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class lonelyInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> a = new ArrayList<>();

        int n = sc.nextInt();
        for (int i = 0; i <n ; i++) {
            a.add(sc.nextInt());
        }

        int i = 0, result=-1;
        Collections.sort(a);
        while(result < 0){
            if(a.get(i) == 1 && a.size() == 1) {
                result = 1;
                break;
            } else if(a.get(i) == a.get(i+1)) i += 2;
            else result = a.get(i);
        }
        System.out.println(result);
    }
}