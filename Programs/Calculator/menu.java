/**
 * The following class menu contains code for the Menu Display.
 * calMenu() function contains a print statements that displays the menu for choosing the required operation to perform.
 */
class menu
{
    public static void menuMain()
    {
        System.out.print("Hi! Welcome to Java. I am a Calculator. I can perform basic math operations," 
        +" operations on shapes and check for the type of numbers. Select the operations you want to perform.\n"
        + "Enter 1 for Math Operations\n" + "Enter 2 for Operations on Shapes\n" + "Enter 3 for checking for types of numbers\n");
        System.out.println("Enter your Choice:");
    }
    
    public static void menuMath()
    {
        System.out.print("Enter your choice according to the menu given below:\n" + "Enter '+' for addition\n" 
        + "Enter '-' for subtraction\n" + "Enter '*' for multiplication\n" + "Enter '/' for divison\n" 
        + "Enter '/' for divison\n" + "Enter '%' for remainder\n" + "Enter '^' for power of a number\n" 
        + "Enter 'r' for square root of a number\n" + "Enter 'f' for factorial of a number\n"
        + "Enter 'h' for HCF of numbers\n" + "Enter 'l' for LCM of numbers\n");
        System.out.println("Enter your choice:");
    }
    
    public static void menuShapes()
    {
        System.out.print("Enter your choice according to the menu given below:\n" + "Enter 1 for operations on Triangle\n" 
        + "Enter 2 for operations on Square\n" + "Enter 3 for operations on Rectangle\n" + "Enter 4 for operations on Parallelogram\n" 
        + "Enter 5 for operations on Rhombus\n" + "Enter 6 for operations on Trapezium\n" + "Enter 7 for operations on Circle\n" 
        + "Enter 8 for operations on Cylinder\n" + "Enter 9 for operations on Cone\n"
        + "Enter 10 for operations on Sphere\n" + "Enter 11 for operations on Prism\n");
        System.out.println("Enter your choice:");
    }
    
    public static void menuSpcNum()
    {
        System.out.print("Enter your choice according to the menu given below:\n" + "Enter 1 for Checking for Even/Odd Numbers\n"
        + "Enter 2 for Checking for Positive/Negative Numbers\n" + "Enter 3 for Checking for Prime Numbers\n"
        + "Enter 4 for Checking for Armstrong Numbers\n" + "Enter 5 for Checking for Palindrome Numbers\n"
        + "Enter 6 to Print Armstrong Numbers\n");
        System.out.println("Enter your choice:");
    }
}