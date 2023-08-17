import java.util.*;
public class code{
    public static void main(String[] args){
        int n;
        Scanner se = new Scanner(System.in);
        n = se.nextInt(); 
        if(n>20){
            System.out.print("HOT");
        }
        else if(n<=20){
            System.out.print("COLD");
        }
    }
}