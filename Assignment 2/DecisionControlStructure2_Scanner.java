import java.util.Scanner;

public class DecisionControlStructure2_Scanner {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        double rate, hours, gross, tax, net;

        System.out.print("Enter hourly pay rate: ");
        rate = data.nextDouble();

        System.out.print("Enter hours worked: ");
        hours  = data.nextDouble();

        gross = hours * rate;

        if (gross <= 2000) {
            tax = gross * 0.10;
        } else if (gross <= 4000) {
            tax = gross * 0.12;
        } else if (gross <= 10000) {
            tax = gross * 0.15;
        } else {
            tax = gross * 0.20;
        }
        net = gross * 0.20;

        System.out.println("Gross Pay: " + gross);
        System.out.println("Withinholding Tax: " + tax);
        System.out.println("Net Pay: " + net);

        }
    }
