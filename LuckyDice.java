import java.util.Scanner;

public class LuckyDice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* this is a new Class called Scanner, which helps us take in User Input
         * try running this code and seeing how it works, you will need it to complete the lab
         * you may delete the example if you wish, we will learn more about the Scanner in the future
         */

        System.out.print("Enter an integer >>> "); //make sure you prompt the user and ask what you want!
        int example = scanner.nextInt();
        example++;
        System.out.println("Here is your integer plus one! >>> " + example);

        //Your code goes here
    }
}
