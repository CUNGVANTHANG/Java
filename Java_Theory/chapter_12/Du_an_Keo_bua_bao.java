package chapter_12;

import java.util.Scanner;

class Game1 {
    Scanner input = new Scanner(System.in);

    String getComputerPick() {
        String computerPick;
        int randomPick = (int) (Math.random() * 3) + 1;
        switch (randomPick) {
            case 1:
                computerPick = "rock";
                break;
            case 2:
                computerPick = "paper";
                break;
            case 3:
                computerPick = "scissors";
                break;
            default:
                computerPick = "";
                System.out.println("Invalid!");
        }
        return computerPick;
    }

    String getUserPick() {
        
        System.out.println("Enter rock, paper or scissors:");
        String userPick;

        while (true) {
            userPick = input.nextLine();
            if (
                userPick.equalsIgnoreCase("rock") ||
                userPick.equalsIgnoreCase("paper") ||
                userPick.equalsIgnoreCase("scissors")
            ) {
                break;
            } else {
                System.out.println("Please choose 3 options: rock, paper, scissors");
            }
        }

        
        return userPick;
    }

    String getResult(String computerPick, String userPick) {
        String result = "win";
        if (computerPick.equalsIgnoreCase(userPick)) {
            result = "draw";
        }
        else if (
            computerPick.equalsIgnoreCase("rock") && 
            userPick.equalsIgnoreCase("paper")
        ){}
        else if (
            computerPick.equalsIgnoreCase("paper") && 
            userPick.equalsIgnoreCase("scissors")
        ){}
        else if (
            computerPick.equalsIgnoreCase("scissors") && 
            userPick.equalsIgnoreCase("rock")
        ){}
        else {
            result = "lose";
        }
        return result;
    }

    void notification(String message) {
        System.out.println(message);
    }

    void play() {
         control();
    }

    void control() {
        String choose;
        while (true) {
            notification("Welcome to the game");
            String computerPick = getComputerPick();
            String userPick = getUserPick();
            String result = getResult(computerPick, userPick);
            notification("Computer Choose: " + computerPick);
            notification("You Choose: " + userPick);
            notification("Result: You " + result);
            notification("Continue: C\tExit: E");
            choose = input.nextLine();
            notification("\n\n");

            if (choose.equalsIgnoreCase("E")) {
                break;
            }
        }
        input.close();
    }
}

class Du_an_Keo_bua_bao {
    public static void main(String[] args) {
        Game1 game = new Game1();
        game.play();
    }
}