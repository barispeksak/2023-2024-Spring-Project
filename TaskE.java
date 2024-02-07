public class TaskE 
{
 /*  public static void main(String[] args) 
    {
        int [] merhaba = {1,2,3,4,5,6,7,8,9,10};
        
    }*/
    public static int ToFindSumOfEven (int[] merhaba)
    {
        
        int sumOfEven = 0;
        for(int i = 0 ; i < merhaba.length ; i++)
        {
            if(i % 2 == 0)
            {
                sumOfEven += merhaba[i];
            }
            
        }
        return sumOfEven;
    }
    public static int ToFindSumOfOdd (int[] merhaba)
    {
        int sumOfOdd = 0;
        for(int i = 0 ; i < merhaba.length ; i++)
        {
            if(i % 2 != 0)
            {
                sumOfOdd += merhaba[i];
            }
            
        }
        return sumOfOdd;
    }

}