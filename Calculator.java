enum SIGN {
    PLUS, MINUS, MULTIPLY, DIVIDE
}

public class Calculator {
    private Double calculate(SIGN sign, Double arg1, Double arg2) {
        switch (sign) {
            case MINUS:
                return arg1 - arg2;
            default:
                break;
        }
        return 0d;
    }
}