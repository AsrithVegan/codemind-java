import java.util.*;
public class canCrBr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int k = (z-y)/x;
        System.out.print(k);
    }
}