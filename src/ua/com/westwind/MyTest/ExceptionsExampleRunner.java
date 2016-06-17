package ua.com.westwind.MyTest;

import java.util.Scanner;

public class ExceptionsExampleRunner {
    public static void main(String[] args) {
        System.out.println("Hello please enter tour age:");
        final Scanner scanner = new Scanner(System.in);

        final String userInput = scanner.next();

        try {
            final int age = Integer.parseInt(userInput);
            if(age<0) {
                throw new NagativAgeException(age);
            }
            System.out.println("Your age is: "+age);
        } catch (NumberFormatException ex){
            System.out.printf("[Error]: Age should be an integer number!");
        } catch (NagativAgeException e) {
            System.out.println("[Error]: Entered age is: '" +e.getAgeValue()+ "' Age shuolde be > 0!");
        }

    }
}
