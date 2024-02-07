public class TaskA;
{
    public static void main(String[] args)
    {
        int[] randomArray;

        public static int[] formArray(int[] randomArray, int arraySize)
        {
            for(int a = 0; a < arraySize; a++)
            {
                randomArray[a] = Math.random(100);
            }

            return randomArray;
        }
    }
}
