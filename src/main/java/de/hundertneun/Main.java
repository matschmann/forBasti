package de.hundertneun;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.err.println("No input given.");
            return;
        }

        try {
            int intFromCommandLine = Integer.parseInt(args[0]);

            String s = factorize(intFromCommandLine);

            System.out.println("Prime Numbers of " + intFromCommandLine + " are: " + s);

        } catch (NumberFormatException e) {
            System.err.println("Given argument " + args[0] +  " is not a number.");
        }
    }

    private static String factorize(int intFromCommandLine) {
        IntegerFactorizer integerFactorizer = new IntegerFactorizer();
        List<Integer> factors = integerFactorizer.factorize(intFromCommandLine);

        // this creates a comma separated string from the numbers in the list.
        String s = factors.stream().map(e -> e.toString() + ", ").reduce("", String::concat);

        return s;
    }
}
