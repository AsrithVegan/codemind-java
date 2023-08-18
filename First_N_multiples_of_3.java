import java.util.*;
public class threemul{
    public static void main(String[] args){
        int n,i;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i =3;i<=n*3;i++){
            if(i%3==0){
                System.out.print(i+" ");
            }
        }
    }
}