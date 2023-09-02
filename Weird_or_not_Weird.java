import java.util.*;
public class weirdorNot{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2!=0){
            System.out.print("weird");
        }
        else{
            System.out.print("not weird");
        }
    }
}