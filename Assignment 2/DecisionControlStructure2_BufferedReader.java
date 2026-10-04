
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DecisionControlStructure2_BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader BREADER = new BufferedReader(new InputStreamReader(System.in));

        double rate, hours, gross, tax, net;

        System.out.print("Enter hourly pay rate: ");
        rate = Double.parseDouble(BREADER.readLine());

        System.out.print("Enter hours worked: ");
        hours = Double.parseDouble(BREADER.readLine());

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

        net = gross - tax;

        System.out.println("Gross Pay: " + gross);
        System.out.println("Withholding Tax: " + tax);
        System.out.println("Net Pay: " + net);

    }
}