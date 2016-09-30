package crawley.james.exceptions_lab_1;

/**
 * Created by jamescrawley on 9/30/16.
 */
public class Calculator {

    public static double add (double a, double b) {

        return a + b;

    }

    public static double subtract (double a, double b) {

        return a - b;

    }

    public static double multiply (double a, double b) {

        return a * b;

    }

    public static double divide (double a, double b) throws DivideByZeroException {

        if (b == 0) {

            throw new DivideByZeroException();
        }

        return a / b;

    }

//    public static int add () {
//
//    }
}
