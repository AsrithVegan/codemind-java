import java.util.*;
public class Cap{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int s = sc.nextInt();
        int b = sc.nextInt();
        int cap = 2*t*s*b*512;
        int m = cap/1024;
        System.out.print(m+" KB");
    }
}