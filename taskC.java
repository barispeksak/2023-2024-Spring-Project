
public class taskC {

    public static void main(String[] args)
    {
        int[] customArray = { 1,2,3,4,5,6,7,8,9,10 };
        System.out.println( theBiggestOfArray(customArray) );
        System.out.println( theSmallestOfArray(customArray) );
   
    }
    public  static int theBiggestOfArray (int[] givenArray)
    {
        int biggestNum = givenArray[0];
        for(int num: givenArray)
        {
            if (num > biggestNum)
            {
                biggestNum = num;
            }
        }
        return biggestNum;
    }

    public static int theSmallestOfArray (int[] givenArray)
    {
        int smallestNum = givenArray[0];
        for(int num: givenArray)
        {
            if (num < smallestNum)
            {
                smallestNum = num;
            }
        }
        return smallestNum;
    }
}

    