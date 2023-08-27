import java.util.*;
public class OcttoDec{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String n = sc.next();
        int dec = Integer.parseInt(n,8);
        System.out.print(dec);
    }
}