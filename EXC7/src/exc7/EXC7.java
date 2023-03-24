package exc7;

import java.util.Scanner;

public class EXC7 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String[] words = {"hello" ,  "programme" , "java" , "life" , "good" ,"world" ,"people" };
        boolean[] usedWord = new boolean[words.length];
        String isContinue = "n";
        do
        {
            int random = (int)(Math.random()*words.length);
            while(usedWord[random]) { random = (int)(Math.random()*words.length); }
            usedWord[random] = true;
            String word = words[random];
            String roundingWord = "";
            for(int i = 0 ; i<word.length(); i++) { roundingWord += "*"; }
            int counter = 0 ;
            while(!word.equals(roundingWord))
            {
                System.out.printf("(Guess) Enter a letter in word %s : ",roundingWord);
                char guess = input.next().charAt(0);
                if(roundingWord.indexOf(guess)==-1)
                {
                    if(word.indexOf(guess)>-1)
                    {
                        String newStr = "";
                        for(int i = 0 ; i<word.length() ; i++)
                        {
                            if(word.charAt(i)== guess)
                            {
                                newStr += guess;
                            }
                            else
                            {
                                newStr += roundingWord.charAt(i);
                            }
                        }
                        roundingWord = newStr;
                    }
                    else
                    {
                        System.out.printf("\t%c is not in the word\n", guess);
                        counter++;
                    }
                }else
                {
                    System.out.printf("\t%c is already in the word\n", guess);
                }     
            }
            System.out.printf("The word is %s. You missed %d time.\n",word,counter);
           System.out.print("Do you want to guess another word? enter y or to exit enter any key : ");
           isContinue = input.next();
           System.out.println("-------------");
        }while(isContinue.equals("y"));

    }
}
