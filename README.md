# Завдання
5. Рядок містить математичний вираз типу "1 + 33-4 * 7". Написати програму для підрахунку значення виразу (пріоритет операцій можна не враховувати)
## Exercise

```java
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
```
## TestResult
```java
package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {

            String expr = "1 + 33 - 4 * 7";
            float value = Exercise.Calculate(expr);
        
            System.out.println("Результат виразу \"" + expr + "\" = " + value);
    }
}
```
## Результат 

![alt text](https://github.com/ppc-ntu-khpi/java-3-AlexRubanUa/blob/master/imageResult "Logo Title Text 1")
