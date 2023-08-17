import java.util.*;
public class contest{
    public static void main(String[] args){
        int a,b,c,m;
        Scanner se = new Scanner(System.in);
        a = se.nextInt();
        b = se.nextInt();
        c = se.nextInt();
        m = 1*b+c*2;
        if(m>=a) System.out.print("Qualify");
        else System.out.print("Not Qualify");
    }
}