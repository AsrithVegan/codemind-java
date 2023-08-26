import java.util.*;
public class sumn{
    public static void main(String[] args){
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1;i<=n;i++){
            sum+=i;
        }
        System.out.print(sum);
    }
}