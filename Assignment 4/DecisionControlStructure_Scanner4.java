import java.util.Scanner;

public class DecisionControlStructure_Scanner4 {
    public static void main(String[] args) {

        Scanner DATA = new Scanner(System.in);

        double height;
        int age;
        String citizenship, recommendee;

        System.out.print("Enter height: ");
        height = DATA.nextDouble();

        System.out.print("Enter age: ");
        age = DATA.nextInt();

        System.out.print("Enter citizenship (C or N): ");
        citizenship = DATA.next();

        System.out.print("Enter recommendee (R or N): ");
        recommendee = DATA.next();

        if (recommendee.equalsIgnoreCase("R")) {
            System.out.println("ACCEPTED!");
        } else if (height >= 200 && age >= 21 && age <= 25 && citizenship.equalsIgnoreCase("C")) {
            System.out.println("ACCEPTED!");
        } else {
            System.out.println("REJECTED!");
        }
    }
}