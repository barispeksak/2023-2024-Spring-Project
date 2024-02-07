import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int menuInput;
        boolean cont = true;

        System.out.println("enter method:\n1. Find Maximum\n2. Find Minimum\n3. Find The Avarage\n4. Find Sums(odds and evens)\n5. exit");
        menuInput = in.nextInt();
        while (cont) {
            if(menuInput == 1)// find maximum
            {

            }

            else if(menuInput == 2)// find minimum
            {

            }

            else if(menuInput == 3)//find avarage
            {

            }

            else if (menuInput == 4)//find sums
            {
                
            }

            else if (menuInput == 5) // exit
            {
                cont = false;
            }
        }
        
        in.close();
    }
}