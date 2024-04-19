package arabianAndRoman;
import java.util.Scanner;
import java.io.*;

public class Calculator {
    public static void main(String[] args) {
        //2+3
        //X+V=XV
        Converter converter = new Converter();
        String[] actions = {"+", "-", "/", "*"};
        String[] regexActions = {"\\+", "-", "/", "\\*"};
        Scanner scn = new Scanner(System.in);
        System.out.print("Write below an expression: ");
        String exp = scn.nextLine();

        // Determine arithmetic actions
        int actionIndex=-1;
        for (int i = 0; i < actions.length; i++) {
            if(exp.contains(actions[i])){
                actionIndex = i;
                break;
            }
        }
        // If there is no arithmetic action, then end the program
        if(actionIndex==-1){
            System.out.println("Incorrect expression");
            return;
        }

        // Devide string by arithmetic character
        String[] data = exp.split(regexActions[actionIndex]);

        //Determine if there are both numbers are in equal format or not)
        if(converter.isRoman(data[0]) == converter.isRoman(data[1])){
            int a,b;

            // Determine if the numbers are Roman
            boolean isRoman = converter.isRoman(data[0]);
            if(isRoman){

                // If numbers are Roman, then convert them to Arabian
                //X+V
                //x-10
                //v - 5
                a = converter.romanToInt(data[0]);
                b = converter.romanToInt(data[1]);

            }else{

                //If arabian, then convert string to integer
                a = Integer.parseInt(data[0]);
                b = Integer.parseInt(data[1]);
            }


            // making arithmetic actions with numbers
            int result;

//            try {
//                System.out.println("An exception in program");
//                result = a/b;
//            }catch (ArithmeticException e){
//                System.out.println("Devide to null is forbidden!!!");
//                result =0;
//            }
//            System.out.println("The method is done!");

            try {
                System.out.println(a/b);
            }catch (ArithmeticException e){
                System.out.println(" Devide by zero operation is not possible");
            }

            result = switch (actions[actionIndex]) {
                case "+" -> a + b;
                case "-" -> a - b;
                case "*" -> a * b;
                default -> a / b;
            };


            //15->XV
            if(isRoman){

               // If Roman numbers, return to Roman
                System.out.println(converter.intToRoman(result));
            }
            else{

                //If arabian numbers, return result in Arabian
                System.out.println(result);
            }
        }else{
            System.out.println("The numbers must be in equal format");
        }


    }
}

