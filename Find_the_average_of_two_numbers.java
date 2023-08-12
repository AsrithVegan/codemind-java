import java.util.*;
public class avgofnum{
    public static void main(String[] args){
        double a,b;
        double av;
        Scanner se= new Scanner(System.in);
        a = se.nextInt();
        b = se.nextInt();
        av = (a+b)/2;
        System.out.printf("%.4f",av);
    }
}