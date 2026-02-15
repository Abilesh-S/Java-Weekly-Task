package com.kovanlabs.intern.week.task.day15nio;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static com.kovanlabs.intern.week.task.day15nio.LoadandSaveState.battleRound;

class GameState implements Serializable {

    private static final long serialVersionUID = 1L;

    private Characther player1;
    private Characther player2;
    private Characther player3;

    public GameState(Characther player1, Characther player2 ,  Characther player3) {
        this.player1 = player1;
        this.player2 = player2;
        this.player3 = player3;
    }

    public Characther getPlayer1() {
        return player1;
    }

    public Characther getPlayer2() {
        return player2;
    }

    public Characther getPlayer3() {
        return player3;
    }
}


public class ObjectSerialization {
    private static Characther player1, player2, player3;
    private static String fileLocation = "C:\\Users\\abile\\IdeaProjects\\Java-Weekly-Task\\src\\com\\kovanlabs\\intern\\week\\task\\day15nio\\battle.dat";
    private static void createFile(){
        Path gameSaveFile = Paths.get(fileLocation);
        if(!Files.exists(gameSaveFile)){
            try{
                Files.createFile(gameSaveFile);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else{
            System.out.println("File already exists");
        }
    }

    public static void display(){
        System.out.println("\nHealth Status\nPlayer 1 (Warrior) : " + player1.health+"\nPlayer 2 (Mage) : " + player2.health+"\nPlayer 3 (Rogue) : " + player3.health+"\n");
    }

    public static void main(String[] args) {
        createFile();
        player1 = new Warrior();
        player2 = new Mage();
        player3 = new Rogue();

//        Round - 1 Fight
        System.out.println("Round - 1");
        System.out.println("Attack Status");
        battleRound(player1 , player2 ,player3 );
        display();
        GameState saveState = new GameState(player1, player2 , player3);
        LoadandSaveState.savestate(saveState);

//        Round - 2 Fight
        System.out.println("Round - 2");
        System.out.println("Attack Status");
        battleRound(player1 , player2 ,player3 );
        display();

        System.out.println("Loading back to Round 1 Battle Results");
        GameState loadState = LoadandSaveState.loadGameState();
        player1  = loadState.getPlayer1() ;
        player2  = loadState.getPlayer2() ;
        player3  = loadState.getPlayer3() ;
        display();
    }
}
