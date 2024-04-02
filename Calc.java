//package Calculator;
//
//import java.util.Scanner;
//class Calc {
//    public static void main(String[] args) throws Exception {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input two numbers (arabian or roman): ");
//        String expression = scanner.nextLine();
//        System.out.println(parse(expression));
//    }
//
//    public static String parse(String Expression) throws Exception {
//        int num1;
//        int num2;
//        String oper;
//        String result;
//        boolean isRoman;
//        String[] operands = expression.split( "[+\\-*]");
//        if (operands.length != 2) throw new Exception("Must be two operands");
//        oper = detectOperation(expression);
//        if (oper == null) throw new Exception("mathematic operation is unsupported");
//
//        // if both numbers is Roman
//        if (Roman.isRoman(operands[0] && Roman.isRoman(operands[1]))){
//            // Converting both numbers into arabian due to make arip
//        }
//
//    }
//}
