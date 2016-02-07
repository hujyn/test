//ActionRequest.java
//Thorpe:Evan:A00399769:csc122801
//Submission 04
//Base Conversions, Part 4


import java.util.Scanner;

public class ActionRequest
{

static Scanner keyboard = new Scanner(System.in);

    /**
     * Prompts the user to enter a single character to choose whether to 
     * convert a binary, octal, hexadecimal or decimal value, or to quit 
     * the program.
     **/
    public void readRequest()
    {
        System.out.println("\nWhat kind of value would you like to "
                + "convert?");
        System.out.println("Here are the options:");
        System.out.println("b or B for binary");
        System.out.println("o or O for octal");
        System.out.println("h or H for hexadecimal");
        System.out.println("d or D for decimal");
        System.out.print("Enter your choice, or a q (or Q) to quit: ");
    }
     
    /**Returns a character entered by the user
     * If the value entered is not one of the valid single characters, 
     * an error is reported and the user is asked to try again. 
     * The user only has three tries to enter a correct value
     **/
    public char getRequest()
    {
        //Declare variables
        int remaining = 3;
        String input;

        while (true) 
        {

            input = keyboard.nextLine();


                //Check to see if the value entered was valid
                if(input.equalsIgnoreCase("b")) 
                {
                    return 'b';
                } 

                else if(input.equalsIgnoreCase("o")) 
                {
                    return 'o';
                } 

                else if(input.equalsIgnoreCase("h")) 
                {
                    return 'h';
                }

                else if(input.equalsIgnoreCase("d")) 
                {
                    return 'd';
                }

                else if(input.equalsIgnoreCase("q")) 
                {
                    return 'q';
                } 

                //Response when the value entered is not valid
                else 
                {
                    remaining--;

                    if(remaining == 2)
                    {
                        System.out.println("\nError: Invalid response. ");
                        System.out.println("Try again. (You have " + remaining
                                + " tries left.)");
                        System.out.print("Press Enter to continue ... ");
                        keyboard.nextLine();
                        readRequest();
                    }

                    else if (remaining == 1)
                    {
                        System.out.println("\nError: Invalid response. ");
                        System.out.println("Try again. (You have " + remaining
                                + " try left.)");
                        System.out.print("Press Enter to continue ... ");
                        keyboard.nextLine();
                        readRequest();
                    }

                    //Output when the user runs out of tries
                    //The program will automatically select the quit option
                    else
                    {
                        System.out.print("\nSorry, but you are out of tries."
                                +" \nThe quit option will be supplied.\n");
                        System.out.print("Press Enter to continue ... ");
                        keyboard.nextLine();

                        return 'q';
                    }
                }
        }
    }
}
