package exc6;

import java.util.Scanner;

public class Exc6 
{
    public static int[] arrayConverter(String str)
    {
        String[] array = str.split(" ");
        int[] list = new int[array.length];
        for(int i = 0 ; i< array.length ; i++)
        {
            list[i] = Integer.parseInt(array[i]);
        }
        return list;
    }
    public static int[] merge(int[] list1, int[] list2)
    {
        int[] newArray = new int[list1.length+list2.length];
        int i = 0 ;
        while(i<list1.length)
        {
            newArray[i] = list1[i];
            i++;
        }
        int k = 0;
        while(k<list2.length)
        {
            newArray[i+k] = list2[k];
            k++;
        }
        for(i = 0 ; i<newArray.length ; i++)
        {
            for(k=0 ; k<newArray.length ; k++)
            {
                if(newArray[i]<newArray[k])
                {
                    int swap  = newArray[i];
                    newArray[i] = newArray[k];
                    newArray[k] = swap;
                }
            }
        }
        return newArray;
    }
    public static void arrayWriter(int[] list, String listName)
    {
        System.out.printf("%s is ",listName);
        for(int i=0 ; i<list.length ; i++)
        {
            System.out.print(list[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1 contents : ");
        int[] list1 = arrayConverter(input.nextLine());
        System.out.print("Enter list2 contents : ");
        int[] list2 = arrayConverter(input.nextLine());
        int[] mergedList = merge(list1, list2);
        arrayWriter(list1, "list1");
        arrayWriter(list2, "list2");
        arrayWriter(mergedList, "The merged list");
    
    }
}
/*
1 5 16 61 111
2 4 5 6
*/