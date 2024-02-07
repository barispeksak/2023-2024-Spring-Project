/**
 * TaskD
 */
public class TaskD {

    public static void main(String[] args) {
        
    }

    public int[] differences(int[] numbers)
    {
        int total = 0;
        for(int number : numbers)
        {
            total += number;
        }
        int avarage = total / numbers.length;

        int[] newArray = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) 
        {
            newArray[i] = numbers[i] - avarage;
        }

        return newArray;
    }

}