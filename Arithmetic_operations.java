import java.util.*;
public class Sol{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = n+m;
        int d = n-m;
        int p = n*m;
        int q = n/m;
        int r = n%m;
        System.out.printf("Sum:%d
Difference:%d
Product:%d
Quotient:%d
Remainder:%d",s,d,p,q,r);
    }
}