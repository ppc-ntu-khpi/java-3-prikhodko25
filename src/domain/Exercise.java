package domain;

public class Exercise {
    public static float Calculate(String expression) {
        
    String[] tokens = expression.split(" ");
            if (tokens.length == 0) return 0;

            float result = Float.parseFloat(tokens[0]);

            for (int i = 1; i < tokens.length; i += 2) {
                String operator = tokens[i];
                float number = Float.parseFloat(tokens[i + 1]);

                switch (operator) {
                    case "+": result += number; break;
                    case "-": result -= number; break;
                    case "*": result *= number; break;
                    case "/": result /= number; break;
                    default:
                        System.out.println("Невідомий оператор: " + operator);
                }
            }

            return result;
        }
    }


