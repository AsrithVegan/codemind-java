import java.util.*;
public class bigoftwo{
    public static void main(String[] args){
        int n,m;
        Scanner se = new Scanner(System.in);
        n = se.nextInt(); 
        m = se.nextInt();
        if(n>m){
            System.out.print(n);
        }
        else{
            System.out.print(m);
        }
    }
}