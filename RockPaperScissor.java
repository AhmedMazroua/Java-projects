//imoports libraries needed.
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor{
    public static void main(String[] args){
        String[] rps = {"rock", "paper", "scissor"};
        String computer = rps[new Random().nextInt(rps.length)];

        Scanner scanner = new Scanner(System.in);
        String player;

        while(true){
            System.out.println("Enter rock, paper, or scissor");
            player = scanner.nextLine();
            if (player.equals("rock") || player.equals("paper") || player.equals("scissor")){
                break;
            }
            System.out.println(player + " is not a valid input");
        }
        System.out.println("The computer chose " + computer);

        if (player.equals(computer)){
            System.out.println("Tie!");
        }
        else if (player.equals("rock") && computer.equals("paper")){
            System.out.println("You lost!");

        }
        else if (player.equals("paper") && computer.equals("rock")){
            System.out.println("You won!");
        }
        else if (player.equals("scissor") && computer.equals("paper")){
            System.out.println("You won!");
        }
        else if (player.equals("paper") && computer.equals("scissor")){
            System.out.println("You lost!");
        }
        else if (player.equals("rock") && computer.equals("scissor")){
            System.out.println("You won!");
        }
        else if (player.equals("scissor") && computer.equals("rock")){
            System.out.println("You lost!");
        }
        scanner.close();
    }
}