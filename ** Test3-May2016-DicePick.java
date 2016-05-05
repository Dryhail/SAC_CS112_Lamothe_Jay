import javax.swing.JOptionPane;
import java.util.Scanner;

public class DicePick {

    public static void main(String[] args) {

        String namePlayer=null;
        String message=null;
        String playerName;

        int diceCount=0;
        int playerGuess=0;
        int play = 1;
        int[] resultArray = new int[10];

        Scanner diceplay = new Scanner(System.in);
        Scanner yourName = new Scanner(System.in);

        System.out.println("What's your name?");
        playerName=yourName.nextLine();

        System.out.println("We're playing DICE, how many dice do you want to use?: ");
        diceCount=diceplay.nextInt();


        Dice1 dice = new Dice1(playerName,diceCount,0);
        System.out.printf("Great, well hello %s,\nWelcome to the Dice Game! Good luck!\n", dice.GetName());


        Scanner rolling = new Scanner(System.in);

        do {
            System.out.println("Please make you choice:  Odd: 1  or Even: 2: ");
            playerGuess = rolling.nextInt();

            dice.DiceRoll();
            System.out.printf("Your chosen number is: %d\nAnd the system chose %d\n", playerGuess, dice.DiceNumber());

            if (playerGuess == 1 && dice.CheckResult() == 1) {
                System.out.println("You won! Congratulation");
                dice.SetPoint(1);
            } else
                System.out.println("You lost");

            Scanner keepPlaying = new Scanner(System.in);

          
            System.out.println("Do you want to continue playing?  1=Y or 2=N");
            play = keepPlaying.nextInt();
           


        }while(play==1);
        System.out.println(dice);
    }

}
