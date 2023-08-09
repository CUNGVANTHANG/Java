package chapter_7;

import java.util.Scanner;

public class Du_an_keo_bua_bao {
    String getComputerChoice() {
        String computerChoice;
        int randomNumber = (int) (Math.random() * 3) + 1;
        switch (randomNumber) {
            case 1:
                computerChoice = "rock";
                break;
            case 2: 
                computerChoice = "paper";
                break;
            case 3:
                computerChoice = "scissors";
                break;
            default:
                System.out.println("Invalid!");
                computerChoice = "";
        }
        return computerChoice;
    }

    String getUserInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rock, paper or scissors:");
        String userInput = input.nextLine();
        userInput = userInput.toLowerCase();
        input.close();
        return userInput;
    }

    String getResult(String computerChoice, String userInput) {
        String result = "win";
        if (userInput.equals(computerChoice)) {
            result = "draw";
        }
        else if (userInput.equals("paper") && computerChoice.equals("rook")) {}
        else if (userInput.equals("rook") && computerChoice.equals("scissors")) {}
        else if (userInput.equals("scissors") && computerChoice.equals("paper")) {}
        else {
            result = "lose";
        }
        return result;
    }

    void playGame() {
        String computerChoice = getComputerChoice();
        String userInput = getUserInput();
        String result = getResult(computerChoice, userInput);
        System.out.println("computerChoice: " + computerChoice + ", " + "userInput: " + userInput + ", Result: " + result);
    }

    public static void main(String[] args) {
        Du_an_keo_bua_bao obj = new Du_an_keo_bua_bao();
        obj.playGame();
    }
}
