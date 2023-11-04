package quiz;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

class QuizApplication {

	    static Timer timer;
	    private static int timeLimit = 30;    // Time limit
	    private static boolean timeUp = false;

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Set up the timer
	        timer = new Timer();
	        timer.schedule(new TimerTask() {
	            @Override
	            public void run() {
	                timeUp = true;
	                System.out.println("Time up!!!!!!");
	            }
	        }, timeLimit * 1000);

	        // Questions & Answers
	        String[] questions = {
	            "How many days do we have in a week? ",
	            "Which animal is known as the ‘Ship of the Desert? ",
	            "Which is the largest mammal? ",
	            "What type of gas do plants absorb? ",
	            "Which way is anti-clockwise, left or right? ",
	            "How many years are there in one Millenium? ",
	            "Which is the smallest continent? ",
	        };

	        String[][] options = {
	            {"A) 28", "B) 7", "C) 14", "D) 30"},
	            {"A) Elephant", "B) Deer", "C) Lion", "D) Camel"},
	            {"A) Shark", "B) Elephant", "C) Blue Whale", "D) Human"},
	            {"A) Hydrogen", "B) Nitrogen", "C) Oxigen", "D) Carbon dioxide"},
	            {"A) Left", "B) Right", "C) Both", "D) None"},
	            {"A) 100,000", "B) 100", "C) 1,000", "D) 10,000"},
	            {"A) Europe", "B) Australia", "C) Asia", "D) Antarctica"},
	        };

	        String[] answers = {
	            "B",
	            "D",
	            "C",
	            "D",
	            "A",
	            "C",
	            "B",
	        };

	        int score = 0;
	        for (int i = 0; i < questions.length; i++) {
	            if (timeUp) {
	                break;
	            }
	            System.out.println("Question " + (i + 1) + ": " + questions[i]);
	            for (int j = 0; j < options[i].length; j++) {
	                System.out.println(options[i][j]);
	            }

	            System.out.print("Enter your answer (A, B, C, or D): ");
	            String userAnswer = scanner.nextLine().trim().toUpperCase();

	            if (userAnswer.equals(answers[i])) {
	                score++;
	                System.out.println("Correct!");
	            } else {
	                System.out.println("Incorrect. The correct answer is: " + answers[i]);
	            }
	        }
	        timer.cancel();

	        System.out.println("Quiz is over!");
	        System.out.println("Your score is: " + score + " out of " + questions.length);
	    }
	}
