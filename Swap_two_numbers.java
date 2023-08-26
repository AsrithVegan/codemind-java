import java.util.*;
public class swapTwoNum{
    public static void main(String[] args){
        int a,b;
        int temp;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        temp = a;
        a = b;
        b = temp;
        System.out.print(a+"
"+b);
    }
}