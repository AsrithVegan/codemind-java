import java.util.*;
public class artrap{
    public static void main(String[] args){
        double b1,b2,h,ar;
        Scanner sc = new Scanner(System.in);
        b1 = sc.nextDouble();
        b2 = sc.nextDouble();
        h = sc.nextDouble();
        ar = ((b1+b2)/2)*h;
        System.out.printf("%.4f",ar);
    }
}