package crawley.james.exceptions_lab_1;

/**
 * Created by jamescrawley on 9/30/16.
 */
public class DivideByZeroException extends ArithmeticException {

    DivideByZeroException () {

        super();
    }

    DivideByZeroException (String message) {

        super(message);

    }
}
