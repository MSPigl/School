import java.util.Scanner;
/**
 * @name Joe Dorrian, Matt Pigliavento
 * @version/date April 6, 2016
 */

public class Loops
{
    public static void loop1(int n) 
    {
        for (int i = 1; i <= n; i++)
        {
            System.out.print(i + " ");
        }
    }

    public static void loop2(int n) 
    {
        for (int i = 1; i <= n-1; i++)
        {
            System.out.print(i + ", ");
        }
        for (int i = n; i <= n; i++)
        {
            System.out.print(i + ".");
        }
    }

    public static void loop3(int n) 
    {
        for (int i = n; i >= 1; i--)
        {
            System.out.print(i + " ");
        }
    }

    public static void loop4(int n) 
    {
        for (int i = n-4; i <= n; i += 2)
        {
            System.out.print(i + " ");
        }
        for (int i = n+2; i <= n+4; i += 2)
        {
            System.out.print(i + " ");
        }
    }    

    public static void loop5(int n) 
    {
        for (int i = 1; i <= n-4; i++)
        {
            System.out.print(i + " ");
        }
        for (int i = 2; i < n+26; i*=2)
        {
            System.out.print((i*2) + " ");
        }
    }

    public static void loop6(int n) 
    {
        int old = 1;
        int current = 1;
        for (int i = 1; i < n; i++)
        {
            if (i == 1)
            {
                System.out.print(i + " ");
                old = 1;
            }
            System.out.print(old + current + " ");
            int temp = current;
            current = old + current;
            old = temp;
        }
    }        

    public static void loop7(int n) 
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j <=n-1; j++)
            {
                System.out.print("X");
            }
            System.out.println();
        }
    }     

    public static void loop8(int n) 
    {
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j<=n; j++)
            {
                System.out.print(i + "*" + j + "=" + i*j + "\t");
            }
            System.out.println();
        }
    }      

    public static void loop9(int n) 
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = n; j > i; j--)
            {
                System.out.print("X");
            }
            System.out.println();
        }
    }    

    public static void loop10(int n) 
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < i+1; j++)
            {
                System.out.print("X");
            }
            System.out.println();
        }
    }       

    public static void loop11(int n) 
    {
        for (int i = 0; i <= n; i++)
        {
            for (int j = 0; j <=n-1; j++)
            {
                if (j < n-i)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }

    public static void loop12(int n) 
    {
        for (int i = 0; i <= n-1; i++)
        {
            for (int j = n; j > 0; j--)
            {
                if (j <= n-i)
                {
                    System.out.print("X");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void loop13(int n) 
    {
        for (int i = 0; i < n+2; i++)
        {
            for (int j = 0; j <=n-1; j++)
            {
                if (i == 0 || i == n+1)
                {
                    System.out.print("*");
                }
                else if (j == 0 || j == n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void loop14(int n) 
    {
        int pos = n;
        for (int i = n; i >= 1; i--)
        {
            for (int j = 1; j <= n*2; j++)
            {
                if (j <= n)
                {
                    if (j == i)
                    {
                        System.out.print("/");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                if (j >= n && j <= n*2)
                {
                    if (j == pos)
                    {
                        System.out.print("\\");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                } 
            }
            System.out.println();
            pos++;
        }
    }    

    public static void loop15(int n) 
    {
        int pos = n;
        for (int i = n*2; i >= 1; i--)
        {
            if (i >= 1 && i <= n)
            {
                for (int j = 1; j <= n*2; j++)
                {
                    if (j <= n)
                    {
                        if (j == i)
                        {
                            System.out.print("/");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    if (j >= n && j <= n*2)
                    {
                        if (j == pos)
                        {
                            System.out.print("\\");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    } 
                }
                System.out.println();
                pos++;
            }
        }
        int pos1 = n*2-1;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j <= n-1; j++)
            {
                if (j <= n)
                {
                    if (j == i)
                    {
                        System.out.print("\\");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            for (int j = 0; j <= n*2; j++)
            {
                if (j >= n)
                {
                    if (j == pos1)
                    {
                        System.out.print("/");
                    }
                    else
                    {
                        System.out.print(" ");
                    }	
                }
            }
            System.out.println();
            pos1--;
        }
    }     

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value for n: ");
        int n = in.nextInt();

        System.out.println("\n\nLoop 1:");
        loop1(n);

        System.out.println("\n\nLoop 2:");
        loop2(n);

        System.out.println("\n\nLoop 3:");
        loop3(n);        

        System.out.println("\n\nLoop 4:");
        loop4(n);

        System.out.println("\n\nLoop 5:");
        loop5(n);        

        System.out.println("\n\nLoop 6:");
        loop6(n);        

        System.out.println("\n\nLoop 7:");
        loop7(n);        

        System.out.println("\n\nLoop 8:");
        loop8(n);        

        System.out.println("\n\nLoop 9:");
        loop9(n);        

        System.out.println("\n\nLoop 10:");
        loop10(n);        

        System.out.println("\n\nLoop 11:");
        loop11(n);        

        System.out.println("\n\nLoop 12:");
        loop12(n);        

        System.out.println("\n\nLoop 13:");
        loop13(n);        

        System.out.println("\n\nLoop 14:");
        loop14(n);        

        System.out.println("\n\nLoop 15:");
        loop15(n);           
    }
}
