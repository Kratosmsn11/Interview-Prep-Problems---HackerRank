import javax.naming.InsufficientResourcesException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class plusMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // using this just for testing purposes

        double positive = 0, negative = 0, zeros = 0;

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if(temp < 0){
                negative++;
            } else if (temp > 0) {
                positive++;
            }else {
                zeros++;
            }
        }

        System.out.println(String.format("%.6f", (positive/n)));
        System.out.println(String.format("%.6f", (negative/n)));
        System.out.println(String.format("%.6f", (zeros/n)));
    }
}