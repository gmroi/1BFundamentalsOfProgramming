import java.io.InputStreamReader;
import java.util.Scanner;
public class DecisionControlStructure_Scanner {
    static void main(String[] args) {

        Scanner SCANNER = new Scanner(System.in);

        System.out.print("Enter year");
        int year = SCANNER.nextInt();

        if (year % 400 == 0) {
            System.out.println("Leap Year");

        } else if ( year % 100 == 0) {
            System.out.println("Not a leap year");

        } else if (year % 4 == 0) {
            System.out.println("Leap Year");

        } else {
        System.out.println("Not a leap year");

        SCANNER.close();

        }
    }
}