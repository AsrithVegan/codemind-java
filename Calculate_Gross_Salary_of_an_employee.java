import java.util.*;
public class calgr{
    public static void main(String[] args){
        double bs,hra,da,gs;
        Scanner sc = new Scanner(System.in);
        bs = sc.nextDouble();
        hra = sc.nextDouble();
        da = sc.nextDouble();
        double pf = (double) bs*0.12;
        gs = bs+hra+da+pf;
        System.out.printf("%.2f
",pf);
        System.out.printf("%.2f",gs);
    }
}