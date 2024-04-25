package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Character dummy = new Character("prototype");
        Game test = new Game(dummy);
        String command ="";
        Scanner scanner= new Scanner(System.in);

        while(!command.equals("exit")){
            command= scanner.nextLine();

            if (command.isEmpty()){
                Policies.nullPolicy();
                continue;
            }
            if(Policies.movementCommand(command)){
                test.createRoom();
                test.walk(command);
                test.feedback("move");
                dummy= test.getPlayer();
                continue;

            } else if (Policies.utility(command)) {
                test.feedback(command);
                continue;
            }
            Policies.gameOver(dummy);
            test.feedback(command);





        }




    }
}
