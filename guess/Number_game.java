package guess;
import java.util.Random;
import java.util.Scanner;
public class Number_game {
    public static void game() {
        int number;
        Random random = new Random();
        number = random.nextInt(100);
        number = number + 1;
        System.out.println(number);
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Guess the Number: ");    
            
                if(sc.hasNextInt()) {
                	int guess = sc.nextInt();
                	if (guess == number) {
                		System.out.println("Congratulations! Your guess is correct.");
                		System.out.println("You guessed correct answer in " + i + " attempts.");
                		System.out.println("Your Score is: " + (10-i)*100 + "points");
                		break;
                		} 
                	else if (guess > number) {
                		System.out.println("Sorry, but you guess is too high.");
                		System.out.println("please try to enter less value next time.");
                		}
                	else if (guess < number) {
                		System.out.println("Sorry, but you guess is too low.");
                		System.out.println("please try to enter higher value next time.");
                		}
                	}
                else {
                	System.out.println("Out of range");
                	sc.next();
                	}
                }
        System.out.println("The correct number was: " + number);
        //System.out.println("Game Over");
        }
    public static void main(String[] args) {
        game();
        while (true) {
            System.out.println("Do you want to play agin?(Y/N)");
            Scanner sb = new Scanner(System.in);
            String again = sb.nextLine();
            if (again.equalsIgnoreCase("y")) {
                game();
                } 
            else {
                System.out.println("Game Over");
                break;
            }
        }
    }
}