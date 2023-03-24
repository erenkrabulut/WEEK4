package exc2;

public class EXC2 
{
    public static int rollTour()
    {
        int dice1 = 1+(int)(Math.random()*6);
        int dice2 = 1+(int)(Math.random()*6);
        System.out.printf("You rolled %d + %d = %d\n",dice1,dice2, dice1+dice2);
        return dice1+dice2;
    }
    public static void playGame()
    {
        int tour = rollTour();
        if(tour==7 || tour ==11)
        {
            System.out.println("You win!");
        }
        else if(tour==2 || tour ==3 || tour == 12)
        {
            System.out.println("You lose!");
        }
        else
        {
            int newTour = tour;
            do
            {
                System.out.println("point is "+newTour);
                newTour = rollTour();        
            }while(newTour!=tour && newTour !=7);
            if(newTour==7)
            {
                System.out.println("You lose!");
            }
            else
            {
                System.out.println("You win!");
            }
        }
    }
    public static void main(String[] args) 
    {
            playGame();
    }
    
    
}
