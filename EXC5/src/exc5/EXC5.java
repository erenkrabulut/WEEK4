package exc5;

import java.util.Scanner;

public class EXC5 
{
    public static int count(String str, char ch)
    {
        int counter = 0;
        char array[] = str.toCharArray();
        for(int i = 0 ; i<array.length ; i++)
        {
            if(array[i] == ch) 
            {
                counter++;
            }
        }
        return counter++;
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = input.next();
        System.out.print("Enter the character : ");
        char ch = input.next().charAt(0);
        System.out.printf("The occurence of '%c' in \"%s\" is %d.\n",ch, str , count(str,ch));
    }
}
