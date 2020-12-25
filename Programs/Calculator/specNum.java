/**
 * The following specNum class contains the method/function code for doing operations to find special types of numbers.
 * Following is the list of operations that can be performed:
 * Check for Even/Odd Number
 * Check for Postive/Negative/Zero Number
 * Check for Prime/Composite Number
 * Check for Armstrong Number
 * Check for Palindrome Number
 * Print Armstrong Number in a range
 * 
 * 
 */

class specNum
{      
    void chkEvn(int num)            //Checks whether a number is Even or Odd.
    {
        if(num % 2 == 0)
            System.out.println("The number " +num+ " is an Even number");
        else
            System.out.println("The number " +num+ " is an Odd number");
    }
 
    void chkPos(int num)            //Checks if the given number is Positive, Negative or Zero.
    {
        if(num == 0)
            System.out.println("The number " +num+ " is Zero");
        else if(num > 0)
            System.out.println("The number " +num+ " is a Positive number");
        else
            System.out.println("The number " +num+ " is a Negative number");
    }

    void chkPrm(int num)        //Checks if the given number is Prime number or not.
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
    
    void chkArmstrong(int num)          //Checks if the given number is Armstrong number or not.
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
    
    void chkPalindrome(int num)         //Checks if the given number is a Palindrome or not.
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
    
    void ArmstrongPrint(int s, int e)       //Prints all the Armstrong number between the given range.
    {
        for(int i = s; i<=e; i++)
        {
            chkArmstrong(i);
        }
    }
}