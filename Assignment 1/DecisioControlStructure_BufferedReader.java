import java.io.*;

public class DecisioControlStructure_BufferedReader {
    public static void main(String[] args) {

        BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.print("Enter year ");
            int year = Integer.parseInt(breader.readLine());

            if ( year % 400 == 0) {
                System.out.println("Leap Year");

            } else if (year % 100 == 0) {
                System.out.println("Not a leap year");

            } else if (year % 4 == 0) {
                System.out.println("Leap Year");

            } else {
                System.out.println("Not a leap year");
            }

        }  catch (Exception e) {
            System.out.println("Invalid Output");
            }
        }

    }