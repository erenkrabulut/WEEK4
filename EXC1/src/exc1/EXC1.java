package exc1;

import java.util.Scanner;

public class EXC1 
{
    public static boolean isValid(long number)
    {
        if(getSize(number)!=16)
        {
            return false;
        }
        else if((sumOfDoubleEvenPlace(number)+sumOfOddPlace(number))%10!=0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public static int sumOfDoubleEvenPlace(long number)
    {
        int sumEven = 0;
        for(long i = 10 ; i<=number ; i*=100)
        {
            sumEven += getDigit((int)((number/i)%10));
        }
        return sumEven;
    }
    public static int sumOfOddPlace(long number)
    {
         int sumOdd = 0;
        for(long i = 1 ; i<=number ; i*=100)
        {
            sumOdd += (number/i)%10;
        }
        return sumOdd;
    }
    public static int getDigit(int digit)
    {
        digit *=2;
        if(digit<10)
        {
            return digit;
        }
        else
        {
            return (digit/10)%10 +  (digit%10);
        }
    }
    public static int getSize(long d)
    {
      String numberString =  Long.toString(d);
      return numberString.length();
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a credit card number as a long integer : ");
        long number = input.nextLong();
        boolean isCreditCardValid = isValid(number);
        System.out.printf("%d is %s \n",number , (isCreditCardValid ? "valid." : "not valid."));
    }
}
