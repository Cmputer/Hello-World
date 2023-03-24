import java.util.Scanner;                                                       // Import the Scanner class from the java.util package to read user input

public class HelloWorld 
{
    
    public static void printMessage()                                           // A simple method to print the message at the end
    {
        System.out.println("This is a simple java class that can be cloned and used \n" +
            "by the user to learn more about GitHub. This same program is \n" +
            "available in multiple different languages to give a good idea\n" +
            "of how repositories work. Please refer to the README.md file in \n" +
            "this repo to learn more about adding this to your OWN GitHub\n" +
            "and how to eventually showcase your own code!");
    }
    
    public static void main(String[] args) 
    {
        System.out.println("Hello World!");                                     // Print "Hello World!" to the console
        System.out.println("Press the enter key to continue...");               // Prompt the user to press enter
        
        Scanner scanner = new Scanner(System.in);                               // Create a Scanner object to read input from the user
        String input = scanner.nextLine();                                      // Read a line of input from the user and store it in the 'input' variable
        
        while (!input.isEmpty())                                                // Enter a loop that will continue as long as the user enters non-empty input
        {
            System.out.println("Incorrect input. Please just press enter!");    // Print an error message indicating that the input was incorrect
            input = scanner.nextLine();                                         // Read another line of input from the user
        }

        printMessage();                                                         // Call the printMessage() method after the correct input is provided

    }
}
