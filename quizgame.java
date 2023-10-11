import java.util.Scanner;

public class quizgame{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Quiz Game!");
        System.out.println("Quiz based on Java Programming!");
        System.out.println("Answer the following multiple-choice questions:\n");

     
        System.out.println("1. What is the main purpose of Java?");
        System.out.println("A) Web development");
        System.out.println("B) Game development");
        System.out.println("C) Object-oriented programming");
        System.out.println("D) Data analysis");
        System.out.print("Your answer: ");
        String answer1 = scanner.nextLine().toUpperCase();

        if (answer1.equals("C")) {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is C) Object-oriented programming.\n");
        }

       
        System.out.println("2. Which keyword is used to define a class in Java?");
        System.out.println("A) class");
        System.out.println("B) type");
        System.out.println("C) object");
        System.out.println("D) struct");
        System.out.print("Your answer: ");
        String answer2 = scanner.nextLine().toUpperCase();

        if (answer2.equals("A")) {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is A) class.\n");
        }

        
        System.out.println("3.  What is the default value of a boolean in Java?");
        System.out.println("A) True");
        System.out.println("B) False");
        System.out.println("C) 0");
        System.out.println("D) 1");
        System.out.print("Your answer: ");
        String answer3 = scanner.nextLine().toUpperCase();

        if (answer3.equals("A")) {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is A) True.\n");
        }

        
        System.out.println("4.Which loop is used to iterate a specific number of times in Java?");
        System.out.println("A) while");
        System.out.println("B) do-while");
        System.out.println("C) for");
        System.out.println("D) switch");
        System.out.print("Your answer: ");
        String answer4 = scanner.nextLine().toUpperCase();

        if (answer4.equals("C")) {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is C) for.\n");
        }

        
        System.out.println("5. Which data type is used to store a single character in Java?");
        System.out.println("A) char");
        System.out.println("B) string");
        System.out.println("C) int");
        System.out.println("D) double");
        System.out.print("Your answer: ");
        String answer5 = scanner.nextLine().toUpperCase();

        if (answer5.equals("A")) {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is A) char.\n");
        }

       
        System.out.println("Your final score is: " + score + " out of 5.");
        if (score>3 && score<=5){
            System.out.println("Congratulation! You won the game.");
            }
                else{
                    System.out.println("Ohh! You lost the game.");
                }
        

        scanner.close();
    }
}
