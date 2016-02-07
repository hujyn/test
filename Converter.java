//Converter.java
//Thorpe:Evan:A00399769:csc122801
//Submission 04
//Base Conversions, Part 4


import java.util.Scanner;


public class Converter
{

    static Scanner keyboard = new Scanner(System.in);
    private String testValue;
    private String binaryValue;
    private String octalValue;
    private String hexValue;
    private String decimalValue;
    private String convertValue;
    private int decimal;
    

    public void convertValue(BaseType base)
    {
        if(base == BaseType.BINARY)
        {
            binaryValue = convertValue;
            decimal = Integer.parseInt(convertValue, 2);
            octalValue = Integer.toOctalString(decimal);
            hexValue = Integer.toHexString(decimal);
        }

        if(base == BaseType.OCTAL)
        {
            octalValue = convertValue;
            decimal = Integer.parseInt(convertValue, 8);
            binaryValue = Integer.toBinaryString(decimal);
            hexValue = Integer.toHexString(decimal);
        }

        if(base == BaseType.HEX)
        {
            hexValue = convertValue;
            decimal = Integer.parseInt(convertValue, 16);
            octalValue = Integer.toOctalString(decimal);
            hexValue = Integer.toHexString(decimal);
        }

        if(base == BaseType.DECIMAL)
        {
            decimal = Integer.parseInt(convertValue);
            binaryValue = Integer.toBinaryString(decimal);
            octalValue = Integer.toOctalString(decimal);
            hexValue = Integer.toHexString(decimal);
        }


    }

    public void displayAllValues(BaseType base)
    {
        if(base == BaseType.BINARY)
        {
            System.out.println("Here is the" + base + "input value in all "
                    + "four bases");
            System.out.println("binary  = " + binaryValue);
            System.out.println("octal   = " + octalValue);
            System.out.println("hex     = " + hexValue);
            System.out.println("decimal = " + decimal);

            System.out.print("Press Enter to continue ... ");
            keyboard.nextLine();
        }

        if(base == BaseType.OCTAL)
        {
            System.out.println("Here is the" + base + "input value in all "
                    + "four bases");
            System.out.println("binary  = " + binaryValue);
            System.out.println("octal   = " + octalValue);
            System.out.println("hex     = " + hexValue);
            System.out.println("decimal = " + decimal);

            System.out.print("Press Enter to continue ... ");
            keyboard.nextLine();
        }

        if(base == BaseType.HEX)
        {
            System.out.println("Here is the" + base + "input value in all "
                    + "four bases");
            System.out.println("binary  = " + binaryValue);
            System.out.println("octal   = " + octalValue);
            System.out.println("hex     = " + hexValue);
            System.out.println("decimal = " + decimal);

            System.out.print("Press Enter to continue ... ");
            keyboard.nextLine();
        }

        if(base == BaseType.DECIMAL)
        {
            System.out.println("Here is the" + base + "input value in all "
                    + "four bases");
            System.out.println("binary  = " + binaryValue);
            System.out.println("octal   = " + octalValue);
            System.out.println("hex     = " + hexValue);
            System.out.println("decimal = " + decimal);

            System.out.print("Press Enter to continue ... ");
            keyboard.nextLine();
        }

    }





