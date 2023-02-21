import java.util.Scanner;

public class timeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char ap = s.charAt(s.length()-2);
        s = s.substring(0, s.length()-2);
        if(ap == 'A'){
            int hh = Integer.parseInt(s.substring(0,2));
            if (hh==12) hh = 0;
            String str = Integer.toString(hh);
            if(str.length() == 1){
                str = "0" + str;
            }
            System.out.println(str + s.substring(2,s.length()));
        }else{
            int hh = Integer.parseInt(s.substring(0,2));
            if( hh != 12) hh += 12;
            String str = Integer.toString(hh);
            if(str.length() == 1){
                str = "0" + str;
            }
            System.out.println(hh + s.substring(2,s.length()));
        }
    }
}
