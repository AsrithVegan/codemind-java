import java.util.*;
public class handm{
    public static void main(String[] args){
        int m;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        int hr = m/60;
        int min = m%60;
        System.out.printf("%d Hour(s) %d Minute(s)",hr,min);
    }
}