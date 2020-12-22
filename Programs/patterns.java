class patterns
{
    void RightTriangle(int lt) //Using for
    {
        int i, j;  
        for(i=1; i<=lt; i++) //outer loop for number of rows(n) 
        { 
            for(j=1; j<=i; j++) //  inner loop for columns
            {       
                System.out.print("* "); // print star
            }           
            System.out.println(); // ending line after each row
        }
    }
    
    void rightTriangle(int lim) //Using while
    {
        int i=1;
        while(i<=lim) //outer loop for number of rows(n) 
        { 
            int j = 1;
            while(j<=i) //  inner loop for columns
            {       
                System.out.print("* "); // print star'
                j++;
            }           
            System.out.println(); // ending line after each row
            i++;
        }
    }
    
    void Pyramid(int n) //Using While
    {
        int i=1;
        while(i<=n) //outer loop for number of rows(n) 
        {
            int k = n-i;
            while(k>0)
            {
                System.out.print(" ");
                k--;
            }
            int j = 1;
            while(j<=i) //  inner loop for columns
            {       
                System.out.print("* "); // print star'
                j++;
            }           
            System.out.println(); // ending line after each row
            i++;
        }
    }
    
    void LeftTriangle(int n)
    {
        int i=1;
        while(i<=n) //outer loop for number of rows(n) 
        {
            int k = 2*(n-i);
            while(k>0)
            {
                System.out.print(" ");
                --k;
            }
            int j = 1;
            while(j<=i) //  inner loop for columns
            {       
                System.out.print("* "); // print star'
                j++;
            }           
            System.out.println(); // ending line after each row
            i++;
        } 
    }
    
    void DownwardRTriangle(int lim) //Using While
    {
        int i=lim;
        while(i>0) //outer loop for number of rows(n) 
        { 
            int j = 1;
            while(j<=i) //  inner loop for columns
            {       
                System.out.print("* "); // print star'
                j++;
            }           
            System.out.println(); // ending line after each row
            i--;
        }
    }
    
    void DownwardLTriangle(int lim)
    {
        System.out.println("*");
    }
}