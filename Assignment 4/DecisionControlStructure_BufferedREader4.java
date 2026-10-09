import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecisionControlStructure_BufferedREader4 {
    public static void main(String[] args) throws IOException {

        BufferedReader JEDI = new BufferedReader(new InputStreamReader(System.in));

        double height;
        int age;
        String citizenship, recommendee;

        System.out.print("Enter height: ");
        height = Double.parseDouble(JEDI.readLine());

        System.out.print("Enter age: ");
        age = Integer.parseInt(JEDI.readLine());

        System.out.print("Enter citizenship (C or N): ");
        citizenship = JEDI.readLine();

        System.out.print("Enter recommendee (R or N): ");
        recommendee = JEDI.readLine();

        if (recommendee.equalsIgnoreCase("R")) {
            System.out.println("ACCEPTED!");
        } else if (height >= 200 && age >= 21 && age <= 25 && citizenship.equalsIgnoreCase("C")) {
            System.out.println("ACCEPTED!");
        } else {
            System.out.println("REJECTED!");
        }
    }
}