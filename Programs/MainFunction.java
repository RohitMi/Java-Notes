import java.util.Scanner;
class MainFunction
{
    void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your choice according to the menu given below");
        System.out.println("1. Enter '+' for addition");
        System.out.println("2. Enter '-' for subtraction");
        System.out.println("3. Enter '*' for multiplication");
        System.out.println("4. Enter '/' for divison");
        System.out.println("5. Enter '%' for remainder");
        System.out.println("6. Enter '^' for power of a number");
        System.out.println("7. Enter 'm' for mean of numbers");
        System.out.println("Enter your choice:");

        char ch = in.next().charAt(0);
        
        switch (ch)
        {
            case '+':
                System.out.println("Enter first number to add");
                double num1 = in.nextInt();
                System.out.println("Enter second number to add");
                double num2 = in.nextInt();
                //add(num1,num2);
                break;
            case '-':
                System.out.println("Enter number to subtract from");
                double num3 = in.nextInt();
                System.out.println("Enter number which is to be subtracted");
                double num4 = in.nextInt();
                break;
            case '*':
                System.out.println("Enter first number to multiply");
                double num5 = in.nextInt();
                System.out.println("Enter second number to multiply");
                double num6 = in.nextInt();
                break;
            case '/':
                System.out.println("Enter the dividend");
                double num7 = in.nextInt();
                System.out.println("Enter the divisor");
                double num8 = in.nextInt();
                break;
            case '%':
                System.out.println("Enter the dividend");
                double num9 = in.nextInt();
                System.out.println("Enter the divisor");
                double num10 = in.nextInt();
                break;
            case '^':
                System.out.println("Enter the number");
                double num11 = in.nextInt();
                System.out.println("Enter the required integer power of the number");
                double num12 = in.nextInt();
                break;
            case 'm':
                System.out.println("Enter the numbers whose mean has to calculated");
                double num13 = in.nextInt();
                System.out.println("Enter the divisor");
                double num14 = in.nextInt();
                break;
            default:
                System.out.println("Wrong Choice Entered");
        }
        in.close();
    }
}