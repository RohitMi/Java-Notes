import java.util.Scanner;
class Calculator
{
    public static void main()
    {   
        int num1, num2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your choice according to the menu given below");
        System.out.println("1. Enter '+' for addition");
        System.out.println("2. Enter '-' for subtraction");
        System.out.println("3. Enter '*' for multiplication");
        System.out.println("4. Enter '/' for divison");
        System.out.println("5. Enter '%' for remainder");
        System.out.println("6. Enter '^' for power of a number");
        System.out.println("7. Enter 'r' for square root of a number");
        System.out.println("8. Enter 'f' for factorial of a number");
        System.out.println("Enter your choice:");
        
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
                System.out.println("Enter number to subtract from");
                num1 = in.nextInt();
                System.out.println("Enter number which is to be subtracted");
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
                System.out.println("The square root of " + num1 + " is " + MathFunc.fact(num1));
                break;
            default:
                System.out.println("Wrong Choice Entered");
        }
        in.close();
    }
}