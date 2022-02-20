

import java.util.Scanner;

/**
 * Hello world!
 *
 */

public class fsd
{
    public static void main(String[] args )
    {

        String choice;
        Scanner in = new Scanner(System.in);
        System.out.println("What is your favourite season [Spring or Autumn]");
        choice = in.nextLine();
        System.out.println(getReward(choice));
    }


    public static String getReward(String choice)
    {
        if(choice.equals("spring")) return choice;
        else return choice;
    }
}


