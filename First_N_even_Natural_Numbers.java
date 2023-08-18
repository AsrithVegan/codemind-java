import java.util.*;
public class nevnum{
    public static void main(String[] args){
        int n,i;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (i=2*n;i>=2;i--){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}