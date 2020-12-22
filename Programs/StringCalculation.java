import java.util.Scanner;
class StringCalculation
{
       
    int StringLength(String sen)
    {
        int len = sen.length();
        return len;
    }
    
    boolean vowelChck(char ch)
    {
        boolean isVowel = false;
        switch(ch)
	{
	   case 'a' :
	   case 'e' :
    	   case 'i' :
	   case 'o' :
	   case 'u' :
	   case 'A' :
	   case 'E' :
	   case 'I' :
	   case 'O' :
	   case 'U' : isVowel = true;
	}
	return isVowel;
    }
    
    int VowelCount(String sen)
    {
        int countv=0;
        for (int i = 0; i < sen.length(); i++)
        {
            char ch = sen.charAt(i);
            if(vowelChck(ch) == true)
                countv++;
        }
        return countv;
    }
    
    int ConsonantCount(String sen)
    {
        int countc=0,countsp=0;
        for (int i = 0; i < sen.length(); i++)
        {
            char ch = sen.charAt(i);
            if(vowelChck(ch) == false)
                countc++;
            if(sen.charAt(i) == ' ')
                countsp++;
        }
        return countc - countsp;
    }
    
    int WordCount(String sen)
    {
        int countsp=0;
        for (int i = 0; i < sen.length(); i++)
        {
            if(sen.charAt(i) == ' ')
                countsp++;
        }
        return countsp+=1;
    }
    
    String StringSubstring(String sen, int s, int e)
    {
        String newstring = sen.substring(s,e);
        return newstring;
    }
    
    String StringReplace(String sen, String rep, String rem)
    {
        String newstring = sen.replace(rem,rep);
        return newstring;
    }
    
    void StringReverse(String sen)
    {
        String rev = "";
        for(int i = sen.length(); i>0; i--)
        {
            rev = rev + sen.charAt(i-1);
        }
        System.out.println("The entered String is " + sen);
        System.out.println("Reverse of the entered String is " + rev);
    }
    
    boolean specialChar(char ch)
    {
        boolean isSpecial = false;
        switch(ch)
	{
	   case ' ' :
	   case '!' :
    	   case '@' :
	   case '#' :
	   case '$' :
	   case '%' :
	   case '^' :
	   case '&' :
	   case '*' :
	   case '(' : isSpecial = true;
	}
        return isSpecial;
    }
    
    void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String");
        String sen = in.nextLine();
        System.out.println("Number of vowels in the given String are = " + VowelCount(sen));
    }
}