public class temperature { // pangalan po ng class
    public static void main(String[] args) { // dito po start ng program

        double[] temperatures = new double[5]; // gumagawa po ng double array na may five elemnts

        temperatures[0] = 32.5; // naglagay po ng temp sa 1st day
        temperatures[1] = 34.0; // naglagay po ng temp sa 2nd day
        temperatures[2] = 31.8; // naglagay po ng temp sa 3rd day
        temperatures[3] = 33.2; // naglagay po ng temp sa 4th day
        temperatures[4] = 35.1; // naglagay po ng temp sa 5th day

        System.out.println("Daily Temperatures:"); // pinakita po yung daily temp

        for (int i = 0; i < temperatures.length; i++) { // umiikot po hanggang sa end ng element gamit yung length
            System.out.println("Day " + (i + 1) + ": " + temperatures[i]); // pinakita po ang temperature bawat araw
        }

        temperatures[2] = 32.0; // binabago po yung temperature ng 3rd day na 31.8 papuntang 32.0

        System.out.println("Updated temperature for the third day: " + temperatures[2]); // bagong temp po ng 3rd day
    }
}