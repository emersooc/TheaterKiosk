import java.util.Scanner;

public class TheaterKiosk
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in); //creates scanner object
        System.out.println("Please enter your age: ");
        int age = userInput.nextInt(); //reads user input

        //determines if they are 21 or older and acts accordingly
        if (age >= 21)
        {
            System.out.println("Please take a wristband");
        }
    }
}