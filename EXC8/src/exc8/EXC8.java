package exc8;

public class EXC8 
{
    public static void main(String[] args) 
    {
        int[] row = {1,2,3,4,5,6,7,8};
        int[] column = new int[8];
        boolean[] usedColumns  = new boolean[8];
        column[0] = 1+ (int)(Math.random()*8);
        usedColumns[column[0]-1] = true;
        for(int i = 1 ; i<column.length ; i++)
        {
            boolean appropriateColumn = true;
            while(appropriateColumn)
            {
                column[i] = 1+ (int)(Math.random()*8);
                if(usedColumns[column[i]-1])
                {
                    appropriateColumn = true;
                    continue;
                }
                else if(!(Math.abs(column[i-1]-column[i])>1))
                {
                    appropriateColumn = true;
                    continue;
                }
                else
                {
                    appropriateColumn = false;
                    break;
                }
            }
            usedColumns[column[i]-1]=true;
        }
        String str = "";
        for(int i = 0 ; i<row.length;i++)
        {
            for(int j = 0; j<row.length ; j++)
            {
                if(row[j]==i+1)
                {
                    for(int k = 1; k<=8 ; k++ )
                    {
                      if(column[j]==k)
                      {
                          str+="|Q";
                      }
                      else
                      {
                          str+="| ";
                      }
                    }
                    str+="|\n";
                }       
            }
        }
        System.out.println(str);
    }
}
