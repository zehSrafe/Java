package be.intec.exercices;

import java.util.Arrays;
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        int den = 0;
        boolean validInput = false;
        int tries = 0;

        do {
            try {
                System.out.println("Give number");
                num = Integer.parseInt(input.next());
                System.out.println("Give other number");
                den = Integer.parseInt(input.next());
                double div = someMethod(num, den);
                System.out.printf("%d/%d = %f%n", num, den, div);
                input.close();
                validInput = true;                  // versie met break; in TryCatchScanner
            } catch (ArithmeticException | NumberFormatException numberFormatException) {
                input.nextLine();
                StringBuilder sb = new StringBuilder();
                for (StackTraceElement ste : numberFormatException.getStackTrace()){
                    sb.append("\t").append(ste).append("\n");
                }
                System.out.printf("Error: %s%nStack trace:%n%s%n", numberFormatException.getMessage(), sb);
//            } catch (ArithmeticException arithmeticException) {
//                input.nextLine();
//                System.out.println("Cannot divide by 0 please try again");
            } catch (Exception exception) {         // default error message
                exception.printStackTrace();
            } finally {                     // will always be executed. will be executed after try block aswell as after the catch blocks
                tries++;
            }
        } while (!validInput);

        System.out.printf("Number of tries: %d", tries);
    }

    public static double someMethod(int num, int den) throws Exception{
        return divide(num, den);              // only way you can use the divide method below
    }

    public static int divide(int a, int divideBy) throws Exception {
//        try {
//            if (divideBy == 0) throw new Exception("Can not divide by zero my friend.");
//            return a / divideBy;
//        } catch (Exception exception) {
//            System.out.println(exception.getMessage());
//            return 0;
//        }
        if (divideBy == 0) throw new Exception("Can not divide by zero my friend.");
        return a / divideBy;
    }
}
