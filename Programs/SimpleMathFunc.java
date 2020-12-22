/**
 * This code has methods for the following Mathematics calculations:
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
import java.util.*;
class SimpleMathFunc
{
    int addition(int a, int b)
    {
        int sum = a + b;
        //System.out.println("Sum of the given number =" + sum);
        return sum;
    }
    
    double addition(double a, double b)
    {
        double sum = a + b;
        //System.out.println("Sum of the given number =" + sum);
        return sum;
    }
    
    int subtract(int a, int b)
    {
        int dif = a - b;
        return dif;
    }
    
    double subtract(double a, double b)
    {
        double dif = 0;
        if(a>b){
        dif = a - b;
    }
    else
        dif = b - a;
        return dif;
    }
    
    int multiply(int a, int b)
    {
        int prod = a * b;
        return prod;
    }
    
    double multiply(double a, double b)
    {
        double prod = a * b;
        return prod;
    }
    
    double division(double a, double b)
    {
        double quot = a / b;
        return quot;
    }
    
    int Remainder(int a, int b)
    {
        int rem = a % b;
        return rem;
    }
    
    double Power(double num, int p)
    {
        double power = 1;
        for(int i=1; i<=p; i++)
        {
            power = power * num;
        }
        //System.out.println(power);
        return power;
    }
    
    double SquareRoot(int number)
    {
    double temp;
    double sqrt = number / 2;
    do {
        temp = sqrt;
        sqrt = (temp + (number / temp)) / 2;
    } while ((temp - sqrt) != 0);
    return sqrt;
    }
    
    int factorial(int num)
    {
        int fact = 1;
        if (num == 0)
        {
            fact = 1;
        }
        else
        {
            while(num > 0)
            {
                fact = fact * num;
                num--;
            }
        }
        return fact;
    }
    
    int HCF(int num1,int num2)
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
    
    int LCM(int num1, int num2)
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
    
    void main()
    {
        double num1 = 3.5;
        int num2 = 6;
        
        System.out.println(subtract(num1,num2));
        
        
        
    }
}