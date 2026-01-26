public class Calculator {
    private Double calculate(String sign, Double arg1, Double arg2) {
        switch (sign) {
case PLUS:
    return arg1 + arg2;            default:
                break;
        }
        return 0d;
    }
}