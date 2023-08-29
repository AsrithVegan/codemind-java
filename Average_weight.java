import java.util.*;
public class AvWe{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int b3 = (x*3)-(b1+b2);
        System.out.print(b3);
    }
}