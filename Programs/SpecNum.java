import java.util.*;
class SpecNum
{      
    void EvenCheck(int num)
    {
        if(num % 2 == 0)
            System.out.println("The number " +num+ " is an Even number");
        else
            System.out.println("The number " +num+ " is an Odd number");
    }
 
    void PosNegCheck(int num)
    {
        if(num == 0)
            System.out.println("The number " +num+ " is Zero");
        else if(num > 0)
            System.out.println("The number " +num+ " is a Positive number");
        else
            System.out.println("The number " +num+ " is a Negative number");
    }

    void PrimeCheck(int num)
    {
        boolean isPrime = true;
        for(int i = 2; i < num/2; i++)
        {
            if(num%i == 0)
                isPrime = false;
        }
        if(isPrime)
            System.out.println("The number " +num+ " is a Prime Number");
        else
            System.out.println("The number " +num+ " is not a Prime Number");
    }
    
    void ArmstrongCheck(int num)
    {
        int ld, chknum = 0;
        int cop = num;
        while(num>0)
        {
            ld = num % 10;
            chknum = chknum + (ld * ld * ld);
            num = num / 10;
        }
        if(cop == chknum)
            System.out.println("The number " +cop+ " is Armstrong");
        else
            System.out.println("The number " +cop+ " is not Armstrong");
    }
    
    void PalindromeCheck(int num)
    {
        int ld, chknum = 1;
        int cop = num;
        while(num>0)
        {
            ld = num % 10;
            chknum = chknum * 10 + ld;
            num = num / 10;
        }
        if(cop == chknum)
            System.out.println("The number " +cop+ " is Palindrome");
        else
            System.out.println("The number " +cop+ " is not Palindrome");
    }
    
    void ArmstrongPrint(int s, int e)
    {
        for(int i = s; i<=e; i++)
        {
            ArmstrongCheck(i);
        }
    }
}