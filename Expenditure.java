import java.util.*;
public class exp{
    public static void main(String[] args){
        int x,y,z;
        Scanner se = new Scanner(System.in);
        y = se.nextInt();
        z = se.nextInt();
        x = z*30;
        if(x<=y) System.out.print("YES");
        else System.out.print("NO");
    }
}