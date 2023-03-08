package com.bridgelabz;
import java.util.Scanner;
public class TicTacToe{
    static String p1,p2 ;
    static int headsTailsCHoice,ans,turn=0,turn2=0;;
    static String p1charater,p2character;
    static String board[][] = new String[4][4];
    public static void chooseYourChar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the player1:- ");
        p1=sc.next();
        System.out.println("ENter name of the player2:- ");
        p2=sc.next();
        System.out.println(p1+" Please choose your character : \t 1) X \t press 2) O \t" );
        p1charater = sc.next();
        System.out.println(p2+" Please choose your character : \t 1) X \t press 2) O \t ");
        p2character=sc.next();
    }
    public static void HeadsTails() {
        Scanner sc = new Scanner(System.in);
        ans = (int) Math.floor(Math.random() * 10 % 2);
//        System.out.println(ans);
        System.out.println(p1 + "what you want heads or tails");
        System.out.println("Enter your choice \t press 0) Heads \t press 1) Tails ");
        headsTailsCHoice = sc.nextInt();
        if(headsTailsCHoice==ans)
        {
            System.out.println(p1+"Player 1 Won the toss");
            System.out.println(p1+"Got the First chance");
        }
        else {
            System.out.println(p2+"Player 2 won the toss");
            System.out.println(p2+"Got the first chance");
        }
    }
    public static void display(){
        for(int i=0;i<board.length-1;i++)
        {
            for(int j=0;j<board.length-1;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        }
        public static void player1() {
            Scanner sc = new Scanner(System.in);
            System.out.println(p1 + "Enter the location number where you want to mark your sign");
            int location = sc.nextInt();
            while(turn<=5){
            if (location == 1) {
                turn++;
                board[0][0] = p1charater;
                display();
                checkWinner();
                player2();
            } else if (location == 2) {
                turn++;
                board[0][1] = p1charater;
                display();
                checkWinner();
                player2();
            } else if (location == 3) {
                turn++;
                board[0][2] = p1charater;
                display();
                checkWinner();
                player2();
            } else if (location == 4) {
                turn++;
                board[1][0] = p1charater;
                display();
                checkWinner();
                player2();
            } else if (location == 5) {
                turn++;
                board[1][1] = p1charater;
                display();
                checkWinner();
                player2();
            } else if (location == 6) {
                turn++;
                board[1][2] = p1charater;
                display();
                checkWinner();
                player2();
            } else if (location == 7) {
                turn++;
                board[2][0] = p1charater;
                display();
                checkWinner();
                player2();
            } else if (location == 8) {
                turn++;
                board[2][1] = p1charater;
                display();
                checkWinner();
                player2();
            } else {
                turn++;
                board[2][2] = p1charater;
                display();
                checkWinner();
                player2();
            }
        }
        }
        public static void player2(){
            Scanner sc = new Scanner(System.in);
            System.out.println(p2+"Enter the location number where you want to mark your sign");
            int location = sc.nextInt();
            while(turn2<=4) {
                if (location == 1) {
                    turn2++;
                    board[0][0] = p2character;
                    display();
                    checkWinner();
                    player1();
                } else if (location == 2) {
                    turn2++;
                    board[0][1] = p2character;
                    display();
                    checkWinner();
                    player1();
                } else if (location == 3) {
                    turn2++;
                    board[0][2] = p2character;
                    display();
                    checkWinner();
                    player1();
                } else if (location == 4) {
                    turn2++;
                    board[1][0] = p2character;
                    display();
                    checkWinner();
                    player1();
                } else if (location == 5) {
                    turn2++;
                    board[1][1] = p2character;
                    display();
                    checkWinner();
                    player1();
                } else if (location == 6) {
                    turn2++;
                    board[1][2] = p2character;
                    display();
                    checkWinner();
                    player1();
                } else if (location == 7) {
                    turn2++;
                    board[2][0] = p2character;
                    display();
                    checkWinner();
                    player1();
                } else if (location == 8) {
                    turn2++;
                    board[2][1] = p2character;
                    display();
                    checkWinner();
                    player1();
                } else {
                    turn2++;
                    board[2][2] = p2character;
                    display();
                    checkWinner();
                    player1();
                }
            }
        }
public static void get_input() {
        if (headsTailsCHoice == ans) {
                player1();
            }
         else {
            player2();
        }

    }
    public static void checkWinner(){
        // Hori for x
        if(board[0][0]+board[0][1]+board[0][2]=="XXX"&&board[0][0]+board[0][1]+board[0][2]=="X X X")
        {
            System.out.println(p1+"won the game");
        } else if (board[1][0]+board[1][1]+board[1][2]=="XXX"&&board[1][0]+board[1][1]+board[1][2]=="X X X") {
            System.out.println(p1+"won the game");
        } else if (board[2][0]+board[2][1]+board[2][2]=="XXX"&&board[2][0]+board[2][1]+board[2][2]=="X X X") {
            System.out.println(p1+"won the game");
        }
        // hori for O
        else if (board[0][0]+board[0][1]+board[0][2]=="OOO"&&board[0][0]+board[0][1]+board[0][2]=="O O O") {
            System.out.println(p2+"won the game");
        } else if (board[1][0]+board[1][1]+board[1][2]=="OOO"&&board[1][0]+board[1][1]+board[1][2]=="O O O") {
            System.out.println(p2+"won the game");
        } else if (board[2][0]+board[2][1]+board[2][2]=="OOO"&&board[2][0]+board[2][1]+board[2][2]=="O O O") {
            System.out.println(p2+"won the game");
        }
// vertical for x
        else if (board[0][0]+board[1][0]+board[2][0]=="XXX"&&board[0][0]+board[1][0]+board[2][0]=="X X X") {
            System.out.println(p1+"won the game");
        } else if (board[0][1]+board[1][1]+board[2][1]=="XXX"&&board[0][1]+board[1][1]+board[2][1]=="X X X") {
            System.out.println(p1+"won the game");
        } else if (board[0][2]+board[1][2]+board[2][2]=="XXX"&&board[0][2]+board[1][2]+board[2][2]=="X X X") {
            System.out.println(p1+"won the game");
        }
// vertical for o
        else if (board[0][0]+board[1][0]+board[2][0]=="OOO"&&board[0][0]+board[1][0]+board[2][0]=="O O O") {
            System.out.println(p2+"won the game");
        } else if (board[0][1]+board[1][1]+board[2][1]=="OOO"&&board[0][1]+board[1][1]+board[2][1]=="O O O") {
            System.out.println(p2+"won the game");
        } else if (board[0][2]+board[1][2]+board[2][2]=="OOO"&&board[0][2]+board[1][2]+board[2][2]=="O O O") {
            System.out.println(p2+"won the game");
        }
        // cross line check for x
        else if (board[0][0]+board[1][1]+board[2][2]=="XXX"&& board[0][0]+board[1][1]+board[2][2]=="X X X") {
            System.out.println(p1+"won the game");
        } else if (board[0][2]+board[1][1]+board[2][0]=="XXX"&&board[0][2]+board[1][1]+board[2][0]=="X X X") {
            System.out.println(p1+"won the game");
        }
//cross line for o check
        else if (board[0][0]+board[1][1]+board[2][2]=="OOO"&&board[0][0]+board[1][1]+board[2][2]=="O O O") {
            System.out.println(p2+"won the game");
        } else if (board[0][2]+board[1][1]+board[2][0]=="OOO"&&board[0][2]+board[1][1]+board[2][0]=="O O O") {
            System.out.println(p2+"won the game");
        }
    }
    public static void main(String[] args) {
        board[0][0]="1";
        board[0][1]="2";
        board[0][2]="3";
        board[1][0]="4";
        board[1][1]="5";
        board[1][2]="6";
        board[2][0]="7";
        board[2][1]="8";
        board[2][2]="9";
        chooseYourChar();
        HeadsTails();
        display();
        get_input();
    }
}