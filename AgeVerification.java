import java.util.Scanner;

public class AgeVerification
{
    /**
     * @param args the command line arguements
     */
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();
                if (age >= 21)
                {
                    System.out.println("Congratulations! You get a wristband.");
                }
                else
                {
                    System.out.println("Sorry, you must be 21 or older to get a wristband.");
                }

                scanner.close();

    }

}
