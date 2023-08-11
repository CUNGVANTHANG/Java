package chapter_12;

import java.util.Scanner;

class Board {
    int count = 0;
    String board[] = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
    void printBoard() {
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2] + "\t\t\t" + " " + "1" + " | " + "2" + " | " + "3");
        System.out.println("-----------" + "\t\t\t" + "-----------");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5] + "\t\t\t" + " " + "4" + " | " + "5" + " | " + "6");
        System.out.println("-----------" + "\t\t\t" + "-----------");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8] + "\t\t\t" + " " + "7" + " | " + "8" + " | " + "9");
    }

    Boolean updateBoard(int position, String choose) {
        if (board[position - 1] == " ") {
            board[position - 1] = choose;
            count++;
            return true;
        }

        else {
            System.out.println("Position already selected. Select another position.");
            return false;
        }
    }

    Boolean checkDraw() {
        if (count == 9) {
            return true;
        }
        else {
            return false;
        }
    }

    Boolean checkWinner(String choose) {
        if (
            (board[0] == choose && board[1] == choose && board[2] == choose) || 
            (board[3] == choose && board[4] == choose && board[5] == choose) || 
            (board[6] == choose && board[7] == choose && board[8] == choose) || 
            (board[0] == choose && board[3] == choose && board[6] == choose) || 
            (board[1] == choose && board[4] == choose && board[7] == choose) || 
            (board[2] == choose && board[5] == choose && board[8] == choose) || 
            (board[0] == choose && board[4] == choose && board[8] == choose) || 
            (board[2] == choose && board[4] == choose && board[6] == choose)
        ) {
            return true;
        }
        else {
            return false;
        }
    }
}

class Player {
    String name;
    String choose;
    
    Player(String choose) {
        Scanner input = new Scanner(System.in);
        this.choose = choose;
        if (choose.equals("X")) {
            System.out.println("Player chooses X, enter your name: ");
            name = input.nextLine();
        }
        else {
            System.out.println("Player chooses O, enter your name: ");
            name = input.nextLine();
        }
    }
}

class Game2 {
    Board board = new Board();
    Player player1 = new Player("X");
    Player player2 = new Player("O");
    Player currentPlayer = player1;

    void play() {
        System.out.println("\nWelcome to the game\n");
        board.printBoard();
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("\n" + currentPlayer.name + " choose " +  currentPlayer.choose + " enter the position (1 - 9):");
            int position = input.nextInt();
            if (board.updateBoard(position, currentPlayer.choose)) {
                board.printBoard();
                
                if (board.checkWinner(currentPlayer.choose)) {
                    System.out.println("\n" + currentPlayer.name + " win game!");
                    break;
                }
                else if (board.checkDraw()) {
                    System.out.println("\n2 player draw game");
                    break;
                }

                else {
                    if (currentPlayer == player1) {
                        currentPlayer = player2;
                    }
                    else {
                        currentPlayer = player1;
                    }
                }
                
            }
        }
    }
}

public class Du_an_co_ca_ro {
    public static void main(String[] args) {
        Game2 game = new Game2();
        game.play();
    }
}
