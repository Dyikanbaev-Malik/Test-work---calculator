import java.sql.SQLOutput;
import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the first Number");
        float a = sc.nextFloat();
        System.out.println("Input an operation ( +, -, *, /)");
        char operation = sc.next().charAt(0);
        System.out.println("Type the second Number");
        float b = sc.nextFloat();

        if (operation == '+') {
            float result = a + b;
            System.out.println(a + " + " + b + " = " + result);
        } else if (operation == '-'){
            float result = a - b;
            System.out.println(a + " - " + b + " = " + result);
        } else if (operation == '*'){
            float result = a * b;
            System.out.println(a + " * " + b + " * " + result);
        } else if (operation == '/'){
            float result = a / b;
            System.out.println(a + " / " + b + " / " + result);
        } else {
            System.out.println("Your operation is not supported, please, enter an operation from above");
        }
    }
}

