import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor_Game{
    public static void main (String args[]){  
   //int rock = 0;
   //int paper = 1;
   //int scissor = 2;
System.out.println("Let's play Rock, Paper, Scissor !!");
System.out.println("Please choose your move from the available moves: 0 for Rock, 1 for Paper, 2 for Scissor. ");
System.out.print("Enter the move you choose : ");  
Scanner sc = new Scanner(System.in);
int userinput = sc.nextInt();

Random rnd = new Random();
int computerinput = rnd.nextInt(3);

if(computerinput==userinput){
    System.out.println("\nMatch Draw!!No one win or lose.\n");
}
else if(computerinput==0 && userinput==1 || computerinput==1 && userinput==2 || computerinput==2 && userinput==0){
    System.out.println("\nCongratulation !! You Wins...\n");
}
else {
    System.out.println("\nComputer Wins !\n");
}

System.out.println("Computer choice is : " +computerinput);

if(computerinput==0){
    System.out.println("Computer choice is Rock.\n");
    }
 else if(computerinput==1){
    System.out.println("Computer choice is Paper.\n");
 } 
 else{
    System.out.println("Computer choice is Scissor.\n");
 }  
}
}
