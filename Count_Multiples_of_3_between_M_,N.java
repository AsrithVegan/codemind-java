import java.util.*;
public class mnthree{
    public static void main(String[] args){
        int m,n,i;
        int c=0;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        for(i=m;i<=n;i++){
            if(i%3==0){
                c++;
            }
        }
        System.out.print(c);
    }
}