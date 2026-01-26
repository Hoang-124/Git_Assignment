// 1. Định nghĩa các ký hiệu phép tính
enum SIGN {
    PLUS, MINUS, MULTIP
            }
                
            
public class Calculator {
    private Double calculate(SIGN sign, Double arg1, Double arg2) { 
        switch (sign) {
            case PLUS: 
                return arg1 + arg2;
            default:
                break;
        }
        return 0d;
    }
}