package spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    public double add(double a, double b) {
        double result = a + b;
        display.display(result);
        return result;
    }

    public double subtract(double a, double b) {
        double result = a - b;
        display.display(result);
        return result;
    }

    public double multiplu(double a, double b) {
        double result = a * b;
        display.display(result);
        return result;
    }

    public double divide(double a, double b) {
        if (b != 0) {
            double result = a / b;
            display.display(result);
            return result;
        }
        throw new ArithmeticException("Cannot divide by 0!");
    }
    public Display getDisplay() {
        return display;
    }

    public double multiply(int i, int i1) {
        return 0;
    }
}
