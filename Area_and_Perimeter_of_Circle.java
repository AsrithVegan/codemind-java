import java.util.*;
public class arandpr{
    public static void main(String[] args){
        double n,ar,pr;
        Scanner sc = new Scanner(System.in);
        n = sc.nextDouble();
        ar =(double) 3.14*n*n;
        pr =(double)2*(3.14*n);
        System.out.printf("%.2f
%.2f",ar,pr);
    }
}