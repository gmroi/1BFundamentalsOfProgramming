import java.util.Scanner;

public class DecisionControlStructure_Assignment3_Scanner {
    static void main(String[] args) {

        Scanner DATA = new Scanner(System.in);

        double nsat, salary, exam;
        System.out.print("Enter your nsat score: ");
        nsat = DATA.nextDouble();

        System.out.print("Enter parents monthly income: ");
        salary = DATA.nextDouble();

        System.out.print("Enter entrance exam score: ");
        exam = DATA.nextDouble();

        if ( salary > 10000 || nsat < 90 || exam < 85){
            System.out.println("REJECTED!");
        } else if (salary <= 3500 && (nsat + exam) / 2>= 91) {
            System.out.println("ACCEPTED!");
        } else {
            System.out.println(" For further study!");
            System.out.println("GALING MO MEN");

        }
    }
}