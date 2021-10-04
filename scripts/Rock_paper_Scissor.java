//package 
import java.awt.desktop.SystemSleepEvent;
import java.util.Random;
import java.util.Scanner;

public class Rock_paper_Scissor {
    public static void main(String[] args) {
        System.out.println("HELLO GUYS LET'S PLAY THE GAME OF ROCK PAPER AND SCISSOR.");
        System.out.println();
        System.out.println("So the rule of game is very simple...On the count of 1 2 3 you the type RC for ROCK " +
                "SC for SCISSOR and PA for PAPER");
        System.out.println("First to score 5 point wins!!");
        System.out.println("Lets play the game");
        int i=0,pi=0,pc=0;
        String [] li ={"RC","PA","SC"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.print("");
        System.out.println("Initial Score: LAPPIE= "+ pc +" "+ name + "= 0");
        System.out.print("");

        while (pi<5 && pc<5) {
            System.out.println("Round " + (i + 1) + ":");
            System.out.println("RC PA SC.....Enter your choice:");
            String imp = input.nextLine();
            Random random = new Random();
            String ch = li[random.nextInt(li.length)];
            System.out.println(ch);

            if (ch.equals(imp))
                System.out.println("Draw, so the score remain same! ");

            else {
                if (ch.equals("RC")) {
                    if (imp.equals("PA")) {
                        pi = pi + 1;
                        System.out.println("You won.");
                    }
                    else if (imp.equals("SC")) {
                        pc = pc + 1;
                        System.out.println("LAPPIE won.");
                    }
                }
                else if (ch.equals("PA")) {
                    if (imp.equals("SC")) {
                        pi = pi + 1;
                        System.out.println("You won.");
                    }
                    else if (imp.equals("RC")) {
                        pc = pc + 1;
                        System.out.println("LAPPIE won.");
                    }
                }
                else if (ch.equals("SC")) {
                    if (imp.equals("RC")) {
                        pi = pi + 1;
                        System.out.println("You won.");
                    }
                    else if (imp.equals("PA")) {
                        pc = pc + 1;
                        System.out.println("LAPPIE won.");
                    }
                }
            }
            System.out.println("LAPPIE = " + pc + " and " + name + "= " + pi);
            i = i + 1;
            System.out.println("");
        }
        if (pi == 5)
            System.out.println("Congo! You won.");
        else
            System.out.println("Hurray! LAPPIE won");

    }


}
