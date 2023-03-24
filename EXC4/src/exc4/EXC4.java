package exc4;

public class EXC4 
{
     public static boolean isPrime(int number)
    {
        for(int i = 2 ; i<= Math.sqrt(number);i++)
        {
            if(number%i==0)
            {
                return false;
            }
        }
        return true;
    }
     
    public static int reverseNumber(int number)
    {
        char digits[] = (Integer.toString(number)).toCharArray();
        String reversedNumber = "";
        for(int i = digits.length-1 ; i>=0 ; i--)
        {
            reversedNumber += digits[i];
        }
        return Integer.parseInt(reversedNumber);
    }
    
    public static void main(String[] args) 
    {
        int counter = 0 ;
        for(int i = 2 ; counter<=120; i++)
        {
            if((isPrime(i) && isPrime(reverseNumber(i))) && i!=reverseNumber(i))
            {
                counter++;
                System.out.print(i+" ");
                if(counter%10==0)
                {
                    System.out.println();
                }
            }     
        }
    }
}
