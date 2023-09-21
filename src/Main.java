import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your party (case sensitive): ");
        System.out.println("D for democrat");
        System.out.println("R for Republican");
        System.out.println("I for Independent");
        System.out.println("Other affiliation: ");

        char choice = scanner.next().charAt(0);

        if (choice == 'D')
        {
            System.out.println("You get a Democratic Donkey!");
        }
        else if (choice == 'R')
        {
            System.out.println("You get a Republican Elephant!");
        }
        else if (choice == 'I')
        {
            System.out.println("You get an Independant Person!");
        }
        else
        {
            System.out.println("You get an other party!");
        }
        scanner.close();
    }
}