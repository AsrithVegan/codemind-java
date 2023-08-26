import java.util.*;
public class avgoftw{
    public static void main(String[] args){
        double a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = (a+b)/2;
        System.out.printf("Average of %.0f and %.0f is: %.2f",a,b,c);
    }
}