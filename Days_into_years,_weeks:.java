import java.util.Scanner;

public class DaysToYearsWeeks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int days = input.nextInt();
        int years = days / 365;
        int weeks = (days % 365) / 7;
        System.out.println(years);
        System.out.println(weeks);
    }
}
