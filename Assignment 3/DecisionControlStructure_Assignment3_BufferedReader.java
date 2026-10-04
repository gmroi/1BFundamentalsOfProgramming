import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecisionControlStructure_Assignment3_BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader BREADER = new BufferedReader(new InputStreamReader(System.in));

        double nsat, salary, exam;

        System.out.print("Enter your nsat score: ");
        nsat = Double.parseDouble(BREADER.readLine());

        System.out.print("Enter your parent monthly salary: ");
        salary = Double.parseDouble(BREADER.readLine());

        System.out.print("Enter exam score: ");
        exam = Double.parseDouble(BREADER.readLine());

        if (salary > 10000 || nsat < 90 || exam < 85) {
            System.out.println("REJECTED!");

        } else if (salary <= 3500 && nsat + exam >= 182) {
            System.out.println("ACCEPTED!");
        } else {
            System.out.println("FOR FURTHER STUDY!");

        }
        }
        }