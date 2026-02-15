package com.kovanlabs.intern.week.task.day15nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LoadandSaveState {

    private static String fileLocation = "C:\\Users\\abile\\IdeaProjects\\Java-Weekly-Task\\src\\com\\kovanlabs\\intern\\week\\task\\day15nio\\battle.dat";
    public static void savestate(GameState gameState){
        try(ObjectOutputStream saveOperation = new ObjectOutputStream(new FileOutputStream(fileLocation)))
        {
            saveOperation.writeObject(gameState);
            System.out.println("Saved GameState");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static GameState loadGameState(){
        try(ObjectInputStream loadOperation = new ObjectInputStream(new FileInputStream(fileLocation))){
            return (GameState) loadOperation.readObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static GameState battleRound(Characther player1, Characther player2 , Characther player3){
        player1.attack(player2);
        player2.attack(player3);
        player3.attack(player3);
        GameState rounds = new GameState(player1, player2, player3);
        return rounds;
    }
}
