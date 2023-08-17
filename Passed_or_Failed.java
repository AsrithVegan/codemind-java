import java.util.*;
public class porf{
    public static void main(String[] args){
        int a,b,c,d,e,t;
        Scanner se = new Scanner(System.in);
        a = se.nextInt();
        b = se.nextInt();
        c = se.nextInt();
        d = se.nextInt();
        e = se.nextInt();
        t = (a+b+c+d+e)/5;
        if (a>34&&b>34&&c>34&&d>34&&e>34) System.out.print("PASSED");
        else System.out.print("FAILED");
        
    }
}