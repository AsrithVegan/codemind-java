import java.util.*;
public class code{
    public static void main(String[] args){
        int n,m;
        Scanner se = new Scanner(System.in);
        n = se.nextInt(); 
        m = se.nextInt();
        if(n<m){
            System.out.print("Profit");
        }
        else if(n==m){
            System.out.print("No profit and No loss");
        }
        else{
            System.out.print("Loss");
        }
    }
}