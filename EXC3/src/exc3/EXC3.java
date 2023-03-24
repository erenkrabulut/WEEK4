package exc3;

public class EXC3 
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
    public static void main(String[] args) 
    {
        for(int i = 2; i<=1198 ; i++)
        {
            if(isPrime(i)&& isPrime(i+2))
            {
                System.out.printf("(%d , %d)\n",i,i+2);
            }
        }

    }
}
