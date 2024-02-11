import java.util.Scanner;

public class CoffeeQuiz {
    public static void main(String[] args){
        int score = 0;
        int questions = 5;

        System.out.println("Welcome to coffee quiz, ready to play?");

        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Enter yes to play");
        input = scanner.nextLine();
        if (input.toLowerCase().equals("yes")){
            System.out.println("Awesome lets play");
        }
        else{
            System.out.println("Okay, maybe next time.");
            return;
        }
        // question 1
        System.out.println("\n a latte is made with milk and shots of...?");
        input = scanner.nextLine();
        if (input.toLowerCase().equals("espresso")){
            score += 1;
            System.out.println("correct!");
        }
        else{
                System.out.println("incorrect.");
        }
        // question 2
        System.out.println("\n True or False, coffee is the most popular beverage in the world?");
        input = scanner.nextLine();
        if (input.toLowerCase().equals("false")){
            score += 1;
            System.out.println("correct!");
        }
        else{
            System.out.println("incorrect.");
        }
        // question 3
        System.out.println("\n The method of brewing espresso origiinates from what country?");
        input = scanner.nextLine();
        if (input.toLowerCase().equals("italy")){
            score += 1;
            System.out.println("correct!");
        }
        else{
            System.out.println("incorrect.");
        }
        // question 4
        System.out.println("\n Are coffee beans really beans?");
        input = scanner.nextLine();          
        if (input.toLowerCase().equals("no")){
            score += 1;
            System.out.println("correct!");
        }
        else{
            System.out.println("incorrect.");
        }
        // question 5
        System.out.println("\n Coffee House's in the 17th century were known as?");
        input = scanner.nextLine();
        if (input.toLowerCase().equals("penny universities")){
            score += 1;
            System.out.println("correct!");
        }
        else{
            System.out.println("incorrect.");
        }
       
        scanner.close();
    System.out.println("you scored " + score + "/" + questions);
    }

}
