/**
 * The following MathFunc class contains method/function code for math operations.
 * Following is the list of operations that can be performed:
 * Addition
 * Subtraction
 * Multiplication
 * Division
 * To find the Remainder of a division
 * To find nth(Integer) power of a number
 * Square root
 * To Calculate Factorial of number
 * HCF
 * LCM
 * 
 */

class MathFunc
{
    
    public static int add(int num1, int num2)      //function for addition of integer numbers
    {
        int sum = num1 + num2;
        return sum;
    }
    
    public static double add(double num1, double num2)    //function for addition of floating point numbers
    {
        double sum = num1 + num2;
        return sum;
    }
    
    public static int sub(int num1, int num2)       //function for subtraction of integer numbers
    {
        int dif = 0;
        if(num1 > num2)
            dif = num1 - num2;
        else
            dif = num2 - num1;
        return dif;
    }
    
    public static double sub(double num1, double num2)   //function for subtraction of floating point numbers
    {
        double dif = 0;
        if(num1 > num2)
            dif = num1 - num2;
        else
            dif = num2 - num1;
        return dif;
    }
    
    public static int mult(int num1, int num2)      //function for multiplication of integer number
    {
        int prod = num1 * num2;
        return prod;
    }
    
    public static double mult(double num1, double num2)         //function for multiplication of floating point numbers
    {
        double prod = num1 * num2;
        return prod;
    }
    
    public static double div(double num1, double num2)         //function for division of numbers(gives qoutient)
    {
        double quot = num1 / num2;
        return quot;
    }
    
    public static int rem(int num1, int num2)         //function for division of numbers(gives remainder)
    {
        int rem = num1 % num2;
        return rem;
    }
    
    public static double power(double num, int p)     //function to calculate powers of numbers
    {
        double power = 1;
        for(int i=1; i<=p; i++)
        {
            power = power * num;
        }
        return power;
    }
    
    public static double sqrt(int number)       //function to calculate square root of a number
    {
    double temp;
    double sqrt = number / 2;
    do {
        temp = sqrt;
        sqrt = (temp + (number / temp)) / 2;
    } while ((temp - sqrt) != 0);
    return sqrt;
    }
    
    public static int fact(int num)          //function to calculate the factorial of number
    {
        if (num !=0)
            return num * fact(num - 1);
        else
            return 1;
    }
    
    public static int hcf(int num1,int num2)      //function to calculate HCF of numbers
    {
       int temp;
       while(num2 > 0)
       {
           temp = num2;
           num2 = num1 % num2;
           num1 = temp;
       }
       return num1; 
    }
    
    public static int lcm(int num1, int num2)     //function to calculate LCM of number
    {
        int temp,i=2,res;
        if(num1>num2)
            res=num1;
        else
            res=num2;
        temp=res;
        while(res%num1!=0 || res%num2!=0)
        {
            res=temp*i;
            i++;
        }
        return res;
    }
}