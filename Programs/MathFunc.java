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
class MathFunc
{
    int add(int a, int b)      //function for addition of integer numbers
    {
        int sum = a + b;
        return sum;
    }
    
    double add(double a, double b)    //function for addition of floating point numbers
    {
        double sum = a + b;
        return sum;
    }
    
    int sub(int a, int b)       //function for subtraction of integer numbers
    {
        int dif = 0;
        if(a>b)
            dif = a - b;
        else
            dif = b - a;
        return dif;
    }
    
    double sub(double a, double b)   //function for subtraction of floating point numbers
    {
        double dif = 0;
        if(a>b)
            dif = a - b;
        else
            dif = b - a;
        return dif;
    }
    
    int multiply(int a, int b)      //function for multiplication of integer number
    {
        int prod = a * b;
        return prod;
    }
    
    double multiply(double a, double b)         //function for multiplication of floating point numbers
    {
        double prod = a * b;
        return prod;
    }
    
    double division(double a, double b)         //function for division of numbers(gives qoutient)
    {
        double quot = a / b;
        return quot;
    }
    
    int Remainder(int a, int b)         //function for division of numbers(gives remainder)
    {
        int rem = a % b;
        return rem;
    }
    
    double Power(double num, int p)     //function to calculate powers of numbers
    {
        double power = 1;
        for(int i=1; i<=p; i++)
        {
            power = power * num;
        }
        return power;
    }
    
    double SquareRoot(int number)       //function to calculate square root of a number
    {
    double temp;
    double sqrt = number / 2;
    do {
        temp = sqrt;
        sqrt = (temp + (number / temp)) / 2;
    } while ((temp - sqrt) != 0);
    return sqrt;
    }
    
    int factorial(int num)          //function to calculate the factorial of number
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
    
    int HCF(int num1,int num2)      //function to calculate HCF of numbers
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
    
    int LCM(int num1, int num2)     //function to calculate LCM of number
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