    public void readValue(BaseType base)
    {
        
        if(base == BaseType.BINARY)
        {
            while (true) 
            {
            //Collect the inputted value from the user
            System.out.print("\nEnter a binary value containing up to 16 "
                    + "digits: ");
            binaryValue = keyboard.nextLine();

            //Check to see if the value entered is within the parameters
            int correctValue = 0;
            
                for(int testPoint = 0; testPoint < binaryValue.length(); 
                        testPoint++)
                {
                    int tester = (int) binaryValue.charAt(testPoint);

                    if(tester == 48 || tester == 49)
                    {
                        correctValue++;
                    }
                }

                if(correctValue == binaryValue.length() && 
                   binaryValue.length() > 0 && binaryValue.length() <= 16)
                {

                    if(Integer.parseInt(binaryValue, 2) <= 65535
                       && Integer.parseInt(binaryValue, 2) >= 0) 
                        binaryValue = convertValue;
                }

                //Output if the value entered is not within the parameters
                else
                {
                    System.out.println("\nError: Binary value invalid or "
                            + "out of range.");
                    System.out.println("Try again.");

                    System.out.print("Press Enter to continue ... ");
                    keyboard.nextLine();
                }
            }
        }

        if(base == BaseType.OCTAL)
        {
            while (true) 
            {
                //Collect the inputted value from the user
                System.out.print("\nEnter an octal value containing up to 6 "
                        + "digits: ");
                octalValue = keyboard.nextLine();

                //Check to see if the value entered is within the parameters
                int correctValue = 0;

                for(int testPoint = 0; testPoint < octalValue.length();
                    testPoint++)
                {
                    int tester = (int) octalValue.charAt(testPoint);

                    if(tester >= 48 && tester <= 55)
                    {
                        correctValue++;
                    }
                }

                //Fix for when the digits are exactly 6
                if(correctValue == octalValue.length() && 
                    octalValue.length() > 0 && octalValue.length() <= 6 && 
                    (octalValue.charAt(0) == 48 || octalValue.charAt(0) == 49)
                    )
                {

                    if (Integer.parseInt(octalValue, 8) <= 65535 && 
                        Integer.parseInt(octalValue, 8) >= 0) 
                        octalValue = convertValue;
                }

                //Output if the value entered is not within the parameters
                else
                {
                System.out.println("\nError: Octal value invalid or "
                        + "out of range.");
                System.out.println("Try again.");

                System.out.print("Press Enter to continue ... ");
                keyboard.nextLine();

                }
            }
        }

        if(base == BaseType.HEX)
        {
            while (true) 
            {

            //Collect the inputted value from the user
            System.out.print("\nEnter a hexadecimal value containing up to 4 "
                    + "digits: ");
            hexValue = keyboard.nextLine();

            //Check to see if the value entered is within the parameters
            int correctValue = 0;

                for(int testPoint = 0; testPoint < hexValue.length(); 
                        testPoint++)
                {
                    int tester = (int) hexValue.charAt(testPoint);

                    if((tester >= 48 || tester <= 57) || (tester >= 97 &&
                       tester <= 102) || (tester >= 65 && tester <= 70))
                    {
                        correctValue++;
                    }
                }

                if(correctValue == hexValue.length() &&
                   hexValue.length() > 0 && hexValue.length() <= 4)
                {

                    if (Integer.parseInt(hexValue, 16) <= 65535 && 
                        Integer.parseInt(hexValue, 16) >= 0)
                        hexValue = convertValue;                    
                }
                
                //Output if the value entered in not within the parameters
                else 
                {
                System.out.println("\nError: Hexadecimal value invalid or "
                        + "out of range.");
                System.out.println("Try again.");

                System.out.print("Press Enter to continue ... ");
                keyboard.nextLine();

                }
            }
        }

        if(base == BaseType.DECIMAL)
        {
            while(true)
            {

                //Collect the inputted value from the user
                System.out.print("\nEnter a decimal integer in the range "
                        + "0..65535: ");
                this.testValue = keyboard.nextLine();

                //Check to see if the value entered is within the parameters
                int correctValue = 0;

                for(int testPoint = 0; testPoint < this.testValue.length();
                        testPoint++)
                {
                       
                    int tester = (int) this.testValue.charAt(testPoint);

                    if(tester >= 48 || tester <= 57)
                
                        correctValue++;
                
                }

                if(correctValue == this.testValue.length() && 
                   this.testValue.length() > 0 && this.testValue.length() <= 5)
                {
                
                    int num = Integer.parseInt(this.testValue);

                    if (num >= 0 && num <= 65535)
                       this.testValue = this.convertValue; 
                    else
                        System.out.println("\nError: Invalid decimal value "
                            + "out of range.");
                        System.out.println("Try again.");
                        
                         System.out.println("ONE");

                        System.out.print("Press Enter to continue ... ");
                        keyboard.nextLine();
                }
            
                //Output if the value entered in not within the parameters
                else 
                {
                System.out.println("\nError: Invalid decimal value "
                        + "out of range.");
                System.out.println("Try again.");

                System.out.println("TWO");

                System.out.print("Press Enter to continue ... ");
                keyboard.nextLine();

                }
            }
        }


    }


}
