import java.util.Scanner;

public class BirthMonth {
    /**
     * @param args the command line arguement
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Birth Month : ");
        int birthMonth = in.nextInt();

        if (birthMonth >= 1 && birthMonth <= 12)
        {
            System.out.println("Your Birth Month is : " + birthMonth);

        }
        else
        {
            System.out.println("You have entered an incorrect month value:" + birthMonth);


        }
    }
}