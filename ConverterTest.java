//ConverterTest.java
//Thorpe:Evan:A00399769:csc122801
//Submission 04
//Base Conversions, Part 4

import java.util.Scanner;

public class ConverterTest
{

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args)
    {
        char request;
        
        OpeningScreen openingScreen = new OpeningScreen();
        openingScreen.display();

        ProgramDescription programDescription = new ProgramDescription();
        programDescription.display();

        do
        {
            ActionRequest actionRequest = new ActionRequest();
            actionRequest.readRequest();
            request = actionRequest.getRequest();
            Converter converter = new Converter();

            if(request == 'b')
            {
                converter.readValue(BaseType.BINARY);
                converter.convertValue(BaseType.BINARY);
                converter.displayAllValues(BaseType.BINARY);
            }


            else if(request == 'o')
            {
                converter.readValue(BaseType.OCTAL);
                converter.convertValue(BaseType.OCTAL);
                converter.displayAllValues(BaseType.OCTAL);
            }


            else if(request == 'h')
            {
                converter.readValue(BaseType.HEX);
                converter.convertValue(BaseType.HEX);
                converter.displayAllValues(BaseType.HEX);
            }

            else if(request == 'd')
            {
                converter.readValue(BaseType.DECIMAL);
                converter.convertValue(BaseType.DECIMAL);
                converter.displayAllValues(BaseType.DECIMAL);
            }


        }while(request != 'q');

        System.out.println("\nQuit option chosen.");
        System.out.println("Program now terminating.");
        System.out.print("Press enter to continue ... ");
        keyboard.nextLine();
    }
}
