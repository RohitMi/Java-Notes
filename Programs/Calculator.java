/**
 * The following Calculator class contains the code for main function which displays a menu for the operations which can be done using this calculator program.
 * Following is the list of operations one can perform using this calculator:
 * Addition
 * Subtraction
 * Multiplication
 * Division
 * Division(Find Quotient)
 * Division(Find Remainder)
 * nth power of number
 * Square Root of a number
 * Factorial of a number
 * HCF of Numbers
 * LCM of Numbers
 * 
 * 
 */
import java.util.Scanner;
class Calculator                
{
    public static void main()
    {   
        int num1, num2;
        Scanner in = new Scanner(System.in);
        menu.calMenu();
        
        
        char ch = in.next().charAt(0);
        
        switch (ch)
        {
            case '+':
                System.out.println("Enter first number to add");
                num1 = in.nextInt();
                System.out.println("Enter second number to add");
                num2 = in.nextInt();
                System.out.println("The sum of " + num1 + " and " + num2 +" is " + MathFunc.add(num1,num2));
                break;
            case '-':
                System.out.println("Enter first number to subtract");
                num1 = in.nextInt();
                System.out.println("Enter second number to subtract");
                num2 = in.nextInt();
                System.out.println("The difference of " + num1 + " and " + num2 +" is " + MathFunc.sub(num1,num2));
                break;
            case '*':
                System.out.println("Enter first number to multiply");
                num1 = in.nextInt();
                System.out.println("Enter second number to multiply");
                num2 = in.nextInt();
                System.out.println("The product of " + num1 + " and " + num2 +" is " + MathFunc.mult(num1,num2));
                break;
            case '/':
                System.out.println("Enter the dividend");
                num1 = in.nextInt();
                System.out.println("Enter the divisor");
                num2 = in.nextInt();
                System.out.println("The quotient when" + num1 + " is divided by " + num2 +" is " + MathFunc.div(num1,num2));
                break;
            case '%':
                System.out.println("Enter the dividend");
                num1 = in.nextInt();
                System.out.println("Enter the divisor");
                num2 = in.nextInt();
                System.out.println("The remainder when" + num1 + " is divided by " + num2 +" is " + MathFunc.rem(num1,num2));
                break;
            case '^':
                System.out.println("Enter the number");
                num1 = in.nextInt();
                System.out.println("Enter the required integer power of the number");
                num2 = in.nextInt();
                System.out.println("The number " + num1 + " raised to power " + num2 +" gives " + MathFunc.power(num1,num2));
                break;
            case 'r':
                System.out.println("Enter the number to find its square root");
                num1 = in.nextInt();
                System.out.println("The square root of " + num1 + " is " + MathFunc.sqrt(num1));
                break;
            case 'f':
                System.out.println("Enter the number to find its factorial");
                num1 = in.nextInt();
                System.out.println("The factorial of " + num1 + " is " + MathFunc.fact(num1));
                break;
            case 'h':
                System.out.println("Enter first number");
                num1 = in.nextInt();
                System.out.println("Enter second number");
                num2 = in.nextInt();
                System.out.println("The HCF of " + num1 + " and " + num2 +" is " + MathFunc.hcf(num1,num2));
                break;
            case 'l':
                System.out.println("Enter first number");
                num1 = in.nextInt();
                System.out.println("Enter second number");
                num2 = in.nextInt();
                System.out.println("The LCM of " + num1 + " and " + num2 +" is " + MathFunc.lcm(num1,num2));
                break;
            default:
                System.out.println("Wrong Choice Entered");
        }
        in.close();
    }
}